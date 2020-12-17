package com.example.day01_2.view;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.day01_2.R;
import com.example.day01_2.base.BaseActivity;
import com.example.day01_2.contract.MainContract;
import com.example.day01_2.model.UserBean;
import com.example.day01_2.persenter.MainPersenterImpI;

public class LoginActivity extends BaseActivity<MainPersenterImpI>
implements MainContract.IMainView {
    private EditText editTextTextPersonName;
    private EditText editTextTextPassword;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void initData() {
        persenter.login(getUserName(), getPassword());
    }

    @Override
    protected void initView() {
        editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        editTextTextPassword=findViewById(R.id.editTextTextPassword);
    }

    @Override
    protected int getLayotID() {
        return R.layout.activity_main;
    }

    @Override
    public MainPersenterImpI add() {
        return new MainPersenterImpI(this);
    }

    /*
    登录按钮
    * */
    public void loginButton(View view) {
        if (!TextUtils.isEmpty(getUserName()) && !TextUtils.isEmpty(getPassword())) {
            persenter.login(getUserName(), getPassword());
        }
    }

    @Override
    public MainPersenterImpI getPersenter() {
        return new MainPersenterImpI(this);
    }

    @Override
    public void getLoginData(String string) {

    }

    public void loginButtin(View view) {
        if (!TextUtils.isEmpty(getUserName()) && !TextUtils.isEmpty(getPassword())) {
            persenter.login(getUserName(), getPassword());
        }
    }

    @Override
    public String getUserName() {
        return editTextTextPersonName.getText().toString();
    }

    @Override
    public String getPassword() {
        return editTextTextPassword.getText().toString();
    }

    @Override
    public void getData(UserBean string) {

    }

}
