package com.info.cofeebuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondpage)

       val firstItem = findViewById<ConstraintLayout>(R.id.cl_first_item)
        firstItem.setOnClickListener {
            callActivity()
        }


    }
        private fun callActivity(){
            val message = findViewById<TextView>(R.id.Cappucino_Price)
            val text = message.text.toString()
            intent = Intent(this,ThirdActivity::class.java).also {
                it.putExtra("Price", text)
                startActivity(it)
           }
        }
}




