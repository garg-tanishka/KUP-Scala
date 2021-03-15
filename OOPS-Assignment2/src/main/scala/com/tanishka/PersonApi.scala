// Author - Tanishka Garg

package com.tanishka

object PersonApi {

  def main(args: Array[String]): Unit = {

    val input1 = 24
    val input2 = 25

    //comparing the age if the names are same
    val personOne = new Person("Test", input1)
    val personTwo = new Person("Test", input2)
    print("\npersonOne('Test' , 24) < personTwo('Test' , 25) : "  + (personOne < personTwo) )

    //comparing the length of names if names are not same
    val person1 = new Person("TestAgain", input1)
    val person2 = new Person("Test", input2)
    print("\nperson1('TestAgain' , 24) <= person2('Test' , 25) : " + (person1 <= person2))
  }

}
