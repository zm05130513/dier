package com.example.day01_2.utils.net;

public interface INetCallBack<T> {
    public void onSuccess(T t);
    public void onFail(String err);
}
