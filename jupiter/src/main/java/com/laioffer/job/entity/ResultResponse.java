package com.laioffer.job.entity;
//前面没有history
//别的也用这个response
//history 的response 会用 以后别的servlet也会用
public class ResultResponse {

    public String result;

    public ResultResponse() {
    }
    // contructor
    public ResultResponse(String result) {
        this.result = result;
    }
}