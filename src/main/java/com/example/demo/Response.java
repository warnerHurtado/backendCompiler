package com.example.demo;

public class Response {

    private final String data;
    private final String status;

    public Response(String data, String status) {
        this.data = data;
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }


}
