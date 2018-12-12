package com.jn90.kotlinex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_calculadora.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
        btnAdd.setOnClickListener(this::operar)
        btnSub.setOnClickListener (this::operar)
        btnMul.setOnClickListener(this::operar)
        btnDiv.setOnClickListener(this::operar)
    }
    fun operar (view: View){
        val n1 = "0$(num1.text)".toInt()
        val n2 = "0$(num2.text)".toInt()
        val result = when (view.id){
            R.id.btnAdd-> n1+n2
            R.id.btnAdd-> n1-n2
            R.id.btnAdd-> n1*n2
            else -> n1/n2

        }


    }
}
