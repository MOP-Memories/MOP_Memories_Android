package com.mop_memories.android.features.camera

import androidx.fragment.app.Fragment
import com.mop_memories.android.R
import com.mop_memories.android.common.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CameraFragment : BaseFragment(R.layout.fragment_camera), CameraView {

    @Inject
    override lateinit var presenter: CameraPresenter
}
