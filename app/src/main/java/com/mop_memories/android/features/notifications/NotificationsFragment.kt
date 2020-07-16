package com.mop_memories.android.features.notifications

import com.mop_memories.android.R
import com.mop_memories.android.common.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class NotificationsFragment : BaseFragment(R.layout.fragment_notifications), NotificationsView {
    @Inject
    override lateinit var presenter: NotificationsPresenter
}
