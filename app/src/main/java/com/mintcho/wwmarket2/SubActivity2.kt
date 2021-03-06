package com.mintcho.wwmarket2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub2.*

class SubActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2)


        button5_nego.setOnClickListener {
            val intent = Intent(this, Sub2NegoaActivity::class.java)  //네고하기
            startActivity(intent)
        }
        button6_buy.setOnClickListener {
            val intent = Intent(this, Sub2buy2Activity::class.java)  //구매하기
            startActivity(intent)
        }
        button7_hist.setOnClickListener {
            val intent = Intent(this, SubActivity3::class.java)  //거래기록 보기
            startActivity(intent)
        }

        imageButton8_back.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)  //뒤로가기
            startActivity(intent)
        }
    }

}