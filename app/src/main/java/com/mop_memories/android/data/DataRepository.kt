package com.mop_memories.android.data

import com.mop_memories.android.data.network.RestAPI
import io.reactivex.Observable
import javax.inject.Inject

abstract class DataRepository<P, R>{

    @Inject
    lateinit var restAPI: RestAPI

    protected abstract fun fetchData(payload: P): Observable<R>


    fun fetch(payload: P): Observable<R> {
        return fetchData(payload)
    }

}