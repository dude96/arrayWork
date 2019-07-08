package com.example.myapplication

class Manager: Person() {
    override fun getDescription(): String {
        return "This is a manager named: $name"

    }
}