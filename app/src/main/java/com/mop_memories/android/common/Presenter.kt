package com.mop_memories.android.common

interface Presenter {
    fun attachView(view: BaseView)
    fun detachView()
}