package com.prototype.project_nf_1_view

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn1 = findViewById<Button>(R.id.btn_marker1)
        btn1.bringToFront()
    }

    fun marker1Click(view: View)
    {
        Toast.makeText(this, "address 88", Toast.LENGTH_LONG).show()
    }

    fun marker2Click(view: View)
    {
        Toast.makeText(this, "address 111", Toast.LENGTH_LONG).show()
    }
}