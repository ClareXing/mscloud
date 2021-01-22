package com.xinghl.springcloud.common;


/**
 * 状态码枚举
 */
public enum ResultCode {

    SUCCESS(1,"成功") ,
    PARAM_IS_INVALID(1001,"参数无效");

    private Integer code;
    private String message;

    ResultCode(Integer code, String message){
        this.code=code;
        this.message= message;
    }
    public Integer code(){
        return this.code;
    }
    public String message(){
        return this.message;
    }
    //覆盖方法
    @Override
    public String toString()
    {
        return this.code+"-"+this.message;
    }

}
