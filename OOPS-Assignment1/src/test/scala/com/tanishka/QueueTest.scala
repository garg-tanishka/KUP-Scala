// Author - Tanishka Garg

package com.tanishka

import com.tanishka.doubleQueue.DoubleQueue
import com.tanishka.squareQueue.SquareQueue
import org.scalatest.flatspec.AnyFlatSpec

class QueueTest extends AnyFlatSpec {

  val doubleQueue = new DoubleQueue
  val squareQueue = new SquareQueue

  val input1 = 7

  //DOUBLE QUEUE TEST CASES
  //Test cases for enqueue method
  "DoubleQueue" should "be valid if we enqueue an element in the doubleQueue" in {
    val actualResult = doubleQueue.enqueue(2)
    val expectedResult = "Element has been Inserted in doubleQueue when list is empty."
    assert(actualResult === expectedResult)
  }

  "DoubleQueue" should "be valid if we enqueue an character element in the doubleQueue" in {
    val actualResult = doubleQueue.enqueue(1)
    val expectedResult =  "Element has been inserted in doubleQueue."
    assert(actualResult === expectedResult)
  }

  //Test cases for dequeue method
  "DoubleQueue" should "be valid if we dequeue an element from the doubleQueue" in {
    val actualResult = doubleQueue.dequeue()
    val expectedResult = "Element has been deleted."
    assert(actualResult === expectedResult)
  }

  "DoubleQueue" should "be valid if we dequeue an element from the doubleQueue which has only one element" in {
    val actualResult = doubleQueue.dequeue()
    val expectedResult = "Element has been deleted when there is only one element."
    assert(actualResult === expectedResult)
  }

  "DoubleQueue" should "be valid if we dequeue in empty doubleQueue" in {
    val actualResult = doubleQueue.dequeue()
    val expectedResult = "Queue is empty."
    assert(actualResult === expectedResult)
  }

  //Test cases for printQueue method
  "DoubleQueue" should "be valid if we print an empty doubleQueue " in {
    val actualResult = doubleQueue.printQueue()
    val expectedResult = "Queue is empty."
    assert(actualResult === expectedResult)
  }

  "DoubleQueue" should "be valid if we print an non-empty doubleQueue " in {
    doubleQueue.enqueue(input1)
    val actualResult = doubleQueue.printQueue()
    val expectedResult = "List(14)"
    assert(actualResult === expectedResult)
  }

  "DoubleQueue" should "be invalid" in {
    doubleQueue.enqueue(input1)
    val actualResult = doubleQueue.printQueue()
    val expectedResult = "List(7)"
    assert(actualResult !=expectedResult)
  }

  // SQUARE QUEUE TEST CASES
  //Test cases for enqueue method
  "squareQueue" should "be valid if we enqueue an element in the squareQueue" in {
    val actualResult = squareQueue.enqueue(2)
    val expectedResult = "Element has been Inserted in squareQueue when list is empty."
    assert(actualResult === expectedResult)
  }

  "squareQueue" should "be valid if we enqueue an character element in the squareQueue" in {
    val actualResult = squareQueue.enqueue(1)
    val expectedResult =  "Element has been inserted in squareQueue."
    assert(actualResult === expectedResult)
  }

  //Test cases for dequeue method
  "squareQueue" should "be valid if we dequeue an element from the squareQueue" in {
    val actualResult = squareQueue.dequeue()
    val expectedResult = "Element has been deleted."
    assert(actualResult === expectedResult)
  }

  "squareQueue" should "be valid if we dequeue an element from the squareQueue which has only one element" in {
    val actualResult = squareQueue.dequeue()
    val expectedResult = "Element has been deleted when there is only one element."
    assert(actualResult === expectedResult)
  }

  "squareQueue" should "be valid if we dequeue in empty squareQueue" in {
    val actualResult = squareQueue.dequeue()
    val expectedResult = "Queue is empty."
    assert(actualResult === expectedResult)
  }

  //Test cases for printQueue method
  "squareQueue" should "be valid if we print an empty squareQueue " in {
    val actualResult = squareQueue.printQueue()
    val expectedResult = "Queue is empty."
    assert(actualResult === expectedResult)
  }

  "squareQueue" should "be valid if we print an non-empty squareQueue " in {
    squareQueue.enqueue(input1)
    val actualResult = squareQueue.printQueue()
    val expectedResult = "List(49)"
    assert(actualResult === expectedResult)
  }

  "squareQueue" should "be invalid" in {
    squareQueue.enqueue(input1)
    val actualResult = squareQueue.printQueue()
    val expectedResult = "List(7)"
    assert(actualResult !=expectedResult)
  }
}
