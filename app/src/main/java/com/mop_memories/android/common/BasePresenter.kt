package com.mop_memories.android.common

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BasePresenter<T: BaseView>: Presenter{
    var view: T? = null
    var compositeDisposable = CompositeDisposable()

    override fun attachView(view: BaseView) {
        this.view = view as? T
    }

    override fun detachView() {
        compositeDisposable.clear()
        this.view = null
    }

    protected fun Disposable.clearOnDetach() {
        compositeDisposable.add(this)

    }
}
