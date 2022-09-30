package com.denicks21.toastmessage

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnShowAlertMessage: Button = findViewById(R.id.btn_show_alert_message)
        btnShowAlertMessage.setOnClickListener {

            // Custom toast message of alert
            val inflater = layoutInflater
            val layout = inflater.inflate(R.layout.toast_alert, findViewById(R.id.toast_alert_layout))
            val toastText = layout.findViewById<TextView>(R.id.toastText)
            toastText.text = "Alert!"
            val toast = Toast(applicationContext)
            toast.setGravity(Gravity.BOTTOM, 0, 100)
            toast.duration = Toast.LENGTH_LONG
            toast.setView(layout)
            toast.show()
        }

        val btnShowConfirmMessage: Button = findViewById(R.id.btn_show_confirm_message)
        btnShowConfirmMessage.setOnClickListener {

            // Custom toast message of confirm
            val inflater = layoutInflater
            val layout = inflater.inflate(R.layout.toast_confirm, findViewById(R.id.toast_confirm_layout))
            val toastText = layout.findViewById<TextView>(R.id.toastText)
            toastText.text = "Confirm!"
            val toast = Toast(applicationContext)
            toast.setGravity(Gravity.BOTTOM, 0, 100)
            toast.duration = Toast.LENGTH_SHORT
            toast.setView(layout)
            toast.show()
        }
    }
}