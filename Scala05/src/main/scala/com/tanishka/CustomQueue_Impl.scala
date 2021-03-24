// Author - Tanishka Garg

package com.tanishka
object CustomQueue_Impl extends App{

  //class as type Integer
  val customIntQueue = new CustomQueue[Int]

  val listIntOne = customIntQueue.enqueue(List() , 2)
  print(s"\nFirst Element inserted in the queue: $listIntOne")
  val listIntTwo = customIntQueue.enqueue(listIntOne , 3)
  print(s"\nSecond Element inserted in the above queue: $listIntTwo")
  print(s"\nSize of the queue: ${customIntQueue.size(listIntTwo)} ")
  print(s"\nFirst Element of the queue: ${customIntQueue.peek(listIntTwo)} ")
  print(s"\nIs the queue Empty: ${customIntQueue.isEmpty(listIntTwo)} ")
  val listIntThree = customIntQueue.dequeue(listIntTwo)
  print(s"\nQueue after deletion: $listIntThree")

  //class as type String
  val customStringQueue = new CustomQueue[String]

  val listStringOne = customStringQueue.enqueue(List() , "Tanishka")
  print(s"\n\nFirst Element inserted in the queue: $listStringOne")
  val listStringTwo = customStringQueue.enqueue(listStringOne , "garg")
  print(s"\nSecond Element inserted in the above queue: $listStringTwo")
  print(s"\nSize of the queue: ${customStringQueue.size(listStringTwo)} ")
  print(s"\nFirst Element of the queue: ${customStringQueue.peek(listStringTwo)} ")
  print(s"\nIs the queue Empty: ${customStringQueue.isEmpty(listStringTwo)} ")
  val listStringThree = customStringQueue.dequeue(listStringTwo)
  print(s"\nQueue after deletion: $listStringThree")

}
