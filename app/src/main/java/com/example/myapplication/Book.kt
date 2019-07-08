package com.example.myapplication

class Book {
    var title:String = ""
    var pages:Int = 0
    var language:String = ""
    var auther:String = ""
    constructor(title: String, pages: Int, language: String, auther: String) {
        this.title = title
        this.pages = pages
        this.language = language
        this.auther = auther
    }
}