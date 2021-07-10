package com.seen.ekyc.formmvvm.model

import android.text.TextUtils
import android.util.Patterns
import androidx.databinding.BaseObservable

data class User(private var name: String,private  var lastname: String): BaseObservable() {

    fun  isDataValid(): Int {
        if (TextUtils.isEmpty(getName()))
            return 0
        else if (TextUtils.isEmpty(getLastname()))
            return 1
        else
            return -1
    }


    fun getName(): String {
        return name

    }
    fun setName(name: String) {
        this.name = name

    }

    fun getLastname(): String {
        return lastname

    }



    fun setLastname(lastname: String) {
        this.lastname = lastname

    }

}