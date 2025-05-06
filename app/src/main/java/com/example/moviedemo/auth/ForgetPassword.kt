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
import com.example.moviedemo.databinding.ActivityForgetPasswordBinding

class ForgetPassword : AppCompatActivity() {
    private lateinit var binding: ActivityForgetPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityForgetPasswordBinding.inflate(layoutInflater)

        binding.btnForget.setOnClickListener {

            var intent = Intent(this, login::class.java)
            startActivity(intent)

        }

        binding.btnForget.setOnClickListener {
            // Handle login button click
            val email = binding.edForgetpassword.text.toString()

            if(TextUtils.isEmpty(email)){
                binding.edForgetpassword.error = "Please enter your email"
                binding.edForgetpassword.requestFocus()
            }else
                Log.e("ForgetPassword", "Email: $email")
        }

        setContentView(binding.root)


    }
}