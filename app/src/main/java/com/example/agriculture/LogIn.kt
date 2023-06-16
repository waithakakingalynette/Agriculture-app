package com.example.agriculture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.agriculture.databinding.ActivityLogInBinding

class LogIn : AppCompatActivity() {
lateinit var binding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_log_in)
    }

    override fun onResume() {
        super.onResume()
        binding.btnpreviouss.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }
    }
}