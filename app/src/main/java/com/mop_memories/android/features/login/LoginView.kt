package com.mop_memories.android.features.login

import android.content.Intent
import com.mop_memories.android.common.BaseView

interface LoginView: BaseView {
    fun loginSuccess()
    fun loginFailed()
    fun tempFunc(s: String)
    fun renderIntent(intent: Intent)
}
