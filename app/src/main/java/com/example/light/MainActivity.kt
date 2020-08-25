package com.example.light

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = Array(3){IntArray(3)}
        var c=Array(3){IntArray(3)}
        for(i in 0 until 2){
            for(j in 0 until 2){
                c[i][j]=-1
            }
        }
       var a00=findViewById<Button>(R.id.a00)
       var a01=findViewById<Button>(R.id.a01)
       var a02=findViewById<Button>(R.id.a02)
       var a10=findViewById<Button>(R.id.a10)
       var a11=findViewById<Button>(R.id.a11)
       var a12=findViewById<Button>(R.id.a12)
       var a20=findViewById<Button>(R.id.a20)
       var a21=findViewById<Button>(R.id.a21)
       var a22=findViewById<Button>(R.id.a22)
       a00.setBackgroundColor(Color.parseColor("#FF000000"))
        a01.setBackgroundColor(Color.parseColor("#FF000000"))
        a02.setBackgroundColor(Color.parseColor("#FF000000"))
        a10.setBackgroundColor(Color.parseColor("#FF000000"))
        a11.setBackgroundColor(Color.parseColor("#FF000000"))
        a12.setBackgroundColor(Color.parseColor("#FF000000"))
        a20.setBackgroundColor(Color.parseColor("#FF000000"))
        a21.setBackgroundColor(Color.parseColor("#FF000000"))
        a22.setBackgroundColor(Color.parseColor("#FF000000"))


    }
}
