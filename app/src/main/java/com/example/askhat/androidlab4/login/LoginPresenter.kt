package com.example.askhat.androidlab4.login

import com.example.askhat.androidlab4.core.BasePresenter


class LoginPresenter(private val repository: LoginContract.LoginRepository) :
        BasePresenter<LoginContract.LoginView>(), LoginContract.LoginPresenter{
    override fun checkUser(email:String,password:String) {
        repository.getUsers().subscribe {
            var isFind = false
            for (user in it) {
                if (email==user.login && password == user.password) {
                    isFind = true
                }
            }
                if (isFind){
                    getView()?.successfulLogin()
                }
                else {
                    getView()?.unSuccessfulLogin()
                }
            }
        }
    }
