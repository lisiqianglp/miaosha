package com.miaoshaproject.service.model;

public class UserModel {
    private Integer id;
    private String name;
    private Byte gender;
    private String age;
    private String telphone;
    private String registerMode;

    private String thirdPartyId;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Byte getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getTelphone() {
        return telphone;
    }

    public String getRegisterMode() {
        return registerMode;
    }

    public String getThirdPartyId() {
        return thirdPartyId;
    }

    private String encrptPassword;

    public String getEncrptPassword() {
        return encrptPassword;
    }

    public void setEncrptPassword(String encrptPassword) {
        this.encrptPassword = encrptPassword;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public void setRegisterMode(String registerMode) {
        this.registerMode = registerMode;
    }

    public void setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
    }
}
