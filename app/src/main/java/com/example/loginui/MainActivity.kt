package com.example.loginui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mEditText = findViewById<EditText>(R.id.E1)
        val mButton = findViewById<Button>(R.id.B2)



        val mFragment = LogIn()

        mButton.setOnClickListener {
//            val mBundle = Bundle()
//            mBundle.putString("mText",mEditText.text.toString())
//            mFragment.arguments = mBundle
            val mFragmentManager = supportFragmentManager
            val mFragmentTransaction = mFragmentManager.beginTransaction()
            mFragmentTransaction.replace(R.id.container, mFragment).addToBackStack(null).commit()
        }
    }
}

