// Author - Tanishka Garg
package com.tanishka
import org.scalatest.flatspec.AsyncFlatSpec

class CustomQueueTest extends AsyncFlatSpec{

  //INTEGER TYPE
  val customIntQueue = new CustomQueue[Int]

  //Test cases for enqueue method
  "Queue of type Int" should "return an list of elements after operating enqueue method on empty queue" in {
    val actualResult = customIntQueue.enqueue(List(), 2)
    val expectedResult = List(2)
    assert(actualResult === expectedResult)
  }
  "Queue of type Int" should "return an list of elements after operating enqueue method on non-empty queue" in {
    val actualResult = customIntQueue.enqueue(List(1,2), 2)
    val expectedResult = List(1,2,2)
    assert(actualResult === expectedResult)
  }
  "Queue of type Int" should "be invalid when enqueue operation performed" in {
    val actualResult = customIntQueue.enqueue(List(1,2), 2)
    val expectedResult = List(1)
    assert(actualResult != expectedResult)
  }

  //Test cases for dequeue method
  "Queue of type Int" should "return an list of elements after operating dequeue method" in {
    val intermediateResult = customIntQueue.enqueue(List(1,2), 3)
    val actualResult = customIntQueue.dequeue(intermediateResult)
    val expectedResult = List(2,3)
    assert(actualResult === expectedResult)
  }
  it should "not remove any element from queue of type Int" in {
    assertThrows[NoSuchElementException] {
      customIntQueue.dequeue(List())
    }
  }
  "Queue of type Int" should "be invalid when dequeue operation performed" in {
    val intermediateResult = customIntQueue.enqueue(List(1,2), 3)
    val actualResult = customIntQueue.dequeue(intermediateResult)
    val expectedResult = List(2)
    assert(actualResult != expectedResult)
  }

  //Test cases for isEmpty method
  "Queue of type Int" should "return false if list is empty" in {
    val intermediateResult = customIntQueue.enqueue(List(), 3)
    val result = customIntQueue.dequeue(intermediateResult)
    assert(customIntQueue.isEmpty(result))
  }
  "Queue of type Int" should "return true if list is non-empty" in {
    val result = customIntQueue.enqueue(List(), 3)
    assert(!customIntQueue.isEmpty(result))
  }

  //Test cases for size method
  "Queue of type Int" should "return the size of queue after operating size method on empty queue" in {
    val actualResult = customIntQueue.size(List())
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }
  "Queue of type Int" should "return the size of queue after operating size method on non-empty queue" in {
    val intermediateResult = customIntQueue.enqueue(List(1,2), 3)
    val actualResult = customIntQueue.size(intermediateResult)
    val expectedResult = 3
    assert(actualResult === expectedResult)
  }
  "Queue of type Int" should "be invalid when size operation performed in the queue" in {
    val intermediateResult = customIntQueue.enqueue(List(1,2), 3)
    val actualResult = customIntQueue.size(intermediateResult)
    val expectedResult = 0
    assert(actualResult != expectedResult)
  }

  //Test cases for peek method
  "Queue of type Int" should "return an list of elements after operating peek method on empty queue" in {
    val actualResult = customIntQueue.peek(List())
    val expectedResult = List()
    assert(actualResult === expectedResult)
  }
  "Queue of type Int" should "return an list of elements after operating peek method" in {
    val intermediateResult = customIntQueue.enqueue(List(1,2), 3)
    val actualResult = customIntQueue.peek(intermediateResult)
    val expectedResult = List(1)
    assert(actualResult === expectedResult)
  }
  "Queue of type Int" should "be invalid when peek method performed in the queue" in {
    val intermediateResult = customIntQueue.enqueue(List(1,2), 3)
    val actualResult = customIntQueue.peek(intermediateResult)
    val expectedResult = List(1,2)
    assert(actualResult != expectedResult)
  }

  //DOUBLE TYPE
  val customDoubleQueue = new CustomQueue[Double]

