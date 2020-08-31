package cn.sz.twoOfGroup.entity;

import java.io.Serializable;

/**
 * (StsAccuser)实体类
 *
 * @author makejava
 * @since 2020-08-31 17:18:08
 */
public class StsAccuser implements Serializable {
    private static final long serialVersionUID = 218432413837026261L;

    private Integer accuserId;

    private String userPhone;

    private String userPwd;


    public Integer getAccuserId() {
        return accuserId;
    }

    public void setAccuserId(Integer accuserId) {
        this.accuserId = accuserId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

}