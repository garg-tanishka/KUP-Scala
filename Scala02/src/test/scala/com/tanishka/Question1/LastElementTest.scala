// Author - Tanishka Garg
package com.tanishka.Question1

import com.tanishka.Question1.LastElement.lastElement
import org.scalatest.flatspec.AnyFlatSpec

//Test cases for validating lastElement method is working in the appropriate manner or not.
class LastElementTest  extends AnyFlatSpec{

  //Test cases for Char type List
  "Nth Element" should "be valid if List is Char Type" in {
    val actualResult = lastElement(List('T','a','n','i','s','h','k','a'))
    val expectedResult = 'a'
    assert(actualResult === expectedResult)
  }

  "Nth Element" should "be valid if List is Char Type with one element in it" in {
    val actualResult = lastElement(List('T'))
    val expectedResult = 'T'
    assert(actualResult === expectedResult)
  }

  //Test cases for Integer Type List
  "Nth Element" should "be valid if List is Integer Type" in {
    val actualResult = lastElement(List(1,0,2,3))
    val expectedResult = 3
    assert(actualResult === expectedResult)
  }

  "Nth Element" should "be valid if List is Integer Type with one element in it" in {
    val actualResult = lastElement(List(1))
    val expectedResult = 1
    assert(actualResult === expectedResult)
  }

  //Test cases for String Type List
  "Nth Element" should "be valid if List is String Type" in {
    val actualResult = lastElement(List("Tanishka","garg","divya","gupta"))
    val expectedResult = "gupta"
    assert(actualResult === expectedResult)
  }

  "Nth Element" should "be valid if List is String Type with one element in it" in {
    val actualResult = lastElement(List("Tanishka"))
    val expectedResult = "Tanishka"
    assert(actualResult === expectedResult)
  }

  //Test case for Any Type List
  "Nth Element" should "be valid if List is of Mix Type" in {
    val actualResult = lastElement(List("Tanishka",1,'A',"*",1.1))
    val expectedResult = 1.1
    assert(actualResult === expectedResult)
  }

  //Test case failed if wrong result appear, that means method is working fine
  "Nth Element" should "be invalid" in {
    val actualResult = lastElement(List('T','a','n','i','s','h','k','a'))
    val expectedResult = 's'
    assert(actualResult != expectedResult)
  }

}