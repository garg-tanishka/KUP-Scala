//Author - Tanishka Garg

package com.tanishka

import com.tanishka.Reverse.reverseOfString
import org.scalatest.flatspec.AnyFlatSpec

/*
Here, I have written test cases to check if valid inputs are passed how program behaves and vice-versa.
1. In first test case, I have provided the input as "Tanishka", whose reverse should be "akhsinaT" .
    Then, if (reverseOfString("Tanishka") == "akhsinaT") asserts true that means our function is behaving accurately.
    Therefore the test case gets passed. In this manner rest test cases are written.
 */
class ReverseTest extends AnyFlatSpec{

  "Reverse" should "be valid" in {
    val actualResult = reverseOfString("Tanishka")
    val expectedResult = "akhsinaT"
    assert(actualResult === expectedResult)
  }

  "Reverse" should "be valid if numbers are entered" in {
    val actualResult = reverseOfString("04011997")
    val expectedResult = "79911040"
    assert(actualResult === expectedResult)
  }

  "Reverse" should "be valid if special symbols are entered" in {
    val actualResult = reverseOfString("04/01/1997")
    val expectedResult = "7991/10/40"
    assert(actualResult === expectedResult)
  }

  "Reverse" should "be valid if tabs/spaces are entered" in {
    val actualResult = reverseOfString("Date of Birth - 04/01/1997")
    val expectedResult = "7991/10/40 - htriB fo etaD"
    assert(actualResult === expectedResult)
  }

  "Reverse" should "be valid if decimal numbers are entered" in {
    val actualResult = reverseOfString("04.01.1997")
    val expectedResult = "7991.10.40"
    assert(actualResult === expectedResult)
  }

  "Reverse" should "be valid if empty string is " in {
    val actualResult = reverseOfString("")
    val expectedResult = ""
    assert(actualResult === expectedResult)
  }

  "Reverse" should "be invalid" in {
    val actualResult = reverseOfString("Tanishka Garg")
    val expectedResult = "Tanishka Garg"
    assert(actualResult != expectedResult)
  }

}
