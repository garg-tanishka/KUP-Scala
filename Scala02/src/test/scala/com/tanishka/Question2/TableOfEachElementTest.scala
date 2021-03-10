// Author - Tanishka Garg

package com.tanishka.Question2

import com.tanishka.Question2.TableOfEachElement.tableOfEachElement
import org.scalatest.flatspec.AnyFlatSpec

//Test cases for validating tableOfEachElement is working in the appropriate manner or not
class TableOfEachElementTest extends AnyFlatSpec {

  val result1 = 2
  val result2 = 4
  val result3 = 6
  val result4 = 8
  val result5 = 10
  val result6 = 12
  val result7 = 14
  val result8 = 16
  val result9 = 18
  val result10 = 20
  val result11 = 5
  val result12 = 7
  val result13 = 9

  "Table" should "be valid" in {
    val actualResult = tableOfEachElement(List(2,1))
    val expectedResult = List(List(result1,result2,result3,result4,result5,result6,result7,result8,result9,result10),
      List(1,2,3,result2,result11,result3,result12,result4,result13,result5))
    assert(actualResult === expectedResult)
  }

  "Table" should "be invalid" in {
    val actualResult = tableOfEachElement(List(2))
    val expectedResult = List(List(result10,result2,result3,result4,result5,result6,result7,result8,result9,result10))
    assert(actualResult != expectedResult)
  }

}

