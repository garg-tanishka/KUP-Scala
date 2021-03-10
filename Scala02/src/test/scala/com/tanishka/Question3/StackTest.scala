// Author - Tanishka Garg

package com.tanishka.Question3

import com.tanishka.Question3.Stack.{isEmpty, peek, pop, printStack, push, size}
import org.scalatest.flatspec.AnyFlatSpec

/*Test cases for validating the methods - push, pop, printStack, size, isEmpty and peek
are working in the appropriate manner or not.*/

class StackTest extends AnyFlatSpec {

  //Test case for push method
  "Stack" should "be valid if we pushed an element in the stack" in {
    val actualResult = push(2)
    val expectedResult = "Element has been Inserted."
    assert(actualResult === expectedResult)
    pop()
  }

  "Stack" should "be valid if we pushed an character element in the stack" in {
    val actualResult = push('a')
    val expectedResult = "Element has been Inserted."
    assert(actualResult === expectedResult)
    pop()
  }

  //Test case for pop method
  "Stack" should "be valid if we popped an element from the stack" in {
    push(2)
    val actualResult = pop()
    val expectedResult = "Element has been deleted."
    assert(actualResult === expectedResult)
  }

  "Stack" should "be valid if we popped an empty stack" in {
    val actualResult = pop()
    val expectedResult = "Stack Underflow."
    assert(actualResult === expectedResult)
  }

  //Test case for printStack method
  "Stack" should "be valid if we print an empty stack " in {
    val actualResult = printStack()
    val expectedResult = "Stack is Empty."
    assert(actualResult === expectedResult)
  }

  "Stack" should "be valid if we print an non-empty stack " in {
    push(2)
    val actualResult = printStack()
    val expectedResult = "List(2)"
    assert(actualResult === expectedResult)
    pop()
  }

  //Test case for isEmpty method
  "Stack" should "be valid if the stack is empty" in {
    assert(isEmpty)
  }

  "Stack" should "be valid if the stack is non-empty" in {
    push(2)
    assert(!isEmpty)
    pop()
  }

  //Test case for peek method
  "Stack" should "be valid if the stack is non-empty and return the top element of the Stack" in {
    push(2)
    val actualResult = peek
    val expectedResult = 2
    assert(actualResult === expectedResult)
    pop()
  }

  "Stack" should "be valid if the stack is empty then should return -1" in {
    val actualResult = peek
    val expectedResult = -1
    assert(actualResult === expectedResult)
  }

  //Test case for size method
  "Stack" should "be valid to return the length of the Stack" in {
    push(2)
    push(1)
    push(3)
    val actualResult = size
    val expectedResult = 3
    assert(actualResult === expectedResult)
    pop()
    pop()
    pop()
  }

  "Stack" should "be valid to return the length of the empty Stack" in {
    val actualResult = size
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }
}