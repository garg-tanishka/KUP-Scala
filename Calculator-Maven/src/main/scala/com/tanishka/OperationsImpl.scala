//Author - Tanishka Garg

package com.tanishka

/* In OperationsImpl object we are doing the following things:
    1. Created nine methods for performing the operations i.e..
          Addition, Subtraction, Multiplication, Division, Power, Absolute, Modules, Maximum and Minimum
 */
object OperationsImpl {

  val result = 0

  def addition(input1ByUser:Double, input2ByUser:Double): Double = input1ByUser + input2ByUser

  def subtraction(input1ByUser:Double, input2ByUser:Double): Double = input1ByUser - input2ByUser

  def multiplication(input1ByUser:Double, input2ByUser:Double): Double = input1ByUser * input2ByUser

  def division(input1ByUser:Double, input2ByUser:Double):Double= input1ByUser / input2ByUser

  def power(input1ByUser:Double, input2ByUser:Double): Double = scala.math.pow(input1ByUser,input2ByUser)

  def absolute(inputByUser:Double): Double = inputByUser.abs

  def modulus(input1ByUser:Double, input2ByUser:Double):Double= {
    if(input2ByUser==0){
      result
    }
    else{
      input1ByUser % input2ByUser
    }
  }

  def maximum(input1ByUser:Double, input2ByUser:Double):Double= {
    if (input1ByUser > input2ByUser) {
      input1ByUser
    } else{
      input2ByUser
    }
  }

  def minimum(input1ByUser:Double, input2ByUser:Double):Double= {
    if (input1ByUser < input2ByUser) {
      input1ByUser
    } else{
      input2ByUser
    }
  }

}
