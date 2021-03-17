//Author - Tanishka Garg

package com.tanishka

object Calculator extends App{

  //method for addition of two values
  def addition(value1:Int, value2:Int):Int = value1 + value2

  //method for subtraction of two values
  def subtraction(value1:Int, value2:Int):Int = value1 - value2

  //method for multiplication of two values
  def multiplication(value1:Int, value2:Int):Long = value1 * value2

  //This method is for Division if the denominator/divisor is zero it will print the message and also return the value zero
  def division(value1:Int , value2:Int):Double = {
    var result = 0
    if(value2 != 0){
      result = value1/value2
    }
    else{
      print("Divisor can't be zero")
    }
    result
  }

  //method to loop through which the the value multiply itself until the loop's iteration does npt equal to power
  def power(value:Int , power:Int):Long = {
    var result = 1
    var temporary_variable = power
    while(temporary_variable != 0){
      result = result*value
      temporary_variable = temporary_variable - 1
    }
    result
  }

  /* Method to calculate the power of negative values.*/
  def powerForNegativeValues(value:Int, power: Int): Double ={
    val result = math.pow(value,power)
    result
  }

  //It will return always positive value
  def absolute(value: Int):Int = Math.abs(value)

  // Method to return modulus of two values
  def modulus(value1: Int , value2: Int): Int = value1 % value2

  //method to return maximum value
  def maximum(value1:Int,value2:Int):Int={
    var result = 0
    if(value1 > value2){
      result = value1
    }
    else{
     result =  value2
    }
    result
  }

  //method to return minimum value
  def minimum(value1:Int,value2:Int):Int={
    var result = 0
    if(value1 < value2){
      result = value1
    }
    else{
      result = value2
    }
    result
  }
}
