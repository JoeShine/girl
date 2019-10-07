package com.imooc.girl.exception;

/**
 * @author by JoeShine
 * 2019/10/7
 **/
public class GirlException extends RuntimeException {
    private Integer code;

    public GirlException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
