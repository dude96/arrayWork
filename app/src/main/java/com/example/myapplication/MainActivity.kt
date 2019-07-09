package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var a = 0
        for (i in 0 until 100){
            a++
        }
        Log.d("tttttttttttt","$a")

    }
    fun test1(){
        var teacher = Teacher()
        teacher.addStudent(Student())
        teacher.addStudent(Student())
        teacher.addStudent(Student())
        teacher.addStudent(Student())
        teacher.addStudent(Student())
        teacher.addStudent(Student())

        teacher.setStudentMark(0,88.0)
        teacher.setStudentMark(1,84.0)
        teacher.setStudentMark(2,97.0)
        teacher.setStudentMark(3,67.0)
        teacher.setStudentMark(4,87.0)
        teacher.setStudentMark(4,57.0)


        teacher.getStudentListAverage85()
    }
}



