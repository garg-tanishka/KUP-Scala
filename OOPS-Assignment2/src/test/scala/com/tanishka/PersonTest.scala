// Author - Tanishka Garg

package com.tanishka

import org.scalatest.flatspec.AnyFlatSpec

class PersonTest extends AnyFlatSpec{

  val input1 = 24
  val input2 = 25
  val personOne = new Person("Test", input1)
  val personTwo = new Person("Test", input2)

  //Test cases when names are same and comparing age
  "Person" should "be valid if names are same but person2 age is greater" in {
    assert(personOne < personTwo)
  }

  "Person" should "be valid if names are same but person2 age and person1 age is same" in {
    assert(personOne < personTwo)
  }

  "Person" should "be invalid" in {
    assert(!(personOne > personTwo))
  }

  val personThree = new Person("TestAgain", input1)

  //Test cases when names are not same and comparing name's length
  "Person" should "be valid if names are not same but length of person3 name is greater" in {
    assert(personThree > personTwo)
  }

  "Person" should "be invalid if names are not same but person3 name's length is greater than person2" in {
    assert(!(personThree <= personTwo))
  }
}
