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

        // Button alert
        val btnShowAlertMessage: Button = findViewById(R.id.btn_show_alert_message)
        btnShowAlertMessage.setOnClickListener {

            // Custom toast message of alert
            val toastLayout = layoutInflater.inflate(R.layout.toast_alert,
                findViewById(R.id.toast_alert_layout))
            val toastText = toastLayout.findViewById<TextView>(R.id.toastText)
            toastText.text = "Alert!"
            val customToast = Toast(this)
            customToast.view = toastLayout
            customToast.setGravity(Gravity.BOTTOM, 0, 10)
            customToast.duration = Toast.LENGTH_LONG
            customToast.show()
        }

        // Button confirm
        val btnShowConfirmMessage: Button = findViewById(R.id.btn_show_confirm_message)
        btnShowConfirmMessage.setOnClickListener {

            // Custom toast message of confirm
            val toastLayout = layoutInflater.inflate(R.layout.toast_confirm,
                findViewById(R.id.toast_confirm_layout))
            val toastText = toastLayout.findViewById<TextView>(R.id.toastText)
            toastText.text = "Confirm!"
            val customToast = Toast(this)
            customToast.view = toastLayout
            customToast.setGravity(Gravity.BOTTOM, 0, 10)
            customToast.duration = Toast.LENGTH_LONG
            customToast.show()
        }
    }
}