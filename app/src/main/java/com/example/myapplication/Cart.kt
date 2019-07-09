package com.example.myapplication

class Cart {
    var tproduct: ArrayList<Product> = ArrayList()
    var bayer:ArrayList<Person> = ArrayList()


    fun getTotalCost():Double{
        var tCost = ArrayList<Double>()
        var sum = 0.0
        for (i in 0 until tproduct.size){
            var costOfProduct = tproduct[i]
            var amount = tproduct[i]
            sum = (costOfProduct.cost)*(amount.amount)

        }
        return sum
    }

    fun getTotallItems():Int{
        var tItem = ArrayList<Int>()
        var a = 0
        var sum = 0
        for (i in 0 until tproduct.size){
            var amount = tproduct[i]
            a++
            sum = (a*(amount.amount)).toInt()
        }
        return a
    }

    fun addItem(product: Product){
        tproduct.add(product)
    }

    fun returnProductMadeInIsrael():ArrayList<Product>{
        val made = ArrayList<Product>()
        for (i in  0 until tproduct.size){
            var correntStudent = tproduct[i]
            if (correntStudent.manufacturingCountry == "Israel")
                made.add(correntStudent)
        }
        return made
    }
    }
