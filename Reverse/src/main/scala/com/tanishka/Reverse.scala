//Author - Tanishka Garg

package com.tanishka

import scala.annotation.tailrec
import scala.io.StdIn.readLine

/* Reverse object is extended by App. In object I am doing the following things:
  * Inside while loop, I have used try-catch block -
  * In try-block, I have taken one input(inputString) from user then using if-else block following action take place-
      In if-block : if inputString == "" then printing "The string entered was empty."
      And in else-block : I am calling reverseOfString(inputString)
  * In catch-block, I have caught all NumberFormatException exceptions by showing a message - "Enter valid inputs."
 */
object Reverse extends App{
  var continue = "Y"
  while (continue == "Y"){
    print("Enter the string: ")
    val inputString = readLine()

    if(inputString == ""){
      print("The string entered was empty.")
    }
    else{
      print("The Reversed String: " + reverseOfString(inputString))
    }

    print("\nDo you want to continue (Y or N): ")
    continue = readLine()
  }

  /*
  In reverseOfString(inputString: String): String,
    * I have taken one parameter as String(inputString) and returning a String.
    * Then I have converted inputString to list in inputCharList variable.
    * Now, In reverseWithAccumulator two parameters are passed both Char[List] and returning a Char[List].
       Then I am matching the expressions by inputCharList. Following are the match cases :
    * case Nil => Nil [ This means if the List entered is nil, return Nil ]
    * In the last case, I am recursively picking top element from the charList and storing it in reverseCharList list,
      Till charList becomes Nil and reverseCharList contains all the elements.

      Dry Run - inputString - "tanu"
                inputCharList - List['t','a','n','i','s','h','k','a']

                List['a','n','i','s','h','k','a'] :: List['t']
                List['n','i','s','h','k','a'] :: List['a','t']
                List['i','s','h','k','a'] :: List['n','a','t']
                List['s','h','k','a'] :: List['i','n','a','t']
                List['h','k','a'] :: List['s','i','n','a','t']
                List['k','a'] :: List['h','s','i','n','a','t']
                List['a'] :: List['k',h','s','i','n','a','t']
                List[Nil] :: List['a',k',h','s','i','n','a','t']
   */
  def reverseOfString(inputString: String): String = {
    val inputCharList = inputString.toList
    @tailrec
    def reverseWithAccumulator(inputCharList: List[Char], reverseCharList: List[Char]): List[Char] = inputCharList match {
      case Nil => reverseCharList
      case topElementOfCharList :: charListWithoutTopElement => reverseWithAccumulator(charListWithoutTopElement, topElementOfCharList :: reverseCharList)
    }
    reverseWithAccumulator(inputCharList, Nil).mkString
  }


  /*Another way of reversing a String is by simply using for-loop from the length of string to 0*/

 /* def reverseOfString(inputStringList: String) : String =
    (for(i <- inputStringList.length until 0 by -1) yield inputStringList(i-1)).mkString*/
}
