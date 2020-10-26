package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var default: Int = 0
    fun RESET(view: View) {

        val textView2 = TextView(this)
        textView2.text = default.toString()
        textView2.textSize = 30F
        linlay.addView(textView2)
        default = 0
        var counter:String = "$default"
        textView.text = counter
    }

    fun UP(view: View) {
        default++
        var counter:String = "$default"
        textView.text = counter
    }
    fun DOWN(view: View) {
        default--
        var counter:String = "$default"
        textView.text = counter
    }
}