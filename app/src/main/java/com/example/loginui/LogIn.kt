package com.example.loginui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class LogIn : Fragment() {
    private lateinit var myTextView: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_log_in, container, false)
//        myTextView = view.findViewById<View>(R.id.textv) as TextView
//        val bundle = arguments
//        val message = bundle!!.getString("mText")

        return view
    }


    }
