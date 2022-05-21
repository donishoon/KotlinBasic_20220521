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

            val address = "서울시 동대문구"

            Toast.makeText(this, address, Toast.LENGTH_SHORT).show()

        }


        btnCondition.setOnClickListener {

            val userAge = 18 // Int 형태 (자동추론. 정수니까 )

//            나이의 값이 20살 이상잉라면? => "성인입니다." 토스트로
            if ( userAge >= 20 ) {

                Toast.makeText(this, "성인입니다.", Toast.LENGTH_SHORT).show()
            }

            else if ( userAge >= 17 ) {
                Toast.makeText(this, "고등학생입니다", Toast.LENGTH_SHORT).show()
            }

            else if ( userAge>= 14  ){
                Toast.makeText(this, "중학생 입니다", Toast.LENGTH_SHORT).show()

            }

//            그렇지 않다면? => "미성년자입니다." 토스트로
            else {
                Toast.makeText(this, "미성년자입니다.", Toast.LENGTH_SHORT).show()
            }

//            조건식 논리 연산 예시.

//            1. 급여 높음 2. 거리가 가까움 3. 근로시간이 적으면

            val salary = 7800
            val minutes = 80
            val workHour = 35

//            연봉 4000이상 AND 거리는 50분 이내.

            if ( salary >= 4000 && minutes < 50 ) {
                Log.d("조건문", "연봉 & 거리 모두 만족.")
            }

//            거리가 20분 이내 or 근무시간 40시간 이내
            if ( minutes < 20 || workHour < 40 ) {
                Log.d( "조건문", "거리와 근무시간 둘 중 하나 만족")
            }

//            근무시간이 50시간 이상만 아니면 된다.
            if ( !(workHour > 50) ){


            }



        }

    }
}