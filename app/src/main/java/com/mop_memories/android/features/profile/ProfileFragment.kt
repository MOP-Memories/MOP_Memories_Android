package com.mop_memories.android.features.profile

import androidx.fragment.app.Fragment
import com.mop_memories.android.R
import com.mop_memories.android.common.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ProfileFragment : BaseFragment(R.layout.fragment_profile), ProfileView {
    @Inject
    override lateinit var presenter: ProfilePresenter
}
