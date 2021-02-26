//Author - Tanishka Garg

package com.tanishka
import scala.io.StdIn.readLine

/* Calculator object is extended by App. In object we are doing the following things:
   1. Declarations of final variables for match cases.
   2. Menu for Calculator.
   3. A method i.e.. "inputFromUser" for taking inputs from user through ReadLine.
   4. Then, inside while loop I have used Try-catch block for validations.
   5. In try block,
        firstly input value from users is taken through ReadLine for selecting the operation to perform in "inputForOperation" variable.
        Secondly nine match cases + default case are written and in them corresponding OperationImpl methods are called.
   6. In catch block,
        Exception for NumberFormatException are caught if any error occurred
 */
object Calculator extends App{

  val ONE = 1
  val TWO = 2
  val THREE = 3
  val FOUR =4
  val FIVE = 5
  val SIX = 6
  val SEVEN = 7
  val EIGHT = 8
  val NINE = 9

  print("**********************************************")

  print("\n1. Addition")
  print("\n2. Subtraction")
  print("\n3. Multiplication")
  print("\n4. Division")
  print("\n5. Power")
  print("\n6. Absolute")
  print("\n7. Modulus")
  print("\n8. Maximum of Two Numbers")
  print("\n9. Minimum of Two Numbers")

  print("\n**********************************************")

  def inputFromUser:(Double, Double)={
    print("Enter 1st value: ")
    val input1ByUser: Double = readLine().toDouble

    print("Enter 2nd value: ")
    val input2ByUser: Double = readLine().toDouble

    (input1ByUser,input2ByUser)
  }

  var continue = "Y"
  while (continue == "Y") {
    try {
      print("\nEnter the number to perform the operation : ")
      val inputForOperation:Int = readLine().toInt

      inputForOperation match {
        case ONE =>
          val (input1ByUser,input2ByUser) = inputFromUser
          val result = OperationsImpl.addition(input1ByUser, input2ByUser)
          print(s"Result :  $result")

        case TWO =>
          val (input1ByUser,input2ByUser) = inputFromUser
          val result = OperationsImpl.subtraction(input1ByUser, input2ByUser)
          print(s"Result :  $result")

        case THREE =>
          val (input1ByUser,input2ByUser) = inputFromUser
          val result = OperationsImpl.multiplication(input1ByUser, input2ByUser)
          print(s"Result :  $result")

        case FOUR =>
          val (input1ByUser,input2ByUser) = inputFromUser
          if(input2ByUser==0){
            print("Denominator cannot be zero")
          }
          else{
            val result = OperationsImpl.division(input1ByUser, input2ByUser)
            print(s"Result :  $result")
          }

        case FIVE =>
          val (input1ByUser,input2ByUser) = inputFromUser
          val result = OperationsImpl.power(input1ByUser, input2ByUser)
          print(s"Result :  $result")

        case SIX =>
          print("Enter the value: ")
          val inputByUser: Double = readLine().toDouble
          val result = OperationsImpl.absolute(inputByUser)
          print(s"Result :  $result")

        case SEVEN =>
          val (input1ByUser,input2ByUser) = inputFromUser
          if(input2ByUser==0){
            print("Denominator cannot be zero")
          }
          else{
            val result = OperationsImpl.division(input1ByUser, input2ByUser)
            print(s"Result :  $result")
          }

        case EIGHT =>
          val (input1ByUser,input2ByUser) = inputFromUser
          if(input1ByUser == input2ByUser){
            print("Both inputs are equal")
          }
          else{
            val result = OperationsImpl.maximum(input1ByUser, input2ByUser)
            print(s"Result :  $result")
          }

        case NINE =>
          val (input1ByUser,input2ByUser) = inputFromUser
          if(input1ByUser == input2ByUser){
            print("Both inputs are equal")
          }
          else{
            val result = OperationsImpl.minimum(input1ByUser, input2ByUser)
            print(s"Result :  $result")
          }

        case _ =>
          print("Invalid Input.")
      }
    }
    catch
      {
        case _: NumberFormatException => print("Enter valid inputs.")
      }
    print("\nDo you want to continue (Y or N): ")
    continue = readLine()
  }
}

