package com.info.cofeebuy

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirdpage)

        val message = intent.getStringExtra("Price")
        val price = findViewById<TextView>(R.id.Bottom_Detailed_Price).apply {
            text=message }

        val backButton = findViewById<ImageButton>(R.id.thirdpagebackbutton).setOnClickListener {
            intent = Intent(this, SecondActivity::class.java)
            finish()
        }

        val buyNow = findViewById<Button>(R.id.bt_buy_now).setOnClickListener {
            startActivity(Intent(this, FourthActivity::class.java))


        }

    }
}