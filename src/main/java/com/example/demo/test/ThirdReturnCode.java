package com.example.demo.test;

public enum ThirdReturnCode {

    /**
     * 成功
     */
    SUCCESS(20000,"成功"),

    HESSIANERROR(40000,"失败"),

    VALIDATIONERROR(30000,"参数验证错误");

    private final int code;
    private final String msg;

    ThirdReturnCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "ThirdReturnCode{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
