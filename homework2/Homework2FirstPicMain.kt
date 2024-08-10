package com.example.myapplication.homework2

fun main() {

    val hwFuncs = Homework2FirstPicFunctions()

    //Usages of first Function
    var result = hwFuncs.question1(4)
    println("Sum of interior angles: $result")

    result = hwFuncs.question1(3)
    println("Sum of interior angles: $result")

    result = hwFuncs.question1(5)
    println("Sum of interior angles: $result")

    result = hwFuncs.question1(2) //testing impossible values
    println("Sum of interior angles: $result")

    result = hwFuncs.question1(-3) //testing impossible values
    println("Sum of interior angles: $result")


    println("----------------------------------")

    //Usages of Second function

    //normal usage without extra
    var result2 = hwFuncs.question2(15)
    println("Your wage: $result2 ₺ ")

    result2 = hwFuncs.question2(10)
    println("Your wage: $result2 ₺ ")

    //normal usage with extra
    result2 = hwFuncs.question2(22)
    println("Your wage: $result2 ₺ ")

    result2 = hwFuncs.question2(27)
    println("Your wage: $result2 ₺ ")


    result2 = hwFuncs.question2(-5)//Absurd usage with negative values
    println("Your wage: $result2 ₺ ")

    result2 = hwFuncs.question2(0)//Absurd usage with zero
    println("Your wage: $result2 ₺ ")

    result2 = hwFuncs.question2(32)//Absurd usage with more than 31 days
    println("Your wage: $result2 ₺ ")


    println("----------------------------------")

    //Usages of Third function with doubles

    var result3 = hwFuncs.question3(55.5) //testing if quota bigger than 50
    println("your payment: $result3")

    result3 = hwFuncs.question3(50.0) //testing if quota is 50
    println("your payment: $result3")

    result3 = hwFuncs.question3(27.4) //testing if quota is used a little bit
    println("your payment: $result3")

    result3 = hwFuncs.question3(0) //testing if quota is used and finished
    println("your payment: $result3")

    result3 = hwFuncs.question3(-0.5) //testing if quota is used for 1 gb but not completely
    println("your payment: $result3")

    result3 = hwFuncs.question3(-1.0) //testing if quota is used for 1 gb exactly
    println("your payment: $result3")

    result3 = hwFuncs.question3(-1.5) //testing if quota is used for 1 gb and more with partial
    println("your payment: $result3")


    //Usages of Third function with Integers

    var result4 = hwFuncs.question3(55) //testing if quota bigger than 50
    println("your payment: $result4")

    result4 = hwFuncs.question3(50) //testing if quota is 50
    println("your payment: $result4")

    result4 = hwFuncs.question3(27) //testing if quota is used a little bit
    println("your payment: $result4")

    result4 = hwFuncs.question3(0) //testing if quota is used and finished
    println("your payment: $result4")

    result4 = hwFuncs.question3(-5) //testing if quato is finished and used more
    println("your payment: $result4")



}