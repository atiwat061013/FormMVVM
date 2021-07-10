package com.seen.ekyc.formmvvm.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.seen.ekyc.formmvvm.Interface.RegisterResultCallBacks

class RegisterModelFactory(private val listener:RegisterResultCallBacks) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return RegisterViewModel(listener) as T
    }
}