package com.guo.myestatemanager.util;

import java.io.Serializable;

public class PageResult implements Serializable {

    private static final long serialVersionUID = -6250130355901431732L;

    private boolean flag;//是否成功
    private Integer code;//返回码
    private String message;//返回消息
    private Object data;
    private Long total;

    public PageResult() {
    }

    public PageResult(boolean flag, Integer code, String message, Object data, Long total) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
        this.total = total;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

}
