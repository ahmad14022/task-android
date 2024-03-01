package com.example.stechoqpembekalan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val authManager = AuthManager(applicationContext)

        val registerButton: Button = findViewById(R.id.registerButton)
        val fullNameEditText: EditText = findViewById(R.id.fullNameEditText)
        val emailEditText: EditText = findViewById(R.id.emailEditText)
        val usernameEditText: EditText = findViewById(R.id.usernameEditText)
        val passwordEditText: EditText = findViewById(R.id.passwordEditText)
        val confirmPasswordEditText: EditText = findViewById(R.id.confirmPasswordEditText)

        registerButton.setOnClickListener {
            val fullName = fullNameEditText.text.toString()
            val email = emailEditText.text.toString()
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            val confirmPassword = confirmPasswordEditText.text.toString()

            if (password == confirmPassword) {
                // Registration success
                // You can implement saving the data here (using Shared Preferences, for example)
                // For now, just show a toast
                authManager.registerUser(username, password)
                Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show()
            } else {
                // Passwords do not match
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            }
        }

        val loginButtonFromRegister: Button = findViewById(R.id.loginButtonFromRegister)

        loginButtonFromRegister.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
