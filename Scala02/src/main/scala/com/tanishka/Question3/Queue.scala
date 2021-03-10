// Author - Tanishka Garg
package com.tanishka.Question3

import scala.io.StdIn.{readChar, readLine}

object Queue {

  var inputList: List[Any] = List()
  var front: Int = -1
  var rear: Int = -1

 /*This method is for ENQUEUE where we are checking if the Queue is empty then we are updating the front, rear value and inserting a value in InputList.
  And if the Queue is non-empty then we are inserting the values by rear end, by updating rear value and inserting a value in InputList.*/
  def enqueue(element:Any):String = {
    if (front== -1 && rear == -1) {
      front = front + 1
      rear = rear + 1
      inputList = inputList ::: List(element)
      "Element has been Inserted."
    }
    else{
      rear = rear + 1
      inputList = inputList ::: List(element)
      "Element has been inserted."
    }
  }

 /*This method is for DEQUEUE where we are deleting the elements from the queue,if the queue is empty then we are printing "Queue is empty",
  else if queue has only one element we are updating the values of rear and front by -1 and dropping that one element from inputList,
  else we are dropping the element from the inputList and updating the value of front.*/
  def dequeue(): String = {
    if (front== -1 && rear == -1){
      "Queue is empty."
    }
    else if(front == rear){
      inputList = inputList.drop(1)
      front = -1
      rear = -1
      "Element has been deleted."
    }
    else{
      inputList = inputList.drop(1)
      front = front + 1
      "Element has been deleted."
    }
  }

  // Prints elements of the Queue who is non-empty else prints "Queue is empty."
  def printQueue():String = {
    if (front== -1 && rear == -1){
      "Queue is empty."
    }
    else{
      val values = for(element <- inputList) yield element
      values.toString()
    }
  }

  // finds the size of the queue by the in-built method "length"
  def size:Int = inputList.length

  // returns the top element of the queue by checking if Stack is non-empty then returning top element else -1
  def peek: Any = {
    if (front >= 0){
      inputList(front)
    }
    else {
      front
    }
  }

  // checks whether queue is empty or not by checking the top value. If top == -1 then true else false
  def isEmpty:Boolean = {
    if (front == -1 || rear == -1) {
      true
    }
    else {
      false
    }
  }

  /* Inside the main method following things are done:
   1. Declarations of final variables for match cases.
   2. Menu for Queue.
   3. Then, inside while loop I have used Try-catch block for validations.
   5. In try block,
        firstly input value from users is taken through ReadLine for selecting the operation to perform in "inputForOperation" variable.
        Secondly five match cases + default case are written and in them corresponding methods are called.
   6. In catch block,
        Exception for NumberFormatException are caught if any error occurred
 */

  def main(args: Array[String]): Unit = {
    val ONE = 1
    val TWO = 2
    val THREE = 3
    val FOUR = 4
    val FIVE = 5

    print("**********************************************")

    print("\n \t \t \t  QUEUE")
    print("\n1. Enqueue the elements in the Queue: ")
    print("\n2. Dequeue the elements from the Queue: ")
    print("\n3. Display the Queue: ")
    print("\n4. Checking is the Queue empty or not: ")
    print("\n5. Display the Front element from the Queue: ")

    print("\n**********************************************")
    var continue = 'Y'
    while (continue == 'Y' || continue == 'y') {
      try {
        print("\nEnter the number to perform the operation : ")
        val inputForOperation: Int = readLine().toInt

        inputForOperation match {
          case ONE => print("Enter elements to enter in the queue: ")
            val inputFromUser = readLine()
            enqueue(inputFromUser)
          case TWO => dequeue()
            print("Element Deleted.")
          case THREE => print("Elements inside the Queue are: ")
            printQueue().foreach(print)
          case FOUR => print(isEmpty)
          case FIVE =>  print("Top element of Queue is: ")
            print(peek)
          case _ => print("Enter a valid Option")
        }
      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
      }
      print("\nDo you want to go back to the Main Menu (Y or N): ")
      continue = readChar()
    }
  }
}
