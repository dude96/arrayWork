package com.example.myapplication

import android.util.Log

class Student:Person() {
    override fun getDescription(): String {
        return "This is a student named: $name"
    }
    var subject:String = ""
    var average: Double = 0.0
}