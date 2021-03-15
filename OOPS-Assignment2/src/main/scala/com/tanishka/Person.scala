// Author - Tanishka Garg

package com.tanishka

class Person(val name: String, val age: Int) extends Ordered[Person]{

  //method to compare two persons according to their age or name's length
  def compare(that : Person) : Int  = {
    //if the names are same
    if (this.name == that.name) {
      //if the age are same
      if (this.age == that.age) {
        0
      }
        //if the age is smaller
      else if (this.age < that.age){
        -1
      }
        //if the age is larger
      else{
        1
      }
    }
    else{
      //if the name's length are equal
      if (this.name.length == that.name.length) {
        0
      }
        // if the name's length is smaller
      else if (this.name.length < that.name.length){
        -1
      }
        //if the name's length is larger
      else{
        1
      }
    }
  }
}
