//Author - Tanishka Garg

package com.tanishka

import scala.io.StdIn.{readInt, readLine}
import scala.annotation.tailrec
import scala.collection.immutable.List

/*
SortingImpl object is extended by App. In object we are doing the following things:
  * Inside while loop, I have used try-catch block -
  * In try block, I am taking inputList inputs from user by populating the List through List.fill(sizeOfList).
      And then invoking mergeSorting(inputList).
  * In catch-block, I have caught all NumberFormatException exceptions by showing a message - "Enter valid inputs."
*/

object SortingImpl extends App {

  var continue = "Y"
  while (continue == "Y") {
    try{
      print("Enter the total elements to be inserted in the List: ")
      val sizeOfList:Int = readInt()

      print(s"Enter $sizeOfList elements: \n")
      val inputList = List.fill(sizeOfList){
        readInt()
      }

      print(s"Unsorted List : $inputList")

      print("\nSorted List : " + mergeSorting(inputList))
    }
    catch{
      case _: NumberFormatException => print("Enter valid inputs.")
    }
    print("\nDo you want to continue (Y or N): ")
    continue = readLine()
  }

  /*
  In mergeSorting(inputList: List[Int]): List[Int] , I have taken one argument of List[Int] and returned a List[Int].
    Then I am matching the expressions by inputList. Following are the match cases :
    * case Nil => Nil [ This means if the List entered is nil, return Nil ]
    * case xs :: Nil => List(xs) [ This means if the List has only one item, return that item as it is.]
    * In default case I have divided the inputList in two halves and stored the first part in leftMergedList and second part in rightMergedList.
        Lastly, I called the tail recursive mergeSort(mergeSorting(leftMergedList), mergeSorting(rightMergedList)) method.

        Dry Run : inputList[3,7,2,9]
                  4/2 = 2
                  leftMergedList[3,7], rightMergedList[2,9]
  */

  def mergeSorting(inputList: List[Int]): List[Int] = inputList match {
    case Nil => Nil
    case inputList :: Nil => List(inputList)
    case _ =>
      val (leftMergedList, rightMergedList) = inputList splitAt inputList.length / 2
      mergeSort(mergeSorting(leftMergedList), mergeSorting(rightMergedList))
  }

  /*
  In mergeSort(leftMergedList: List[Int], rightMergedList: List[Int], accumulator: List[Int] = List()): List[Int] ,
    I have taken 3 List[Int] as parameters and returned a List[Int].
    Then I am matching the expressions by leftMergeList and rightMergeList. Following are the match cases :
    * case (Nil, _) => accumulator ++ rightMergedList [This means if leftMergedList is empty then return concatenated accumulator list and rightMergedList. ]
    * case (_, Nil) => accumulator ++ leftMergedList [This means if rightMergedList is empty then return concatenated accumulator list and leftMergedList. ]
    * Then in last case I have used if-else loop where I am recursively checking the top element of both the list
        if (topElementOfLeftList < topElementOfRightList) then topElementOfLeftList will be appended in sortedList
        else topElementOfRightList will be appended in sortedList.

        Dry Run :  leftMergedList[3,7], rightMergedList[2,9]
                    3 > 2 => [3,7] , [9] :: [2]
                    3 < 9 => [7] ,[9] :: [2,3]
                    7 < 9 => [Nil] , [9] :: [2,3,7]
                    case (Nil, [9]) => [Nil] , [Nil] :: [2,3,7,9]
   */

  @tailrec
  def mergeSort(leftMergedList: List[Int], rightMergedList: List[Int], sortedList: List[Int] = List()): List[Int] = (leftMergedList, rightMergedList) match {
    case (Nil, _) => sortedList ++ rightMergedList
    case (_, Nil) => sortedList ++ leftMergedList
    case (topValueOfLeftList :: leftListWithoutTopValue, topValueOfRightList :: rightListWithoutTopValue) => if (topValueOfLeftList < topValueOfRightList) {
      mergeSort(leftListWithoutTopValue, rightMergedList, sortedList :+ topValueOfLeftList)
    } else {
      mergeSort(leftMergedList, rightListWithoutTopValue, sortedList :+ topValueOfRightList)
    }
  }
}
