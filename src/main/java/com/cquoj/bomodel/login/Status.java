package com.cquoj.bomodel.login;

/**
 * Created by xuwei on 5/5/16.
 */
public class Status {

    public Status(){

    }
    public Status(int code,String msg){
        this.code = code;
        this.msg = msg;
    }


    private int code;
    private String msg;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
