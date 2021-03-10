// Author - Tanishka Garg

package com.tanishka.Question2

import scala.io.StdIn.{readInt, readLine}

//Nested List for printing the table of each element of the List.
object TableOfEachElement {
  def tableOfEachElement(inputList: List[Int]): List[List[Int]] =
  { val finalResult = for (element <- inputList) yield {
    val result = for (multiplier <- 1 to 10) yield element * multiplier
      result.toList}
    finalResult}

  /* In main function, I have done following things :-
   Inside while loop, I have used try-catch block -
    * In try-block, I have taken two inputs from user i.e., sizeOfList and inputList for taking a List from user.
      Then I have called the tableOfEachElement method passing the inputList in parameters.
    * In catch-block, I have caught all NumberFormatException exceptions by showing a message - "Enter valid inputs."
 */
  def main(args: Array[String]): Unit = {
    var continue = "Y"
    while (continue == "Y") {
      try {
        print("Enter the total elements to be inserted in the List: ")
        val sizeOfList: Int = readInt()

        print(s"Enter $sizeOfList elements: \n")
        val inputList = List.fill(sizeOfList) {
          readInt()
        }
        print(s"The List is : $inputList")
        print("\nTables of Each Element are: " + tableOfEachElement(inputList))
      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }
  }
}
