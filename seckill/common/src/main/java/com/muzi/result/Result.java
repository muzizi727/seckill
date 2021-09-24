package com.muzi.result;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    private Integer code;

    private String msg;

    private boolean success;

    private T data;

    public Result() {

    }

    public void setCode(Integer code) {
        this.code = code;
        if (!ResultEnum.SUCCESS.getCode().equals(code)) {
            this.success = false;
        }
    }

}
