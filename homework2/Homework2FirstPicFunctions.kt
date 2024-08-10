package com.example.myapplication.homework2

class Homework2FirstPicFunctions {

    //question1 function

    fun question1(edgeCount : Int) :Int {

        if(edgeCount<=2){ //check if it is
            println("edge count cannot be smaller than 3")
            return -1
        }
        return (edgeCount-2) * 180

    }

    //Question2 function


    fun question2(dayCount:Int) :Int {

        var wage=0

        if(dayCount>31) { //Checking for impossible value
            print("There cannot be days more than 31 in a month!  ")
            return -1
        }

        var hours = dayCount*8


        if(dayCount<=0){ //Checking for impossible value
            println("Days cannot be smaller than zero.")
            return -1

        }

        if(hours<=160){ //Checking for first 160 hours
            wage= hours*10

        }else{ //Checking for extra hours
            wage = 160*10
            var extra = hours-160
            wage += extra*20
            return wage
        }

        return wage

    }



    fun question3(quota:Double) :Int {
        var standardPayment = 100
        if(quota>50){ //Checking for if quota is bigger than 50
            println("(You must have purchased an extra package. But it is undefined yet.)  ")
            return standardPayment
        }
        if(quota>=0){ //Checking for normal usage and not finished quota
            return standardPayment
        }else {

            if(quota<Math.ceil(quota)){ //Checking the after finished quota is used partially or completely
                standardPayment+=4
                standardPayment += Math.ceil(quota).toInt() * -4
                return standardPayment
            }else{
                standardPayment += Math.ceil(quota).toInt() * -4
                return standardPayment
            }



        }

    }


    //Overriding for Int values
    fun question3(quota:Int) :Int {
        var standardPayment = 100
        if(quota>50){ //Checking for if quota is bigger than 50
            println("(You must have purchased an extra package. But it is undefined yet.)  ")
            return standardPayment
        }
        if(quota>=0){  //Checking for normal usage and not finished quota
            return standardPayment
        }else { //Checking for extra usage
                standardPayment += quota * -4
                return standardPayment




        }

    }
}