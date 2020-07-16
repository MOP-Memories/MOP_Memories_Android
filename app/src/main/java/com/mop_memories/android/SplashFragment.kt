package com.mop_memories.android

import android.os.Bundle
import android.view.ContextThemeWrapper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

class SplashFragment : Fragment(R.layout.fragment_splash) {
    var navControler: NavController? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToLoginFragment())
        requireActivity().supportFragmentManager.popBackStack()

        super.onViewCreated(view, savedInstanceState)
    }

}
