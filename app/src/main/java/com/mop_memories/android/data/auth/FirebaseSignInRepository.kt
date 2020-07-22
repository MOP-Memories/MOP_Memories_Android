package com.mop_memories.android.data.auth

import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.mop_memories.android.common.ext.toObservable
import com.mop_memories.android.data.DataRepository
import com.mop_memories.android.data.model.AuthModel
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class FirebaseSignInRepository @Inject constructor(private val firebaseAuth: FirebaseAuth): DataRepository<String, AuthResult>() {
    override fun fetchData(payload: String): Observable<AuthResult> {
        println(payload)
        val credentials = GoogleAuthProvider.getCredential(payload, null)

        return firebaseAuth.signInWithCredential(credentials).toObservable()
    }

}