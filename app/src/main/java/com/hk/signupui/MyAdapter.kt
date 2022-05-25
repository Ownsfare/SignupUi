package com.hk.signupui

import android.content.Context
import android.os.Handler
import androidx.viewpager.widget.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import com.hk.signupui.R
import android.widget.LinearLayout
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import soup.neumorphism.NeumorphButton
import soup.neumorphism.ShapeType

class MyAdapter(val context: Context) : PagerAdapter() {
    var layoutInflater: LayoutInflater? = null
    var layouts =
        intArrayOf(R.layout.activity_main, R.layout.activity_live, R.layout.activity_flicks)

    override fun getCount(): Int {
        return layouts.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as ConstraintLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater?
        val main = layoutInflater!!.inflate(R.layout.activity_main, container, false)
        val live = layoutInflater!!.inflate(R.layout.activity_live, container, false)
        val flick = layoutInflater!!.inflate(R.layout.activity_flicks, container, false)
        val mainLogInBtn: NeumorphButton = main.findViewById(R.id.logInBtn)
        val mainSignUpBtn: NeumorphButton = main.findViewById(R.id.signUpBtn)
        val liveLogInBtn: NeumorphButton = live.findViewById(R.id.logInBtn)
        val liveSignUpBtn: NeumorphButton = live.findViewById(R.id.signUpBtn)
        val flickLogInBtn: NeumorphButton = flick.findViewById(R.id.logInBtn)
        val flickSignUpBtn: NeumorphButton = flick.findViewById(R.id.signUpBtn)
        mainLogInBtn.setOnClickListener{
            mainLogInBtn.setShapeType(ShapeType.PRESSED)
            val handler = Handler()
            handler.postDelayed(Runnable {
                mainLogInBtn.setShapeType(ShapeType.FLAT)
            }, 500)
            Toast.makeText(context, "Logged in", Toast.LENGTH_SHORT).show()
        }
        mainSignUpBtn.setOnClickListener{
            mainSignUpBtn.setShapeType(ShapeType.PRESSED)
            val handler = Handler()
            handler.postDelayed(Runnable {
                mainSignUpBtn.setShapeType(ShapeType.FLAT)
            }, 500)
            Toast.makeText(context, "Sign Up", Toast.LENGTH_SHORT).show()
        }
        liveLogInBtn.setOnClickListener{
            liveLogInBtn.setShapeType(ShapeType.PRESSED)
            val handler = Handler()
            handler.postDelayed(Runnable {
                liveLogInBtn.setShapeType(ShapeType.FLAT)
            }, 500)
            Toast.makeText(context, "Logged in", Toast.LENGTH_SHORT).show()
        }
        liveSignUpBtn.setOnClickListener{
            liveSignUpBtn.setShapeType(ShapeType.PRESSED)
            val handler = Handler()
            handler.postDelayed(Runnable {
                liveSignUpBtn.setShapeType(ShapeType.FLAT)
            }, 500)
            Toast.makeText(context, "Sign Up", Toast.LENGTH_SHORT).show()
        }
        flickLogInBtn.setOnClickListener{
            flickLogInBtn.setShapeType(ShapeType.PRESSED)
            val handler = Handler()
            handler.postDelayed(Runnable {
                flickLogInBtn.setShapeType(ShapeType.FLAT)
            }, 500)
            Toast.makeText(context, "Logged in", Toast.LENGTH_SHORT).show()
        }
        flickSignUpBtn.setOnClickListener{
            flickSignUpBtn.setShapeType(ShapeType.PRESSED)
            val handler = Handler()
            handler.postDelayed(Runnable {
                flickSignUpBtn.setShapeType(ShapeType.FLAT)
            }, 500)
            Toast.makeText(context, "Sign Up", Toast.LENGTH_SHORT).show()
        }
        val viewarr = arrayOf(main, live, flick)
        container.addView(viewarr[position])
        return viewarr[position]
    }


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as ConstraintLayout)
    }


}