package com.example.boot_demo;


//The generic class `Response<T>` is defined mainly to encapsulate the result of a request. It is commonly used in real-world development, especially for data returned by Web APIs.
public class Response <T>{


    private T data;
    private boolean success;
    private String errorMsg;


    //This static generic method creates a Response object representing a successful request.
    //It accepts data of any type K and returns a Response<K> containing that data, with the success flag set to true.
    public static <K> Response<K> newSuccess(K data){
        Response<K> response=new Response<>();
        response.setData(data);
        response.setSuccess(true);
        return response;
    }


    //This static method creates a Response object representing a failed request.
    //It takes an error message as input, sets the success flag to false, and leaves the data field as null by using Void as the type parameter.
    public static Response<Void> newFail(String errorMsg){
        Response<Void> response=new Response<>();
        response.setErrorMsg(errorMsg);
        response.setSuccess(false);
        return response;
    }



    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