  //Test cases for enqueue method
  "Queue of type Double" should "return an list of elements after operating enqueue method on empty queue" in {
    val actualResult = customDoubleQueue.enqueue(List(), 2.1)
    val expectedResult = List(2.1)
    assert(actualResult === expectedResult)
  }
  "Queue of type Double" should "return an list of elements after operating enqueue method on non-empty queue" in {
    val actualResult = customDoubleQueue.enqueue(List(1.1,2.1), 2.1)
    val expectedResult = List(1.1,2.1,2.1)
    assert(actualResult === expectedResult)
  }
  "Queue of type Double" should "be invalid when enqueue operation performed" in {
    val actualResult = customDoubleQueue.enqueue(List(1.1,2.1), 2.1)
    val expectedResult = List(1.1)
    assert(actualResult != expectedResult)
  }

  //Test cases for dequeue method
  "Queue of type Double" should "return an list of elements after operating dequeue method" in {
    val intermediateResult = customDoubleQueue.enqueue(List(1.1,2.1), 3.1)
    val actualResult = customDoubleQueue.dequeue(intermediateResult)
    val expectedResult = List(2.1,3.1)
    assert(actualResult === expectedResult)
  }
  it should "not remove any element from queue of type Double" in {
    assertThrows[NoSuchElementException] {
      customDoubleQueue.dequeue(List())
    }
  }
  "Queue of type Double" should "be invalid when dequeue operation performed" in {
    val intermediateResult = customDoubleQueue.enqueue(List(1.1,2.1), 3.1)
    val actualResult = customDoubleQueue.dequeue(intermediateResult)
    val expectedResult = List(2.1)
    assert(actualResult != expectedResult)
  }

  //Test cases for isEmpty method
  "Queue of type Double" should "return false if list is empty" in {
    val intermediateResult = customDoubleQueue.enqueue(List(), 3.1)
    val result = customDoubleQueue.dequeue(intermediateResult)
    assert(customDoubleQueue.isEmpty(result))
  }
  "Queue of type Double" should "return true if list is non-empty" in {
    val result = customDoubleQueue.enqueue(List(), 3.1)
    assert(!customDoubleQueue.isEmpty(result))
  }

  //Test cases for size method
  "Queue of type Double" should "return the size of queue after operating size method on empty queue" in {
    val actualResult = customDoubleQueue.size(List())
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }
  "Queue of type Double" should "return the size of queue after operating size method on non-empty queue" in {
    val intermediateResult = customDoubleQueue.enqueue(List(1.1,2.1), 3.1)
    val actualResult = customDoubleQueue.size(intermediateResult)
    val expectedResult = 3
    assert(actualResult === expectedResult)
  }
  "Queue of type Double" should "be invalid when size operation performed in the queue" in {
    val intermediateResult = customDoubleQueue.enqueue(List(1.1,2.1), 3.1)
    val actualResult = customDoubleQueue.size(intermediateResult)
    val expectedResult = 0
    assert(actualResult != expectedResult)
  }

  //Test cases for peek method
  "Queue of type Double" should "return an list of elements after operating peek method on empty queue" in {
    val actualResult = customDoubleQueue.peek(List())
    val expectedResult = List()
    assert(actualResult === expectedResult)
  }
  "Queue of type Double" should "return an list of elements after operating peek method" in {
    val intermediateResult = customDoubleQueue.enqueue(List(1.1,2.1), 3.1)
    val actualResult = customDoubleQueue.peek(intermediateResult)
    val expectedResult = List(1.1)
    assert(actualResult === expectedResult)
  }
  "Queue of type Double" should "be invalid when peek method performed in the queue" in {
    val intermediateResult = customDoubleQueue.enqueue(List(1.1,2.1), 3.1)
    val actualResult = customDoubleQueue.peek(intermediateResult)
    val expectedResult = List(1.1,2.1)
    assert(actualResult != expectedResult)
  }

  //STRING TYPE
  val customStringQueue = new CustomQueue[String]

