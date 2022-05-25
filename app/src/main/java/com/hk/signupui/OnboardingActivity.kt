package com.hk.signupui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

import androidx.viewpager.widget.ViewPager

class OnboardingActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
         viewPager = findViewById(R.id.viewPager)
         viewPager.adapter = MyAdapter(this)
    }

}