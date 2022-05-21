package com.hk.signupui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.Toast
import soup.neumorphism.NeumorphButton
import soup.neumorphism.NeumorphCardView
import soup.neumorphism.ShapeType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginBtn: NeumorphButton = findViewById<NeumorphButton>(R.id.logInBtn)

        loginBtn.setOnClickListener {
            loginBtn.setShapeType(ShapeType.PRESSED)
            Toast.makeText(this, "Logged in", Toast.LENGTH_SHORT).show()
        }

        val sinupBtn: NeumorphButton = findViewById<NeumorphButton>(R.id.signUpBtn)

        sinupBtn.setOnClickListener {
            sinupBtn.setShapeType(ShapeType.PRESSED)
            Toast.makeText(this, "Sign Up", Toast.LENGTH_SHORT).show()
        }
    }
}

