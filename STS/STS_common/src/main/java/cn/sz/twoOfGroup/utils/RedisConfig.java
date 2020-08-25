package cn.sz.twoOfGroup.utils;

import com.alibaba.fastjson.parser.ParserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.nio.charset.Charset;
@Configuration
public class RedisConfig extends CachingConfigurerSupport {

    @Autowired
    private RedisConnectionFactory factory;
    @Bean
    public RedisTemplate<String, Object> redisTemplate(){
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String,Object>();
        //指定key的序列化的类型为String类型
        redisTemplate.setKeySerializer(new StringRedisSerializer(Charset.forName("utf-8")));

        //指定value序列化的方式
        FastJsonRedisSerializer<Object> fr = new FastJsonRedisSerializer<Object>(Object.class);
        redisTemplate.setValueSerializer(fr);
        redisTemplate.setConnectionFactory(factory);
        //把指定包里面的类型添加到白名单，这样就可以实现序列化和反序列化了
//        ParserConfig.getGlobalInstance().addAccept("cn.sz.gl.pojo");
        return redisTemplate;
    }
}
