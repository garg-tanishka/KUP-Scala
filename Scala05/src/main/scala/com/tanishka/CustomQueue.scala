// Author - Tanishka Garg

package com.tanishka
class CustomQueue[A] {

  //enqueue method to add an element in the last of the queue
  def enqueue(queue: List[A], element: A): List[A] = {
    val newQueue = queue ::: List(element)
    newQueue
  }

  //dequeue method to delete the first element of the queue
  def dequeue(queue: List[A]): List[A] = {
    queue match {
      case Nil => throw new NoSuchElementException()
      case _ => val newQueue = queue.tail
        newQueue
    }
  }

  // isEmpty method to return boolean if queue is Empty
  def isEmpty(queue: List[A]): Boolean = {
    queue match {
      case Nil => true
      case _ => false
    }
  }

  //size method to return the size of the queue
  def size(queue: List[A]) : Int = {
    queue.length
  }

  //peek method to return the first element of the queue
  def peek(queue: List[A]) : List[A] = {
    queue.take(1)
  }

}
