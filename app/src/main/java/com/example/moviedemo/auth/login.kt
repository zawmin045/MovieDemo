package com.example.moviedemo.auth

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.text.TextUtils
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.moviedemo.R
import com.example.moviedemo.databinding.ActivityLoginBinding

class login : AppCompatActivity() {

    private lateinit var  binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)


        binding.txtRegister.setOnClickListener {
            // Handle register text click
            var intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        binding.textView2.setOnClickListener {
            // Handle forget password text click
            var intent = Intent(this, ForgetPassword::class.java)
            startActivity(intent)
        }

        binding.btnSigIn.setOnClickListener {
            // Handle login button click
            val email = binding.edemail.text.toString()
            val password = binding.edPassword.text.toString()

            if(TextUtils.isEmpty(email)){
                binding.edemail.error = "Please enter your email"
                binding.edemail.requestFocus()
            }else if(TextUtils.isEmpty(password)){
                binding.edPassword.error = "Please enter your password"
                binding.edPassword.requestFocus()
        }else{
            Log.e("Login", "Email: $email, Password: $password")

            }        }

        setContentView(binding.root)

    }
}