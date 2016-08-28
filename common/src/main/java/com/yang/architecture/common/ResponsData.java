package com.yang.architecture.common;

import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 * Created by Administrator on 2016/8/21.
 */
public class ResponsData {
    public static final int SUCCESS=1;
    public static final int ERROR=0;
    private int code=1;
    private Object data;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResponsData putData(Object data){
        this.setData(data);
        return this;
    }

    public ResponsData(){}
    public ResponsData(int code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
