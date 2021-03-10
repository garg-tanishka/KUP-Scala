// Author - Tanishka Garg

package com.tanishka.Question1

import scala.annotation.tailrec
import scala.io.StdIn.{readInt, readLine}

object LastElement {

  /* Method for returning the last element from the List where I have used three match cases :
  1. In first matching if there is only one element in the list, then return that element.
  2. The second matching takes the tail of the List(the first element is not even stored,
  it is ignored by the _ wildcard) and calls itself on the remaining values.
  3. In third matching if there is no element in the List i.e., Empty List, throw NoSuchElementException Exception.*/
  @tailrec
  def lastElement[A](inputList:List[A]):A = inputList match {
    case headElementOfList :: Nil => headElementOfList
    case _ :: tailOfList => lastElement(tailOfList)
    case _ => throw new NoSuchElementException
  }

  /* In main function, I have done following things :-
   Inside while loop, I have used try-catch block -
    * In try-block, I have taken two inputs from user i.e., sizeOfList and inputList for taking a List from user.
      Then I have called the lastElement method passing the inputList in parameters.
    * In catch-block, I have caught all NumberFormatException exceptions and NoSuchElementException by showing a message - "Enter valid inputs."
 */
  def main(args: Array[String]): Unit = {
    var continue = "Y"
    while (continue == "Y") {
      try {
        print("Enter the total elements to be inserted in the List: ")
        val sizeOfList: Int = readInt()

        print(s"Enter $sizeOfList elements: \n")
        val inputList = List.fill(sizeOfList) {
          readLine()
        }
        print(s"The List is : $inputList")
        print("\nThe Last Element of List is: " + lastElement(inputList))
      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
        case _: NoSuchElementException => print("\nEnter valid inputs.")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }
  }
}
