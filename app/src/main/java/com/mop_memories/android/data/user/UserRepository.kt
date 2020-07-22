package com.mop_memories.android.data.user

import com.mop_memories.android.data.DataRepository
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

//class UserRepository @Inject constructor(): DataRepository<String, String>() {
//    override fun fetchData(payload: String): Observable<String> {
//        return restAPI.getUser().subscribeOn(Schedulers.io())
//    }
//
//}