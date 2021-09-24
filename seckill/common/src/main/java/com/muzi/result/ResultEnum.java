package com.muzi.result;

public enum ResultEnum {
    SUCCESS(200,"成功"),
    ERROR(500,"失败");
    private Integer code;
    private String msg;

    private ResultEnum(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public Integer getCode(){
        return this.code;
    }

    public String getMsg(){
        return this.msg;
    }
}
