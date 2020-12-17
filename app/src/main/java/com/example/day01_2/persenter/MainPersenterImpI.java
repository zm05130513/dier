package com.example.day01_2.persenter;

import com.example.day01_2.base.BasePersenter;
import com.example.day01_2.contract.MainContract;
import com.example.day01_2.model.MainModelImp;
import com.example.day01_2.model.UserBean;
import com.example.day01_2.utils.net.INetCallBack;

public class MainPersenterImpI extends BasePersenter<MainContract.IMainView> implements MainContract.ImainPersenter {

    private MainContract.IMainModel iMainModel;

    public MainPersenterImpI(MainContract.IMainView mainView) {
        this.iMainModel = new MainModelImp(this);

    }
    @Override
    public void login(String name,String password) {

//        URL就在P层确定,不要从Activity中传递过来
        iMainModel.getLonginData("", new INetCallBack<UserBean>() {
            @Override
            public void onSuccess(UserBean userBean) {
                iview.getData(userBean);
            }

            @Override
            public void onFail(String err) {

            }
        });
    }

    @Override
    public void loginResult(String result) {

    } 


}
