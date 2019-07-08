package com.example.myapplication

abstract class Person() {
    var name:String = ""
    var age:Int = 20
    var id:String = ""

    abstract fun getDescription():String
}