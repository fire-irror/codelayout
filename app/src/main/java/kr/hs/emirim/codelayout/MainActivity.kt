package kr.hs.emirim.codelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {  //상속받았다는 의미 (:)
    lateinit var btn1 : Button //변수 선언

    //fun ==> 메소드 선언
    override fun onCreate(savedInstanceState: Bundle?) {

        //Bundle==> 매개변수 코틀린에서는 null값을 허용하지 않아 ?같은 기호를 사용한다.
        super.onCreate(savedInstanceState)

        //수정한 내용이 mainactivity에 보이도록 해준다. (중요)
        setContentView(R.layout.activity_main)
        //ContentView를 설정해준다.


        //한번에 객체를 사용할 수 있음 btn이라는 id를 가진이라는 뜻
        btn1 = findViewById<Button>(R.id.btn1)
        //Button 너는 버튼이야 라고 알려주기

        btn1.setOnClickListener{    //자바에서 addClicklisener 과 같은 역할을 한다.
            //event를 해결할 수 있는 코드
            Toast.makeText(applicationContext,"push the Button", Toast.LENGTH_SHORT).show()     //문맥 객체 참조값 받기
        }
    }
}