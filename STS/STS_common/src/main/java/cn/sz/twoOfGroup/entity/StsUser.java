package cn.sz.twoOfGroup.entity;

import java.io.Serializable;

/**
 * (StsUser)实体类
 *
 * @author makejava
 * @since 2020-08-31 17:33:40
 */
public class StsUser implements Serializable {
    private static final long serialVersionUID = 390158352304981668L;
    /**
     * 开户用户id
     */
    private Integer userId;
    /**
     * 手机号
     */
    private String userPhone;
    /**
     * 密码
     */
    private String userPwd;
    /**
     * 可用资金
     */
    private Double userBalance;
    /**
     * 资产
     */
    private Double userMoney;
    /**
     * 交易密码
     */
    private String userTrpwd;
    /**
     * 开户账号
     */
    private String userAccount;
    /**
     * 开户类型(0-沪a 1-深a)
     */
    private Integer userType;
    /**
     * 邮箱
     */
    private String userEmail;
    /**
     * 婚姻状况（下拉列表）
     */
    private String userMarry;
    /**
     * 银行卡卡号
     */
    private String userBank;
    /**
     * 银行卡余额
     */
    private Double userBankbanlance;
    /**
     * 所属证券公司
     */
    private String userCompany;
    /**
     * 身份证号码
     */
    private String userCard;
    /**
     * 毕业院校
     */
    private String userSchool;
    /**
     * 个人税收
     */
    private Double userIncome;
    /**
     * 职业(下拉列表，多少个自己写)
     */
    private String userWork;
    /**
     * 学历(下拉列表，多少个自己写)
     */
    private Integer userEducation;
    /**
     * 职务
     */
    private String userJob;
    /**
     * 工作单位
     */
    private String userWorkspace;
    /**
     * -省（这里使用三级联动插件）
     */
    private String userProvince;
    /**
     * 市
     */
    private String userCity;
    /**
     * 区
     */
    private String userDistrict;

    private String userAddress;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Double getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(Double userBalance) {
        this.userBalance = userBalance;
    }

    public Double getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(Double userMoney) {
        this.userMoney = userMoney;
    }

    public String getUserTrpwd() {
        return userTrpwd;
    }

    public void setUserTrpwd(String userTrpwd) {
        this.userTrpwd = userTrpwd;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserMarry() {
        return userMarry;
    }

    public void setUserMarry(String userMarry) {
        this.userMarry = userMarry;
    }

    public String getUserBank() {
        return userBank;
    }

    public void setUserBank(String userBank) {
        this.userBank = userBank;
    }

    public Double getUserBankbanlance() {
        return userBankbanlance;
    }

    public void setUserBankbanlance(Double userBankbanlance) {
        this.userBankbanlance = userBankbanlance;
    }

    public String getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }

    public String getUserSchool() {
        return userSchool;
    }

    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool;
    }

    public Double getUserIncome() {
        return userIncome;
    }

    public void setUserIncome(Double userIncome) {
        this.userIncome = userIncome;
    }

    public String getUserWork() {
        return userWork;
    }

    public void setUserWork(String userWork) {
        this.userWork = userWork;
    }

    public Integer getUserEducation() {
        return userEducation;
    }

    public void setUserEducation(Integer userEducation) {
        this.userEducation = userEducation;
    }

    public String getUserJob() {
        return userJob;
    }

    public void setUserJob(String userJob) {
        this.userJob = userJob;
    }

    public String getUserWorkspace() {
        return userWorkspace;
    }

    public void setUserWorkspace(String userWorkspace) {
        this.userWorkspace = userWorkspace;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserDistrict() {
        return userDistrict;
    }

    public void setUserDistrict(String userDistrict) {
        this.userDistrict = userDistrict;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

}