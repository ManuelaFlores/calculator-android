package com.manuelaflores.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        btnSum.setOnClickListener {
            tvResult.setText("${etFirstNumber.text.toString().toInt() + etSecondNumber.text.toString().toInt()}")
        }

        btnSubstraction.setOnClickListener {
            tvResult.setText("${etFirstNumber.text.toString().toInt() - etSecondNumber.text.toString().toInt()}")
        }

        btnMultiplication.setOnClickListener {
            tvResult.setText("${etFirstNumber.text.toString().toInt() * etSecondNumber.text.toString().toInt()}")
        }

        btnDivide.setOnClickListener {
            tvResult.setText("${etFirstNumber.text.toString().toInt() / etSecondNumber.text.toString().toInt()}")
        }
    }
}
