// Author - Tanishka Garg

package com.tanishka.Question3

import com.tanishka.Question3.Queue.{dequeue, enqueue, isEmpty, peek, printQueue, size}
import org.scalatest.flatspec.AnyFlatSpec

/*Test cases for validating the methods - enqueue, dequeue, printQueue, size, isEmpty and peek
are working in the appropriate manner or not.*/

class QueueTest extends AnyFlatSpec {

  //Test cases for enqueue method
  "Queue" should "be valid if we enqueue an element in the queue" in {
    val actualResult = enqueue(2)
    val expectedResult = "Element has been Inserted."
    assert(actualResult === expectedResult)
    dequeue()
  }

  "Queue" should "be valid if we enqueue an character element in the queue" in {
    val actualResult = enqueue('a')
    val expectedResult = "Element has been Inserted."
    assert(actualResult === expectedResult)
    dequeue()
  }

  //Test cases for dequeue method
  "Queue" should "be valid if we dequeue an element from the Queue" in {
    enqueue(2)
    val actualResult = dequeue()
    val expectedResult = "Element has been deleted."
    assert(actualResult === expectedResult)
  }

  "Queue" should "be valid if we dequeue an empty stack" in {
    val actualResult = dequeue()
    val expectedResult = "Queue is empty."
    assert(actualResult === expectedResult)
  }

  //Test cases for printQueue method
  "Queue" should "be valid if we print an empty queue " in {
    val actualResult = printQueue()
    val expectedResult = "Queue is empty."
    assert(actualResult === expectedResult)
  }

  "Queue" should "be valid if we print an non-empty queue " in {
    enqueue(2)
    val actualResult = printQueue()
    val expectedResult = "List(2)"
    assert(actualResult === expectedResult)
    dequeue()
  }

  //Test cases for isEmpty method
  "Queue" should "be valid if the queue is empty" in {
    assert(isEmpty)
  }

  "Queue" should "be valid if the queue is non-empty" in {
    enqueue(2)
    assert(!isEmpty)
    dequeue()
  }

  //Test case for peek method
  "Queue" should "be valid if the queue is non-empty and return the top element of the Queue" in {
    enqueue(2)
    val actualResult = peek
    val expectedResult = 2
    assert(actualResult === expectedResult)
    dequeue()
  }

  "Queue" should "be valid if the queue is empty and return -1" in {
    val actualResult = peek
    val expectedResult = -1
    assert(actualResult === expectedResult)
  }

  //Test case for size method
  "Queue" should "be valid to return the length of the Queue" in {
    enqueue(2)
    enqueue(1)
    enqueue(3)
    val actualResult = size
    val expectedResult = 3
    assert(actualResult === expectedResult)
    dequeue()
    dequeue()
    dequeue()
  }

  "Queue" should "be valid to return the length of the empty Queue" in {
    val actualResult = size
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }


}
