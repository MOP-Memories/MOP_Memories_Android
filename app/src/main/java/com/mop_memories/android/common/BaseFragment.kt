package com.mop_memories.android.common

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import com.mop_memories.android.R

abstract class BaseFragment (@LayoutRes layoutId: Int): Fragment(layoutId) {
    abstract val presenter: Presenter?

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter?.attachView((this as BaseView))
    }

    override fun onDestroyView() {
        presenter?.detachView()

        super.onDestroyView()
    }
}