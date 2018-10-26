package com.example.c0m025x.mvvmdesign.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.c0m025x.mvvmdesign.R
import com.example.c0m025x.mvvmdesign.models.UserProfileViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userProfileViewModel = UserProfileViewModel("cmahajan")
    }
}