  //Test cases for enqueue method
  "Queue of type String" should "return an list of elements after operating enqueue method on empty queue" in {
    val actualResult = customStringQueue.enqueue(List(), "Tanishka Garg")
    val expectedResult = List("Tanishka Garg")
    assert(actualResult === expectedResult)
  }
  "Queue of type String" should "return an list of elements after operating enqueue method on non-empty queue" in {
    val actualResult = customStringQueue.enqueue(List("Tanishka Garg", "Divya Gupta"), "Purva Choudhary")
    val expectedResult = List("Tanishka Garg", "Divya Gupta", "Purva Choudhary")
    assert(actualResult === expectedResult)
  }
  "Queue of type String" should "be invalid when enqueue operation performed" in {
    val actualResult = customStringQueue.enqueue(List("Tanishka Garg", "Divya Gupta"), "Purva Choudhary")
    val expectedResult = List("Tanishka Garg")
    assert(actualResult != expectedResult)
  }

  //Test cases for dequeue method
  "Queue of type String" should "return an list of elements after operating dequeue method" in {
    val intermediateResult = customStringQueue.enqueue(List("Tanishka Garg", "Divya Gupta"), "Purva Choudhary")
    val actualResult = customStringQueue.dequeue(intermediateResult)
    val expectedResult = List("Divya Gupta", "Purva Choudhary")
    assert(actualResult === expectedResult)
  }
  it should "not remove any element from queue of type String" in {
    assertThrows[NoSuchElementException] {
      customStringQueue.dequeue(List())
    }
  }
  "Queue of type String" should "be invalid when dequeue operation performed" in {
    val intermediateResult = customStringQueue.enqueue(List("Tanishka Garg", "Divya Gupta"), "Purva Choudhary")
    val actualResult = customStringQueue.dequeue(intermediateResult)
    val expectedResult = List("Tanishka Garg")
    assert(actualResult != expectedResult)
  }

  //Test cases for isEmpty method
  "Queue of type String" should "return false if list is empty" in {
    val intermediateResult = customStringQueue.enqueue(List(), "Tanishka Garg")
    val result = customStringQueue.dequeue(intermediateResult)
    assert(customStringQueue.isEmpty(result))
  }
  "Queue of type String" should "return true if list is non-empty" in {
    val result = customStringQueue.enqueue(List(), "Tanishka Garg")
    assert(!customStringQueue.isEmpty(result))
  }

  //Test cases for size method
  "Queue of type String" should "return the size of queue after operating size method on empty queue" in {
    val actualResult = customStringQueue.size(List())
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }
  "Queue of type String" should "return the size of queue after operating size method on non-empty queue" in {
    val intermediateResult = customStringQueue.enqueue(List("Tanishka Garg", "Divya Gupta"), "Purva Choudhary")
    val actualResult = customStringQueue.size(intermediateResult)
    val expectedResult = 3
    assert(actualResult === expectedResult)
  }
  "Queue of type String" should "be invalid when size operation performed in the queue" in {
    val intermediateResult = customStringQueue.enqueue(List("Tanishka Garg", "Divya Gupta"), "Purva Choudhary")
    val actualResult = customStringQueue.size(intermediateResult)
    val expectedResult = 0
    assert(actualResult != expectedResult)
  }

  //Test cases for peek method
  "Queue of type String" should "return an list of elements after operating peek method on empty queue" in {
    val actualResult = customStringQueue.peek(List())
    val expectedResult = List()
    assert(actualResult === expectedResult)
  }
  "Queue of type String" should "return an list of elements after operating peek method" in {
    val intermediateResult = customStringQueue.enqueue(List("Tanishka Garg", "Divya Gupta"), "Purva Choudhary")
    val actualResult = customStringQueue.peek(intermediateResult)
    val expectedResult = List("Tanishka Garg")
    assert(actualResult === expectedResult)
  }
  "Queue of type String" should "be invalid when peek method performed in the queue" in {
    val intermediateResult = customStringQueue.enqueue(List("Tanishka Garg", "Divya Gupta"), "Purva Choudhary")
    val actualResult = customStringQueue.peek(intermediateResult)
    val expectedResult = List("Tanishka Garg","Divya Gupta")
    assert(actualResult != expectedResult)
  }

