package com.hy.common.model;

/**
 * Author wanghaiyuan
 * Date 2019/1/5 17:34.
 */
public class RespBase {
    private int code = 0;
    private String msg;

    public static final int SUCCESS = 0;
    public static final int FAILED = 1;
    public RespBase(){
        this.code = SUCCESS;
        this.msg = "SUCCESS";
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        switch (code){
            case SUCCESS:msg="SUCCESS";
                break;
            case FAILED:msg="FAILED";
                break;
        }
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
