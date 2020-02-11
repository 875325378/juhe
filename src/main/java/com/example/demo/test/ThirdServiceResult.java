package com.example.demo.test;

public class ThirdServiceResult {

    private ThirdReturnCode thirdReturnCode;

    private String ResponseCode;

    private String ResponseMsg;

    public ThirdReturnCode getThirdReturnCode() {
        return thirdReturnCode;
    }

    public void setThirdReturnCode(ThirdReturnCode thirdReturnCode) {
        this.thirdReturnCode = thirdReturnCode;
    }

    public String getResponseCode() {
        return ResponseCode;
    }

    public void setResponseCode(String responseCode) {
        ResponseCode = responseCode;
    }

    public String getResponseMsg() {
        return ResponseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        ResponseMsg = responseMsg;
    }
}
