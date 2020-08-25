package cn.sz.twoOfGroup.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import java.nio.charset.Charset;

public class FastJsonRedisSerializer<T> implements RedisSerializer<T> {

    private ObjectMapper objectManager = new ObjectMapper();

    private Class<T> cls;

    public FastJsonRedisSerializer(Class<T> cls) {
        this.cls = cls;
    }

    @Override
    public T deserialize(byte[] bs) throws SerializationException {
        if(bs==null||bs.length<=0) {
            return null;
        }
        String str = new String(bs,Charset.forName("utf-8"));
        return JSON.parseObject(str,cls);
    }

    @Override
    public byte[] serialize(T t) throws SerializationException {
        if(t==null) {
            return new byte[0];
        }
        return JSON.toJSONString(t,SerializerFeature.WriteClassName).getBytes(Charset.forName("utf-8"));
    }

    public void setObjectManager(ObjectMapper objectManager) {
        this.objectManager = objectManager;
    }

    public JavaType getJavaType(Class cls) {
        return TypeFactory.defaultInstance().constructType(cls);
    }
}