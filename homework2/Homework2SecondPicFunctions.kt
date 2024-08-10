package com.example.myapplication.homework2

class Homework2SecondPicFunctions {


    //Question1 function
    fun question1(celciusDegree : Double) : Double {

        return (celciusDegree*1.8) +32

    }
    //Overriding for possibility of Integer degrees
    fun question1(celciusDegree : Int) : Double {

        return (celciusDegree*1.8) +32

    }

    //Question2 Function
    fun question2(firstEdge :Int,secondEdge:Int) {
        var result = (firstEdge+secondEdge) *2
        println("Perimeter of rectangle: $result cm. ")
    }

    //Overriding for possibility of Double values
    fun question2(firstEdge :Double,secondEdge:Double) {
        var result = (firstEdge+secondEdge) *2
        println("Perimeter of rectangle: $result cm. ")
    }

    //Question3 Function

    fun question3(number: Int) : Int {
        var result=1

        if (number<0) { //Check if it is negative
            println("The number is smaller than zero. Cannot be calculated")
            return -1
        }
        else if(number==0){ //Check if it is zero
            return 1
        }else{
            for (i in 1..number){
                result *=i
            }
            return result
        }

    }

    //Question4 Function

    fun question4(word:String) {
        val smallACount = word.count{it=='a'}
        val capitalACount = word.count{it=='A'}
        val result = smallACount + capitalACount


        println("The word has $result a letters/letter")


    }



}