//Author - Tanishka Garg

package com.tanishka
import com.tanishka.Calculator.{absolute, addition, division, maximum, minimum, modulus, multiplication, power, powerForNegativeValues, subtraction}
import org.scalatest.flatspec.AnyFlatSpec

class CalculatorTest extends AnyFlatSpec {

  val positiveInput1:Int = 35
  val positiveInput2:Int = 5
  val negativeInput1:Int = -35
  val negativeInput2:Int = -5

  /* Below are the test cases where we are executing the test cases for Addition method
  * to check if method is giving valid results or not.
  */
  "Addition" should "be valid if both positive input entered" in {
    val actualResult = addition(positiveInput1, positiveInput2)
    val expectedResult = 40
    assert(actualResult === expectedResult)
  }
  "Addition" should "be valid if both negative input entered" in {
    val actualResult= addition(negativeInput1, negativeInput2)
    val expectedResult = -40
    assert(actualResult === expectedResult)
  }
  "Addition" should "be valid if one negative input entered before the sign" in {
    val actualResult= addition( negativeInput2, positiveInput1)
    val expectedResult = 30
    assert(actualResult === expectedResult)
  }
  "Addition" should "be valid if negative input entered after the sign" in {
    val actualResult= addition( positiveInput1, negativeInput2)
    val expectedResult = 30
    assert(actualResult === expectedResult)
  }
  "Addition" should "be invalid" in {
    val actualResult= addition( positiveInput1, negativeInput2)
    val expectedResult = 90
    assert(actualResult != expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Subtraction method
  * to check if method is giving valid results or not.
  */
  "Subtraction" should "be valid if both positive input entered" in {
    val actualResult= subtraction(positiveInput1, positiveInput2)
    val expectedResult = 30
    assert(actualResult === expectedResult)
  }
  "Subtraction" should "be valid if both negative input entered" in {
    val actualResult= subtraction(negativeInput1, negativeInput2)
    val expectedResult = -30
    assert(actualResult === expectedResult)
  }
  "Subtraction" should "be valid if one negative input entered before the operator" in {
    val actualResult= subtraction( negativeInput2, positiveInput1)
    val expectedResult = -40
    assert(actualResult === expectedResult)
  }
  "Subtraction" should "be valid if negative input entered after the operator" in {
    val actualResult= subtraction( positiveInput1, negativeInput2)
    val expectedResult = 40
    assert(actualResult === expectedResult)
  }
  "Subtraction" should "be invalid" in {
    val actualResult= subtraction( positiveInput1, negativeInput2)
    val expectedResult = 400
    assert(actualResult != expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Multiplication method
  * to check if method is giving valid results or not.
  */
  "Multiplication" should "be valid if positive number entered" in {
    val actualResult= multiplication(positiveInput1, positiveInput2)
    val expectedResult = 175
    assert(actualResult === expectedResult)
  }
  "Multiplication" should "be valid if negative number entered" in {
    val actualResult= multiplication(negativeInput1, negativeInput2)
    val expectedResult = 175
    assert(actualResult === expectedResult)
  }
  "Multiplication" should "be valid if one negative input entered before the operator" in {
    val actualResult= multiplication( negativeInput2, positiveInput1)
    val expectedResult = -175
    assert(actualResult === expectedResult)
  }
  "Multiplication" should "be valid if negative input entered after the operator" in {
    val actualResult= multiplication( positiveInput1, negativeInput2)
    val expectedResult = -175
    assert(actualResult === expectedResult)
  }
  "Multiplication" should "be invalid" in {
    val actualResult= multiplication( positiveInput1, negativeInput2)
    val expectedResult = 4290
    assert(actualResult != expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Division method
  * to check if method is giving valid results or not.
  */
  "Division" should "be valid if positive number entered" in {
    val actualResult= division(positiveInput1, positiveInput2)
    val expectedResult = 7
    assert(actualResult === expectedResult)
  }

  "Division" should "be valid if negative input entered" in {
    val actualResult= division(negativeInput1, negativeInput2)
    val expectedResult = 7
    assert(actualResult === expectedResult)
  }

  "Division" should "be valid if one negative input entered before the operator" in {
    val actualResult= division( negativeInput2, positiveInput1)
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }
  "Division" should "be valid if negative input entered after the operator" in {
    val actualResult= division( positiveInput1, negativeInput2)
    val expectedResult = -7
    assert(actualResult === expectedResult)
  }
  "Division" should "be invalid" in {
    val actualResult= division( positiveInput1, negativeInput2)
    val expectedResult = 89
    assert(actualResult != expectedResult)
  }
  "Division" should "be invalid if denominator is 0 " in {
    val actualResult= division( 0,positiveInput1 )
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Power method and powerForNegativeValues
   * to check if method is giving valid results or not.
   */
  "Power" should "be valid if both inputs are positive numbers" in {
    val result= power(positiveInput2,positiveInput2)
    assert(result==3125)
  }

  "power" should "be valid if both inputs are negative" in {
    val result= powerForNegativeValues(negativeInput1, negativeInput2)
    assert(result== -1.9039685845183556E-8)
  }

  "Power" should "be valid if input before operator is negative" in {
    val expectedResult = -618402555
    val result= power(negativeInput1, positiveInput1)
    assert(result== expectedResult)
  }
  "Power" should "be valid if negative input is after operator" in {
    val result= powerForNegativeValues(positiveInput2, negativeInput2)
    assert(result== 3.2E-4)
  }

  "Power" should "be invalid" in {
    val result= powerForNegativeValues(positiveInput2, negativeInput2)
    assert(result!= -0.04)
  }

  /* Below are the test cases where we are executing the test cases for Absolute method
  * to check if method is giving valid results or not.
  */
  "Absolute" should "be valid if positive input entered" in {
    val actualResult= absolute(positiveInput1)
    val expectedResult = 35
    assert(actualResult === expectedResult)
  }
  "Absolute" should "be valid if negative input entered" in {
    val actualResult= absolute(negativeInput1)
    val expectedResult = 35
    assert(actualResult === expectedResult)
  }
  "Absolute" should "be invalid" in {
    val actualResult= absolute( positiveInput1)
    val expectedResult = 350
    assert(actualResult != expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Modulus method
  * to check if method is giving valid results or not.
  */
  "Modulus" should "be valid if both positive input entered" in {
    val actualResult= modulus(positiveInput1, positiveInput2)
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }
  "Modulus" should "be valid if both negative input entered" in {
    val actualResult= modulus(negativeInput1, negativeInput2)
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }
  "Modulus" should "be valid if one negative input entered before the operator" in {
    val actualResult= modulus( negativeInput2, positiveInput1)
    val expectedResult = -5
    assert(actualResult === expectedResult)
  }
  "Modulus" should "be valid if negative input entered after the operator" in {
    val actualResult= modulus( positiveInput1, negativeInput2)
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }
  "Modulus" should "be invalid" in {
    val actualResult= modulus( positiveInput1, negativeInput2)
    val expectedResult = 149
    assert(actualResult != expectedResult)
  }
  "Modulus" should "be invalid if denominator is 0 " in {
    val actualResult= modulus(0, positiveInput1)
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Maximum method
  * to check if method is giving valid results or not.
  */
  "Maximum" should "be valid if both positive input entered" in {
    val actualResult= maximum(positiveInput1, positiveInput2)
    val expectedResult = 35
    assert(actualResult === expectedResult)
  }
  "Maximum" should "be valid if both negative input entered" in {
    val actualResult= maximum(negativeInput1, negativeInput2)
    val expectedResult = -5
    assert(actualResult === expectedResult)
  }
  "Maximum" should "be valid if one negative input entered before the operator" in {
    val actualResult= maximum( negativeInput2, positiveInput1)
    val expectedResult = 35
    assert(actualResult === expectedResult)
  }
  "Maximum" should "be valid if negative input entered after the operator" in {
    val actualResult= maximum( positiveInput1, negativeInput2)
    val expectedResult = 35
    assert(actualResult === expectedResult)
  }
  "Maximum" should "be valid if both inputs are same" in {
    val actualResult= maximum( positiveInput1, positiveInput1)
    val expectedResult = 35
    assert(actualResult === expectedResult)
  }
  "Maximum" should "be invalid" in {
    val actualResult= maximum( positiveInput1, negativeInput2)
    val expectedResult = 110
    assert(actualResult != expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Minimum method
  * to check if method is giving valid results or not.
  */
  "Minimum" should "be valid if both positive input entered" in {
    val actualResult= minimum(positiveInput1, positiveInput2)
    val expectedResult = 5
    assert(actualResult === expectedResult)
  }
  "Minimum" should "be valid if both negative input entered" in {
    val actualResult= minimum(negativeInput1, negativeInput2)
    val expectedResult = -35
    assert(actualResult === expectedResult)
  }
  "Minimum" should "be valid if one negative input entered before the operator" in {
    val actualResult= minimum( negativeInput2, positiveInput1)
    val expectedResult = -5
    assert(actualResult === expectedResult)
  }
  "Minimum" should "be valid if negative input entered after the operator" in {
    val actualResult= minimum( positiveInput1, negativeInput2)
    val expectedResult = -5
    assert(actualResult === expectedResult)
  }
  "Minimum" should "be valid if both inputs are same" in {
    val actualResult= minimum( positiveInput1, positiveInput1)
    val expectedResult = 35
    assert(actualResult === expectedResult)
  }
  "Minimum" should "be invalid" in {
    val actualResult= minimum( positiveInput1, negativeInput2)
    val expectedResult = 35
    assert(actualResult != expectedResult)
  }
}