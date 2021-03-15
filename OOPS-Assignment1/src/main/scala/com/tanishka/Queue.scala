// Author - Tanishka Garg

package com.tanishka

trait Queue {

  var inputList: List[Int] = List()
  var front: Int = -1
  var rear: Int = -1

  /*enqueue abstract method to add element at the end of the queue*/
  def enqueue(element:Int):String


  /*dequeue method to remove the element from the front of the queue*/
  def dequeue(): String = {
    /* Shows a message when queue is empty*/
    if (front== -1 && rear == -1){
      "Queue is empty."
    }
    /*Returns empty list if list has only 1 element*/
    else if(front == rear){
      inputList = inputList.drop(1)
      front = -1
      rear = -1
      "Element has been deleted when there is only one element."
    }
    /*Removes element from the front of the queue */
    else{
      inputList = inputList.drop(1)
      front = front + 1
      "Element has been deleted."
    }
  }

  // printQueue method to print the elements of the queue
  def printQueue():String = {
    //shows a message when queue is empty
    if (front== -1 && rear == -1){
      "Queue is empty."
    }
    else{
      //prints the list
      val values = for(element <- inputList) yield element
      values.toString()
    }
  }

}
