package com.mop_memories.android.common.ext

import com.google.android.gms.tasks.Task
import io.reactivex.Observable

fun <T> Task<T>.toObservable() : Observable<T> {
    return Observable.create { emmiter ->
        this.addOnCompleteListener{
            val result = it.result
            val error = it.exception
            if (it.isSuccessful && result != null)
                emmiter.onNext(result)
            else if(error != null)
                emmiter.onError(error)
        }
    }
}
