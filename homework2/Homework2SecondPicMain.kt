package com.example.myapplication.homework2

fun main() {

    val hwFuncs = Homework2SecondPicFunctions()

    //Usages of First question function

    var result = hwFuncs.question1(35) //Testing Integer value
    println("Fahrenheit degree: $result °F")

    result = hwFuncs.question1(43.4) //Testing Double value
    println("Fahrenheit degree: $result °F")

    result = hwFuncs.question1(-35) //Testing negative Value
    println("Fahrenheit degree: $result °F")

    result = hwFuncs.question1(0) //Testing zero
    println("Fahrenheit degree: $result °F")
    println("---------------------------------")


    //Usages of Second question function

    hwFuncs.question2(3,5) //Testing Integer values

    hwFuncs.question2(4.5,5.0) //Testing Double values

    println("---------------------------------")


    //Usages of Third question function

    //With normal integer values
    var result2 = hwFuncs.question3(5)
    println("Factorial result: $result2")

    result2 = hwFuncs.question3(3)
    println("Factorial result: $result2")

    //With 1
    result2 = hwFuncs.question3(1)
    println("Factorial result: $result2")

    //With 0
    result2 = hwFuncs.question3(0)
    println("Factorial result: $result2")

    //With negative values
    result2 = hwFuncs.question3(-35)
    println("Factorial result: $result2")

    println("---------------------------------")


    //Usages of Fourth question function


    hwFuncs.question4("merhaba") //Testing with all lowercase

    hwFuncs.question4("MERHABA") //Testing with all uppercase

    hwFuncs.question4("Anlamadım") //Testing with mixed uppercase and lowercase

}