//Author - Tanishka Garg

package com.tanishka
import org.scalatest.flatspec.AnyFlatSpec

class OperationImplTest extends AnyFlatSpec {

  val positiveInput1:Double = 39
  val positiveInput2:Double = 110
  val negativeInput1:Double = -39
  val negativeInput2:Double = -110

  /* Below are the test cases where we are executing the test cases for Addition method
  * to check if method is giving valid results or not.
  */
  "Addition" should "be valid if both positive input entered" in {
    val actualResult = OperationsImpl.addition(positiveInput1, positiveInput2)
    val expectedResult = 149
    assert(actualResult === expectedResult)
  }
  "Addition" should "be valid if both negative input entered" in {
    val actualResult= OperationsImpl.addition(negativeInput1, negativeInput2)
    val expectedResult = -149
    assert(actualResult === expectedResult)
  }
  "Addition" should "be valid if one negative input entered before the sign" in {
    val actualResult= OperationsImpl.addition( negativeInput2, positiveInput1)
    val expectedResult = -71
    assert(actualResult === expectedResult)
  }
  "Addition" should "be valid if negative input entered after the sign" in {
    val actualResult= OperationsImpl.addition( positiveInput1, negativeInput2)
    val expectedResult = -71
    assert(actualResult === expectedResult)
  }
  "Addition" should "be invalid" in {
    val actualResult= OperationsImpl.addition( positiveInput1, negativeInput2)
    val expectedResult = 71
    assert(actualResult != expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Subtraction method
  * to check if method is giving valid results or not.
  */
  "Subtraction" should "be valid if both positive input entered" in {
    val actualResult= OperationsImpl.subtraction(positiveInput1, positiveInput2)
    val expectedResult = -71
    assert(actualResult === expectedResult)
  }
  "Subtraction" should "be valid if both negative input entered" in {
    val actualResult= OperationsImpl.subtraction(negativeInput1, negativeInput2)
    val expectedResult = 71
    assert(actualResult === expectedResult)
  }
  "Subtraction" should "be valid if one negative input entered before the operator" in {
    val actualResult= OperationsImpl.subtraction( negativeInput2, positiveInput1)
    val expectedResult = -149
    assert(actualResult === expectedResult)
  }
  "Subtraction" should "be valid if negative input entered after the operator" in {
    val actualResult= OperationsImpl.subtraction( positiveInput1, negativeInput2)
    val expectedResult = 149
    assert(actualResult === expectedResult)
  }
  "Subtraction" should "be invalid" in {
    val actualResult= OperationsImpl.subtraction( positiveInput1, negativeInput2)
    val expectedResult = -149
    assert(actualResult != expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Multiplication method
  * to check if method is giving valid results or not.
  */
  "Multiplication" should "be valid if positive number entered" in {
    val actualResult= OperationsImpl.multiplication(positiveInput1, positiveInput2)
    val expectedResult = 4290
    assert(actualResult === expectedResult)
  }
  "Multiplication" should "be valid if negative number entered" in {
    val actualResult= OperationsImpl.multiplication(negativeInput1, negativeInput2)
    val expectedResult = 4290
    assert(actualResult === expectedResult)
  }
  "Multiplication" should "be valid if one negative input entered before the operator" in {
    val actualResult= OperationsImpl.multiplication( negativeInput2, positiveInput1)
    val expectedResult = -4290
    assert(actualResult === expectedResult)
  }
  "Multiplication" should "be valid if negative input entered after the operator" in {
    val actualResult= OperationsImpl.multiplication( positiveInput1, negativeInput2)
    val expectedResult = -4290
    assert(actualResult === expectedResult)
  }
  "Multiplication" should "be invalid" in {
    val actualResult= OperationsImpl.multiplication( positiveInput1, negativeInput2)
    val expectedResult = 4290
    assert(actualResult != expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Division method
  * to check if method is giving valid results or not.
  */
  "Division" should "be valid if positive number entered" in {
    val actualResult= OperationsImpl.division(positiveInput1, positiveInput2)
    val expectedResult = 0.35454545454545455
    assert(actualResult === expectedResult)
  }
  "Division" should "be valid if negative input entered" in {
    val actualResult= OperationsImpl.division(negativeInput1, negativeInput2)
    val expectedResult = 0.35454545454545455
    assert(actualResult === expectedResult)
  }
  "Division" should "be valid if one negative input entered before the operator" in {
    val actualResult= OperationsImpl.division( negativeInput2, positiveInput1)
    val expectedResult = -2.8205128205128207
    assert(actualResult === expectedResult)
  }
  "Division" should "be valid if negative input entered after the operator" in {
    val actualResult= OperationsImpl.division( positiveInput1, negativeInput2)
    val expectedResult = -0.35454545454545455
    assert(actualResult === expectedResult)
  }
  "Division" should "be invalid" in {
    val actualResult= OperationsImpl.division( positiveInput1, negativeInput2)
    val expectedResult = 0.35454545454545455
    assert(actualResult != expectedResult)
  }
  "Division" should "be invalid if denominator is 0 " in {
    val actualResult= OperationsImpl.division( 0,positiveInput1 )
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Power method
   * to check if method is giving valid results or not.
   */
  "Power" should "be valid if both positive input entered" in {
    val actualResult= OperationsImpl.power(positiveInput1, positiveInput2)
    val expectedResult = 1.0401758655037036E175
    assert(actualResult === expectedResult)
  }
  "Power" should "be valid if both negative input entered" in {
    val actualResult= OperationsImpl.power(negativeInput1, negativeInput2)
    val expectedResult = 9.613758914851879E-176
    assert(actualResult === expectedResult)
  }
  "Power" should "be valid if one negative input entered before the operator" in {
    val actualResult= OperationsImpl.power( negativeInput2, positiveInput1)
    val expectedResult = -4.1144777789250867E79
    assert(actualResult === expectedResult)
  }
  "Power" should "be valid if negative number entered after the operator" in {
    val actualResult= OperationsImpl.power( positiveInput1, negativeInput2)
    val expectedResult = 9.613758914851879E-176
    assert(actualResult === expectedResult)
  }
  "Power" should "be invalid" in {
    val actualResult= OperationsImpl.power( positiveInput1, negativeInput2)
    val expectedResult = 149
    assert(actualResult != expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Absolute method
  * to check if method is giving valid results or not.
  */
  "Absolute" should "be valid if positive input entered" in {
    val actualResult= OperationsImpl.absolute(positiveInput1)
    val expectedResult = 39
    assert(actualResult === expectedResult)
  }
  "Absolute" should "be valid if negative input entered" in {
    val actualResult= OperationsImpl.absolute(negativeInput1)
    val expectedResult = 39
    assert(actualResult === expectedResult)
  }
  "Absolute" should "be invalid" in {
    val actualResult= OperationsImpl.absolute( positiveInput1)
    val expectedResult = 110
    assert(actualResult != expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Modulus method
  * to check if method is giving valid results or not.
  */
  "Modulus" should "be valid if both positive input entered" in {
    val actualResult= OperationsImpl.modulus(positiveInput1, positiveInput2)
    val expectedResult = 39
    assert(actualResult === expectedResult)
  }
  "Modulus" should "be valid if both negative input entered" in {
    val actualResult= OperationsImpl.modulus(negativeInput1, negativeInput2)
    val expectedResult = -39
    assert(actualResult === expectedResult)
  }
  "Modulus" should "be valid if one negative input entered before the operator" in {
    val actualResult= OperationsImpl.modulus( negativeInput2, positiveInput1)
    val expectedResult = -32
    assert(actualResult === expectedResult)
  }
  "Modulus" should "be valid if negative input entered after the operator" in {
    val actualResult= OperationsImpl.modulus( positiveInput1, negativeInput2)
    val expectedResult = 39
    assert(actualResult === expectedResult)
  }
  "Modulus" should "be invalid" in {
    val actualResult= OperationsImpl.modulus( positiveInput1, negativeInput2)
    val expectedResult = 149
    assert(actualResult != expectedResult)
  }
  "Modulus" should "be invalid if denominator is 0 " in {
    val actualResult= OperationsImpl.modulus(0, positiveInput1)
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Maximum method
  * to check if method is giving valid results or not.
  */
  "Maximum" should "be valid if both positive input entered" in {
    val actualResult= OperationsImpl.maximum(positiveInput1, positiveInput2)
    val expectedResult = 110
    assert(actualResult === expectedResult)
  }
  "Maximum" should "be valid if both negative input entered" in {
    val actualResult= OperationsImpl.maximum(negativeInput1, negativeInput2)
    val expectedResult = -39
    assert(actualResult === expectedResult)
  }
  "Maximum" should "be valid if one negative input entered before the operator" in {
    val actualResult= OperationsImpl.maximum( negativeInput2, positiveInput1)
    val expectedResult = 39
    assert(actualResult === expectedResult)
  }
  "Maximum" should "be valid if negative input entered after the operator" in {
    val actualResult= OperationsImpl.maximum( positiveInput1, negativeInput2)
    val expectedResult = 39
    assert(actualResult === expectedResult)
  }
  "Maximum" should "be invalid" in {
    val actualResult= OperationsImpl.maximum( positiveInput1, negativeInput2)
    val expectedResult = 110
    assert(actualResult != expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Minimum method
  * to check if method is giving valid results or not.
  */
  "Minimum" should "be valid if both positive input entered" in {
    val actualResult= OperationsImpl.minimum(positiveInput1, positiveInput2)
    val expectedResult = 39
    assert(actualResult === expectedResult)
  }
  "Minimum" should "be valid if both negative input entered" in {
    val actualResult= OperationsImpl.minimum(negativeInput1, negativeInput2)
    val expectedResult = -110
    assert(actualResult === expectedResult)
  }
  "Minimum" should "be valid if one negative input entered before the operator" in {
    val actualResult= OperationsImpl.minimum( negativeInput2, positiveInput1)
    val expectedResult = -110
    assert(actualResult === expectedResult)
  }
  "Minimum" should "be valid if negative input entered after the operator" in {
    val actualResult= OperationsImpl.minimum( positiveInput1, negativeInput2)
    val expectedResult = -110
    assert(actualResult === expectedResult)
  }
  "Minimum" should "be invalid" in {
    val actualResult= OperationsImpl.minimum( positiveInput1, negativeInput2)
    val expectedResult = 39
    assert(actualResult != expectedResult)
  }
}