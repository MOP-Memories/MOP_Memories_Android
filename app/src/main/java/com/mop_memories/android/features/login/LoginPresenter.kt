package com.mop_memories.android.features.login

import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.util.Log
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.mop_memories.android.R
import com.mop_memories.android.common.BasePresenter
import com.mop_memories.android.data.auth.FirebaseSignInRepository
import dagger.hilt.android.qualifiers.ApplicationContext
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class LoginPresenter @Inject constructor(@ApplicationContext private val context: Context, private val firebaseSignInRepository: FirebaseSignInRepository) : BasePresenter<LoginView>() {
    fun loginAction() {
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .requestIdToken(context.getString(R.string.web_client_id))
            .build()

        val googleSignInClient = GoogleSignIn.getClient(context, gso)

        view?.renderIntent(googleSignInClient.signInIntent)
    }

    fun firebaseLogin(data: Intent?) {
        try {
            val account = GoogleSignIn.getSignedInAccountFromIntent(data).getResult(ApiException::class.java)!!

            if (account.idToken != null)
                firebaseSignInRepository.fetch(account.idToken!!).observeOn(Schedulers.io()).subscribe {
                    view?.loginSuccess()
                }.clearOnDetach()
            else
                view?.loginFailed()
        } catch (e: ApiException) {
            view?.loginFailed()
            Log.w(TAG, "Google sign in failed", e)
        }
    }
}
