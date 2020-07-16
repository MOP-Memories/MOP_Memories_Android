package com.mop_memories.android.features.login

import androidx.navigation.fragment.findNavController
import com.mop_memories.android.common.BasePresenter
import javax.inject.Inject

class LoginPresenter @Inject constructor() : BasePresenter<LoginView>() {
     fun loginAction() {
        view?.loginSuccess()
    }
}