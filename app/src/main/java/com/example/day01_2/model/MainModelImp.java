package com.example.day01_2.model;

import com.example.day01_2.contract.MainContract;
import com.example.day01_2.utils.net.INetCallBack;

public class MainModelImp implements MainContract.IMainModel {

    @Override
    public <T> void getLonginData(String url, INetCallBack<T> callBack) {

    }
}
