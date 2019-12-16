package com.example.httpgettest

import android.content.Context
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class httprequest {

    fun find_all (context: Context, callback: (String) -> Unit) {


        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(context)
        val url = "https://google.es"

// Request a string response from the provided URL.
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            Response.Listener<String> { response ->

              callback(response)
            },
            Response.ErrorListener {
               callback("ERROR!!!!!!")
            })

// Add the request to the RequestQueue.
        queue.add(stringRequest)

    }

}