package com.mop_memories.android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = (childFragmentManager.findFragmentById(R.id.bottom_nav_host_fragment) as NavHostFragment).navController
        bottomNavMenu.setupWithNavController(navController)

        val actionBarConfig =  AppBarConfiguration.Builder(
            R.id.feedFragment,
            R.id.searchFragment,
            R.id.cameraFragment,
            R.id.notificationsFragment,
            R.id.profileFragment
        ).build()

        actionBar.setupWithNavController(navController, actionBarConfig)
    }
}
