package com.mop_memories.android.features.splash

import com.google.firebase.auth.FirebaseAuth
import com.mop_memories.android.common.BasePresenter
import com.mop_memories.android.common.BaseView
import javax.inject.Inject

class SplashPresenter @Inject constructor(private val firebaseAuth: FirebaseAuth): BasePresenter<SplashView>() {

    fun cilentLogin() {

        if (firebaseAuth.currentUser != null)
            view?.loginSuccess()
        else
            view?.loginFailed()
    }
}