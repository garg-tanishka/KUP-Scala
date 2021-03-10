// Author - Tanishka Garg

package com.tanishka.Question3

import scala.io.StdIn.{readChar, readLine}

object Stack {

  var inputList: List[Any] = List.empty
  var top: Int = -1

  // inserts an element into the stack by updating the top value(top = top + 1) and inserting the element in the inputList.
  def push(element:Any):String = {
    top = top + 1
    inputList = inputList ::: List(element)
    "Element has been Inserted."
  }

  // deletes an element from the stack if stack is non-empty by dropping the element from the stack and updating the top value(top = top - 1).
  def pop(): String = {
    if (top == -1) {
      "Stack Underflow."
    }
    else {
      inputList = inputList.dropRight(1)
      top = top - 1
      "Element has been deleted."
    }
  }

  // to print the stack if stack is non-empty.
  def printStack():String = {
    if (top == -1) {
      "Stack is Empty."
    }
    else{
      val values = for(element <- inputList) yield element
      values.reverse.toString()
    }
  }

  // checks whether stack is empty or not by checking the top value. If top == -1 then true else false
  def isEmpty:Boolean = {
    if (top == -1) {
      true
    }
    else {
      false
    }
  }

  // finds the size of the stack by the in-built method "length"
  def size:Int = inputList.length

  // returns the top element of the stack by checking if Stack is non-empty then returning top element else -1
  def peek: Any = {
    if (top >= 0) {
      inputList(top)
    }
    else {
      top
    }
  }

  /* Inside the main method following things are done:
   1. Declarations of final variables for match cases.
   2. Menu for Stack.
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

    print("\n1. Pushing the elements in the Stack: ")
    print("\n2. Popping the elements from the Stack: ")
    print("\n3. Display the stack: ")
    print("\n4. Checking is the Stack empty or not: ")
    print("\n5. Display the Top element from the Stack: ")

    print("\n**********************************************")
    var continue = 'Y'
    while (continue == 'Y' || continue == 'y') {
      try {
        print("\nEnter the number to perform the operation : ")
        val inputForOperation: Int = readLine().toInt

        inputForOperation match {
          case ONE => print("Enter elements to enter in the stack: ")
            val inputFromUser = readLine()
            push(inputFromUser)
          case TWO => pop()
            print("Element deleted")
          case THREE => print("Elements inside the Stack are: ")
            printStack().foreach(print)
          case FOUR => print(isEmpty)
          case FIVE => print("Top element of Stack is: ")
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
