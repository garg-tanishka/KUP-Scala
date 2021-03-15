// Author - Tanishka Garg

package com.tanishka

import com.tanishka.doubleQueue.DoubleQueue
import com.tanishka.squareQueue.SquareQueue

object QueueApi extends App{
    val doubleQueue = new DoubleQueue
    val squareQueue = new SquareQueue

    val list = List()
    val input1 = 5
    val input2 = 6
    val input3 = 7
    val input4 = 8
    print(s"\nElements in the queue are: $input1, $input2, $input3, $input4")

    doubleQueue.enqueue(input1)
    doubleQueue.enqueue(input2)
    doubleQueue.enqueue(input3)
    doubleQueue.enqueue(input4)
    print(s"\nElements after Double Queue operation are: ${doubleQueue.printQueue()} ")
    doubleQueue.dequeue()
    print(s"\nElements after dequeue operation on Double Queue: ${doubleQueue.printQueue()} ")

    squareQueue.enqueue(input1)
    squareQueue.enqueue(input2)
    squareQueue.enqueue(input3)
    squareQueue.enqueue(input4)
    print(s"\nElements after Square Queue operation are: ${squareQueue.printQueue()} ")
    squareQueue.dequeue()
    print(s"\nElements after dequeue operation on Square Queue: ${squareQueue.printQueue()} ")

}
