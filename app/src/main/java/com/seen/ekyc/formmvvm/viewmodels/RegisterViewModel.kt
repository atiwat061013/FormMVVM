package com.seen.ekyc.formmvvm.viewmodels

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.lifecycle.ViewModel
import com.seen.ekyc.formmvvm.Interface.RegisterResultCallBacks
import com.seen.ekyc.formmvvm.model.User

class RegisterViewModel (private  val listener:RegisterResultCallBacks) : ViewModel() {
    private val user:User

    init {
        this.user = User("", "")
    }

    val nameTextWatcher:TextWatcher
    get() = object:TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

        }

        override fun afterTextChanged(s: Editable?) {
            user.setName(s.toString())
        }

    }


    val lastnameTextWatcher:TextWatcher
        get() = object:TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                user.setLastname(s.toString())
            }

        }


    fun onSubmitClicker(v: View){

        var loginCodeCheck:Int = user.isDataValid()
        if (loginCodeCheck == 0)
            listener.onSuccess("Name is null")
        else if (loginCodeCheck == 1)
            listener.onError("LastName is null")
        else
            listener.onSuccess("Register Success")
    }



}