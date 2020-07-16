package com.mop_memories.android.features.splash

import com.mop_memories.android.common.BaseView

interface SplashView: BaseView {
    fun loginSuccess()
    fun loginFailed()
}