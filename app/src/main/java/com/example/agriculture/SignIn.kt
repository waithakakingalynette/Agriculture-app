package com.example.agriculture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.agriculture.databinding.ActivitySignInBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignIn : AppCompatActivity() {
    lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)
//        castViews()

    }

    override fun onResume() {
        super.onResume()
        binding.btnSignUp.setOnClickListener {
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }

        binding.btnprevious.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        clearErrors()
        validateSignUp()

    }

    fun validateSignUp() {
        val FirstName = binding.etFirstName.text.toString()
        val LastName = binding.etLastName.text.toString()
        val Email = binding.etEmail.text.toString()
        val Password = binding.etPassword.text.toString()
        val Confirmation = binding.etconfirmPassword.text.toString()
        var error=false

        if (FirstName.isBlank()) {
            binding.tilFirstName.error = "First name is required"
            var error=true
        }

        if (LastName.isBlank()) {
            binding.tilLastName.error = "Last name is required"
            var error=true

        }

        if (Email.isBlank()) {
            binding.tilEmail.error = "Email is required"
            var error=true

        }

        if (Password.isBlank()) {
            binding.tilPassword.error = "Password is required"
            var error=true

        }

        if (Confirmation.isBlank()) {
            binding.tilconfirmPassword.error = "ConfirmationPassword  is required"
            var error=true

        }

        if (Password != Confirmation) {
            binding.tilconfirmPassword.error = "Password does not match "
            var error=true

        }
        if (!error){
            Toast.makeText(this,"$FirstName,$LastName,$Email", Toast.LENGTH_LONG).show()
        }
    }

    fun clearErrors(){
        binding.tilFirstName.error=null
        binding.tilLastName.error=null
        binding.tilEmail.error=null
        binding.tilPassword.error=null
        binding.tilconfirmPassword.error=null

    }
}