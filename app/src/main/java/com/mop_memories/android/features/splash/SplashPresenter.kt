package com.mop_memories.android.features.splash

import com.mop_memories.android.common.BasePresenter
import com.mop_memories.android.common.BaseView
import javax.inject.Inject

class SplashPresenter @Inject constructor(): BasePresenter<SplashView>() {

    fun cilentLogin() {
        view?.loginFailed()
    }
}