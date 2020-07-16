package com.mop_memories.android.features.feed

import com.mop_memories.android.R
import com.mop_memories.android.common.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FeedFragment : BaseFragment(R.layout.fragment_feed), FeedView {
    @Inject
    override lateinit var presenter: FeedPresenter

}
