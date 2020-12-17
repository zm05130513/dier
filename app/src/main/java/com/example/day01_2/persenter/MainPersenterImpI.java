package com.example.day01_2.persenter;

import com.example.day01_2.base.BasePersenter;
import com.example.day01_2.contract.MainContract;
import com.example.day01_2.utils.net.INetCallBack;

public class MainPersenterImpI extends BasePersenter
implements MainContract.IMainModel {
    private MainContract.IMainModel mainModel;
    private MainContract.IMainView iMainView;
    @Override
    public <T> void getLonginData(String url, INetCallBack<T> callBack) {

    }
}
