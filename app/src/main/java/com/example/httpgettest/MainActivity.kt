package com.example.httpgettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getjson(view: View) {

        val textView = findViewById<TextView>(R.id.textView)


        val modelFacade = httprequest()
        modelFacade.find_all(this, {respuesta -> textView.text = respuesta })

    }

    }
