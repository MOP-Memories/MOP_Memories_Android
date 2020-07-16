package com.mop_memories.android.features.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mop_memories.android.R
import com.mop_memories.android.common.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginFragment : BaseFragment(R.layout.fragment_login), LoginView {
    @Inject
    override lateinit var presenter: LoginPresenter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.loginButton)
            .setOnClickListener {presenter.loginAction()}
    }

    override fun loginSuccess() {
        findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToMainFragment())
    }
}
