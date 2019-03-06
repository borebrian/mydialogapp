package com.message.mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        one.setOnClickListener() {
           val snack = Snackbar.make(it,"1",Snackbar.LENGTH_SHORT)
            snack.show()

        }


            two.setOnClickListener() {
                val build=AlertDialog.Builder(this)

            }
            three.setOnClickListener() {

            }
            four.setOnClickListener() {

            }
            five.setOnClickListener() {

            }
            six.setOnClickListener() {

            }
            seven.setOnClickListener() {

            }
            eight.setOnClickListener() {

            }
            nine.setOnClickListener() {

            }
            times.setOnClickListener() {

            }
            devide.setOnClickListener() {

            }
            equals.setOnClickListener() {

            }
            results.setOnClickListener() {

            }



    }
}
