package com.nepplus.kotlinbasic_20220521

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog.setOnClickListener {


            Log.d(  "메인화면", "로그 버튼 눌림" )
            Log.e( "메인화면", "에러 로그 테스트")


        }

        btnToast.setOnClickListener {

            Toast.makeText(this, " 토스트 자동완성", Toast.LENGTH_SHORT).show()

        }

        btnVariable.setOnClickListener {

//            여기는 변수 문법 연습 (주석 - Ctrl + /)
//            주석 : 코드에 남기는 메모


//            var / val로 기록 공간 (변수) 만들기
            var name1 : String
            val name2 : String

//            두개의 이름 각각 저장하기 (멤 ㅗ기록하기)

            name1 = "김철수"  // 다른 값 대입 가능
            name2 = "이영희"  // 다른 값 변경 불가

            name1 = "박철수"
//            name2 = "최영희"  // val에는 다시 대입 불가

//            name1, name2에 기록한 값 로그로 찍어보기

            Log.d("변수", name1)   // 내부에 들어있는 "박철수" 출력
            Log.d("변수", name2)


        }



    }
}