package com.message.mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        one.setOnClickListener() {
            val snack = Snackbar.make(it, "1", Snackbar.LENGTH_SHORT)
            snack.show()

        }


        two.setOnClickListener() {
            val build = AlertDialog.Builder(this)
            build.setTitle("Confirm")
            build.setMessage("Are you sure you want to press 2?")
            build.setPositiveButton("YES") { dialog, which ->
                val snack = Snackbar.make(it, "Two pressed", Snackbar.LENGTH_SHORT).show()
            }
            build.setNegativeButton("NO") { dialog, which ->
                Toast.makeText(this, "No pressed", Toast.LENGTH_SHORT).show()
            }
            build.setNeutralButton("CANCEL") { _, _ ->
                val show = Snackbar.make(it, "Cancel pressed!", Snackbar.LENGTH_SHORT).show()

            }
            val dialog: AlertDialog = build.create()
            dialog.show()


        }



            three.setOnClickListener() {
                val build=AlertDialog.Builder(this)
                build.setTitle("Are you sure you want to select 1?")
                build.setMessage("Confirm first please!")
                build.setPositiveButton("YES"){dialog, which ->             val snackbarr=Snackbar.make(it,"One pressed",Snackbar.LENGTH_SHORT).show()
                    results.text="1"
                }
                build.setNegativeButton("No"){dialog, which ->
                    results.text="0"
                }
                build.setNeutralButton("IGNORE"){_,_ ->
                    Toast.makeText(this,"Neutral",Toast.LENGTH_SHORT).show()
                }
                val dialog: AlertDialog=build.create()
                dialog.show()

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
