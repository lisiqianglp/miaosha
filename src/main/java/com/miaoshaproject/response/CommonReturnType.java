package com.miaoshaproject.response;

public class CommonReturnType {
    //返回 success 或者 fail
    private String status;

    //若 status = success ,返回 data
    //若 status = fail ,返回 通用的 错误码 格式
    private Object data;

    //通用方法创建
    public static CommonReturnType create(Object result){
        return CommonReturnType.create(result,"success");
    }

    public static CommonReturnType create(Object result,String status){
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
