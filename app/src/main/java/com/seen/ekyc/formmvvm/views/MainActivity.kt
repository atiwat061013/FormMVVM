package com.seen.ekyc.formmvvm.views

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.seen.ekyc.formmvvm.Interface.RegisterResultCallBacks
import com.seen.ekyc.formmvvm.R
import com.seen.ekyc.formmvvm.databinding.ActivityMainBinding
import com.seen.ekyc.formmvvm.viewmodels.RegisterViewModel
import com.seen.ekyc.formmvvm.viewmodels.RegisterModelFactory


class MainActivity : AppCompatActivity(), RegisterResultCallBacks {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        activityMainBinding.viewModel = ViewModelProviders.of(this, RegisterModelFactory(this)).get(RegisterViewModel::class.java)
    }

    override fun onSuccess(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()


    }

    override fun onError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}