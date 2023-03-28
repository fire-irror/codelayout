package kr.hs.emirim.codelayout

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity2 : AppCompatActivity() {
    lateinit var btn1: Button //초기화
    lateinit var btn2: Button //초기화
    lateinit var btn3: Button //초기화
    lateinit var btn4: Button //초기화
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)   //이문장 다음에 참조값을 받을 수 있다.

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)

        btn1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
            //주소를 넣으면 웹브라우저를 이용하여 열린다.
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010-1234-5678"))
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media")) //photo 앱이 열리게 하는 uri
            startActivity(intent)
        }
        btn4.setOnClickListener {
            finish()
        }
    }
}