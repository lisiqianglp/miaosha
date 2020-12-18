package com.miaoshaproject.error;

/**
 * 包装器业务异常类实现
 */
public class BusinessException extends Exception implements CommonError{

    private CommonError commonError;

    public BusinessException(CommonError commonError){
        super();
        this.commonError = commonError;
    }

    //接收自定义的errMsg的方法构造业务异常
    public BusinessException(CommonError commonError,String errMsg){
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errMsg);

    }

    @Override
    public int getErrorCode() {
        return this.commonError.getErrorCode();
    }

    @Override
    public String getErrorMsg() {
        return this.commonError.getErrorMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}
