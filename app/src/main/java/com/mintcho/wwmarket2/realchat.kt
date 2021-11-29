package com.mintcho.wwmarket2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_market3.*
import kotlinx.android.synthetic.main.activity_realchat.*

class realchat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_realchat)

        back4button.setOnClickListener {
            val intent =
                Intent(this, activity_market1::class.java)  //버튼 누르면 넘어갈 페이지를 Subactivity 위치에 알맞게 변경할것
            startActivity(intent)
        }

        chatbutto9n.setOnClickListener {
            val intent = Intent(this, market3::class.java)  //버튼 누르면 넘어갈 페이지를 Subactivity 위치에 알맞게 변경할것
            startActivity(intent)
        }
    }
}