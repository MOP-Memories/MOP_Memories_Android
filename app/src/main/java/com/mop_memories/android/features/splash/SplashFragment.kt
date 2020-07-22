package com.mop_memories.android.features.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.mop_memories.android.R
import com.mop_memories.android.common.BaseFragment
import com.mop_memories.android.common.Presenter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SplashFragment : BaseFragment(R.layout.fragment_splash), SplashView {
    @Inject
    override lateinit var presenter: SplashPresenter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.cilentLogin()
    }

    override fun loginSuccess() {
        findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToMainFragment())
    }

    override fun loginFailed() {
        findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToLoginFragment())
    }
}
