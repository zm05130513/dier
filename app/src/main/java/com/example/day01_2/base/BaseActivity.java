package com.example.day01_2.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.day01_2.persenter.MainPersenterImpI;

public abstract class BaseActivity<T extends BasePersenter> extends AppCompatActivity implements BaseView {
public T persenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayotID());

        if (persenter==null){
            persenter=add();
            persenter.attachView(this);
        }
    }
    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getLayotID();

    public abstract T add();

    public abstract MainPersenterImpI getPersenter();

    public abstract void getLoginData(String string);
}
