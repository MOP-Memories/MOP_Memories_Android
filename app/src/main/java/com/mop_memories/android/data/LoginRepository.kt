package com.mop_memories.android.data

import android.content.Context
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.mop_memories.android.data.model.AuthModel
import dagger.hilt.android.qualifiers.ApplicationContext
import io.reactivex.Observable
import javax.inject.Inject

class LoginRepository
@Inject
constructor(@ApplicationContext private val context: Context)
    : DataRepository<Void, AuthModel>() {
    override fun fetchData(payload: Void): Observable<AuthModel> {

        TODO("Not yet implemented")
    }
}