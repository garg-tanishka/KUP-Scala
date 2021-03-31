// Author - Tanishka Garg

package org.knoldus.dao

trait Dao[User]{

  def createUser(userDetails:User) : Boolean

  def getUserList: List[User]

  def getUserNameById(id : Int) : String

  def getUserIdList() : List[Int]

  def updateUser(id: Int , name: String) : Boolean

  def deleteUser(id: Int) : Boolean

}
