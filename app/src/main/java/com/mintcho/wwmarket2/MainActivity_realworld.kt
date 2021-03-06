package com.mintcho.wwmarket2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_realworld.*

class MainActivity_realworld : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_realworld) //layout 디렉토리의 xml와 1대1 매칭되도록 activity_main

        metaHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)  //버튼 누르면 넘어갈 페이지를 Subactivity 위치에 알맞게 변경할것
            startActivity(intent)
        }

        realMarket.setOnClickListener {
            val intent = Intent(this, activity_market1::class.java)  //버튼 누르면 넘어갈 페이지를 Subactivity 위치에 알맞게 변경할것
            startActivity(intent)
        }

        realOffer.setOnClickListener {
            val intent = Intent(this, realoffermain::class.java)  //버튼 누르면 넘어갈 페이지를 Subactivity 위치에 알맞게 변경할것
            startActivity(intent)
        }

    }
}