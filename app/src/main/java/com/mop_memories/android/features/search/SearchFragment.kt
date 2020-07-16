package com.mop_memories.android.features.search

import androidx.fragment.app.Fragment
import com.mop_memories.android.R
import com.mop_memories.android.common.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SearchFragment : BaseFragment(R.layout.fragment_search), SearchView{
    @Inject
    override lateinit var presenter: SearchPresenter
}
