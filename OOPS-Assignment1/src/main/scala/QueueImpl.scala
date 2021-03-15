// Author - Tanishka Garg

package com.tanishka.doubleQueue{

  import com.tanishka.Queue
  class DoubleQueue extends Queue {

    override def enqueue(element:Int):String = {
      /*Add element to the queue after doubling it when list is empty*/
      if (front== -1 && rear == -1) {
        front = front + 1
        rear = rear + 1
        inputList = inputList ::: List(element*2)
        "Element has been Inserted in doubleQueue when list is empty."
      }
      else{
        /*Add element at the end of the queue after doubling it*/
        rear = rear + 1
        inputList = inputList ::: List(element*2)
        "Element has been inserted in doubleQueue."
      }
    }
  }
}

package com.tanishka.squareQueue{

  import com.tanishka.Queue
  class SquareQueue extends Queue {

    override def enqueue(element:Int):String = {
      /*Add element to the queue after doubling it when list is empty*/
      if (front== -1 && rear == -1) {
        front = front + 1
        rear = rear + 1
        inputList = inputList ::: List(element*element)
        "Element has been Inserted in squareQueue when list is empty."

      }
      else{
        /*Add element at the end of the queue after doubling it*/
        rear = rear + 1
        inputList = inputList ::: List(element*element)
        "Element has been inserted in squareQueue."
      }
    }
  }
}
