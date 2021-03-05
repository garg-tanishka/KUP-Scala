//Author - Tanishka Garg

package com.tanishka

import com.tanishka.SortingImpl.mergeSorting
import org.scalatest.flatspec.AnyFlatSpec

/*
Here, I have written test cases to check if valid inputs are passed how program behaves and vice-versa.
1. In first test case, I have provided the input as List(120,588,89,3), whose result should be List(3,89,120,588) .
    Then, if (mergeSorting(List(120,588,89,3)) == List(3,89,120,588)) asserts true that means our function is behaving accurately.
    Therefore the test case gets passed. In this manner rest test cases are written.
 */
class SortingImplTest extends AnyFlatSpec{

  val input1 = 120
  val input2 = 588
  val input3 = 89
  val input4 = 3

  "Sorting" should "be valid" in {
    val actualResult = mergeSorting(List(input1,input2,input3,input4))
    val expectedResult = List(input4,input3,input1,input2)
    assert(actualResult === expectedResult)
  }

  "Sorting" should "be invalid" in {
    val actualResult = mergeSorting(List(input1,input2,input3,input4))
    val expectedResult = List(input1,input2,input3,input4)
    assert(actualResult != expectedResult)
  }

}