package com.example.stechoqpembekalan

import android.content.Context
import android.content.SharedPreferences

class AuthManager(context: Context) {

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("auth_prefs", Context.MODE_PRIVATE)

    fun registerUser(username: String, password: String) {
        sharedPreferences.edit().putString(username, password).apply()
    }

    fun authenticate(username: String, password: String): Boolean {
        val storedPassword = sharedPreferences.getString(username, null)
        return password == storedPassword
    }
}
