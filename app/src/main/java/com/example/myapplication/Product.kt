package com.example.myapplication

class Product {
    var cost:Double = 0.0
    var name:String = ""
    var id:String = ""
    var amount:Double = 0.0
    var quantityOfProducts:Int = 0
    var manufacturingCountry:String =""

    constructor(cost: Double, name: String, id: String, amount: Double, quantityOfProducts: Int, manufacturingCountry: String) {
        this.cost = cost
        this.name = name
        this.id = id
        this.amount = amount
        this.quantityOfProducts = quantityOfProducts
        this.manufacturingCountry = manufacturingCountry
    }

}