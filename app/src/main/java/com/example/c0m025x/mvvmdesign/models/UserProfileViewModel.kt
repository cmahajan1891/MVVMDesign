package com.example.c0m025x.mvvmdesign.models

import android.arch.lifecycle.ViewModel

class UserProfileViewModel(userId: String) : ViewModel() {
    init {
        printUserId(userId) { println("Anonymous function.")}
        //printUserId(b = true, function = fun(){ println("Anonymous function.")})
    }

    private fun printUserId (userId: String = "smahajan", b: Boolean = false, function: () -> Unit) {
        println("User id is : $userId")
        println("Boolean value is : $b")
        function()
    }
}