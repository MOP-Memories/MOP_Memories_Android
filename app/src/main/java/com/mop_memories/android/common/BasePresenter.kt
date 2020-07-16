package com.mop_memories.android.common

abstract class BasePresenter<T: BaseView>: Presenter{
    var view: T? = null

    override fun attachView(view: BaseView) {
        this.view = view as? T
    }

    override fun detachView() {
        this.view = null
    }
}