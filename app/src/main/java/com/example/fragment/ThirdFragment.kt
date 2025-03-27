package com.example.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ThirdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("ThirdFrangment", "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.e("ThirdFrangment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("ThirdFrangment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("ThirdFrangment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("ThirdFrangment", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("ThirdFrangment", "onDestory")
    }
}

