package com.mop_memories.android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginFragment : Fragment(R.layout.fragment_login) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.loginButton)
            .setOnClickListener {findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToMainFragment())}
    }
}