  //CHARACTER TYPE
  val customCharQueue = new CustomQueue[Char]

  //Test cases for enqueue method
  "Queue of type Char" should "return an list of elements after operating enqueue method on empty queue" in {
    val actualResult = customCharQueue.enqueue(List(), 'T')
    val expectedResult = List('T')
    assert(actualResult === expectedResult)
  }
  "Queue of type Char" should "return an list of elements after operating enqueue method on non-empty queue" in {
    val actualResult = customCharQueue.enqueue(List('T', 'a'), 'n')
    val expectedResult = List('T', 'a', 'n')
    assert(actualResult === expectedResult)
  }
  "Queue of type Char" should "be invalid when enqueue operation performed" in {
    val actualResult = customCharQueue.enqueue(List('T', 'a'), 'n')
    val expectedResult = List('T')
    assert(actualResult != expectedResult)
  }

  //Test cases for dequeue method
  "Queue of type Char" should "return an list of elements after operating dequeue method" in {
    val intermediateResult = customCharQueue.enqueue(List('T', 'a'), 'n')
    val actualResult = customCharQueue.dequeue(intermediateResult)
    val expectedResult = List('a','n')
    assert(actualResult === expectedResult)
  }
  it should "not remove any element from queue of type Char" in {
    assertThrows[NoSuchElementException] {
      customCharQueue.dequeue(List())
    }
  }
  "Queue of type Char" should "be invalid when dequeue operation performed" in {
    val intermediateResult = customCharQueue.enqueue(List('T', 'a'), 'n')
    val actualResult = customCharQueue.dequeue(intermediateResult)
    val expectedResult = List('a')
    assert(actualResult != expectedResult)
  }

  //Test cases for isEmpty method
  "Queue of type Char" should "return false if list is empty" in {
    val intermediateResult = customCharQueue.enqueue(List(), 'T')
    val result = customCharQueue.dequeue(intermediateResult)
    assert(customCharQueue.isEmpty(result))
  }
  "Queue of type Char" should "return true if list is non-empty" in {
    val result = customCharQueue.enqueue(List(), 'T')
    assert(!customCharQueue.isEmpty(result))
  }

  //Test cases for size method
  "Queue of type Char" should "return the size of queue after operating size method on empty queue" in {
    val actualResult = customCharQueue.size(List())
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }
  "Queue of type Char" should "return the size of queue after operating size method on non-empty queue" in {
    val intermediateResult = customCharQueue.enqueue(List('T', 'a'), 'n')
    val actualResult = customCharQueue.size(intermediateResult)
    val expectedResult = 3
    assert(actualResult === expectedResult)
  }
  "Queue of type Char" should "be invalid when size operation performed in the queue" in {
    val intermediateResult = customCharQueue.enqueue(List('T', 'a'), 'n')
    val actualResult = customCharQueue.size(intermediateResult)
    val expectedResult = 0
    assert(actualResult != expectedResult)
  }

  //Test cases for peek method
  "Queue of type Char" should "return an list of elements after operating peek method on empty queue" in {
    val actualResult = customCharQueue.peek(List())
    val expectedResult = List()
    assert(actualResult === expectedResult)
  }
  "Queue of type Char" should "return an list of elements after operating peek method" in {
    val intermediateResult = customCharQueue.enqueue(List('T', 'a'), 'n')
    val actualResult = customCharQueue.peek(intermediateResult)
    val expectedResult = List('T')
    assert(actualResult === expectedResult)
  }
  "Queue of type Char" should "be invalid when peek method performed in the queue" in {
    val intermediateResult = customCharQueue.enqueue(List('T', 'a'), 'n')
    val actualResult = customCharQueue.peek(intermediateResult)
    val expectedResult = List('T','a')
    assert(actualResult != expectedResult)
  }
}
