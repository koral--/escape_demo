package com.example.escape_demo

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(TextView(this).apply {
            text = "Second Activity"
        })
    }
}
