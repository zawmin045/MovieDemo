package com.example.moviedemo.auth

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.moviedemo.R
import com.example.moviedemo.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater)

        binding.lbLogin.setOnClickListener {

            var intent = Intent(this, login::class.java)
            startActivity(intent) // Start the login activity
            // Handle login text click
            finish() // Close the SignUp activity
        }
                    //error massage ရေးခြင်း

        binding.btnSignUp.setOnClickListener {
            var name = binding.edName.text.toString()
            var email = binding.edEmail.text.toString()
            var password = binding.edPassword.text.toString()
            //var confirmPassword = binding.edConfirmPassword.text.toString()
            if(TextUtils.isEmpty(name)){
                binding.edName.error = "Please enter your name"
                binding.edName.requestFocus()
            }else if(TextUtils.isEmpty(email)){
                binding.edEmail.error = "Please enter your email"
                binding.edEmail.requestFocus()
            }else if(TextUtils.isEmpty(password)){
                binding.edPassword.error = "Please enter your password"
                binding.edPassword.requestFocus()
            }else {
                Log.e("SignUp", "Name: $name, Email: $email, Password: $password")
            }
        }



        setContentView(binding.root)

    }
}