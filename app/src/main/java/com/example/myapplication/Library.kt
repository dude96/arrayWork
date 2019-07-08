package com.example.myapplication

import android.util.Log

class Library {
    var bookList: ArrayList<Book> = ArrayList()
    var manager: Manager = Manager()


    fun getAllEnglishBooks(): ArrayList<Book> {
        var eBook = ArrayList<Book>()
        for (i in 0 until bookList.size) {
            var correntBook = bookList[i]
            if (correntBook.language == "English")
                eBook.add(correntBook)
        }
        return eBook
    }

    fun getBookTitle(): ArrayList<String> {
        var tBook = ArrayList<String>()
        for (i in 0 until bookList.size) {
            tBook.add(bookList[i].title)
        }
        return tBook
    }

    fun getAllAuthersName(): ArrayList<String> {
        var aBook = ArrayList<String>()
        for (i in 0 until bookList.size) {
            aBook.add(bookList[i].auther)
        }
        return aBook
    }

    fun getBookOver300Page(): ArrayList<Book> {
        var bookL = ArrayList<Book>()
        for (i in 0 until bookList.size) {
//            var over300 = bookList[i]
//            var b = 300 - over300.pages
            if (bookList[i].pages > 300) {
                bookL.add(bookList[i])
                Log.d("tesssst", "is biger from 300 pager  ${bookList[i].pages}")
            }
        }
        return bookL
    }
}

