package com.pface.admin.core.exception;

import com.pface.admin.core.utils.ResultCodeEnum;

public class BizException extends RuntimeException {

    private String code;

    private String msg;

    public BizException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMsg());
        this.code = resultCodeEnum.getCode();
        this.msg = resultCodeEnum.getMsg();
    }

    public String getCode() {
        return code;
    }

    public BizException setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public BizException setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
