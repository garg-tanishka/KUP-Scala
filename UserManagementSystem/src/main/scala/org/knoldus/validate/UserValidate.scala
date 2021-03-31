// Author - Tanishka Garg

package org.knoldus.validate
import org.knoldus.dao.Dao
import org.knoldus.models.User

class UserValidate(repository: Dao[User]){

  //method to validate user and then adding the user in the database
  def addUser(user : User): String = {
    if(user.name.nonEmpty &&  !repository.getUserIdList().contains(user.id) )  {
      repository.createUser(user)
      "Data Inserted.\n"
    }
    else
    {
      "Invalid Data.\n"
    }
  }

  //method to return the entire table
  def getUserList : List[User] = repository.getUserList

  //method to return the name of the user id by validating if the id is valid
  def getUser(id : Int)  : String = {
    if(repository.getUserIdList().contains(id)) {
      repository.getUserNameById(id)
    }
    else {
      "Invalid User Id."
    }
  }

  //method to return the list of id in the database
  def getUserIdList : List[Int] = repository.getUserIdList()


  //method to check if the id exist the update the new name from old name
  def changeUserName(id : Int , name: String) :Boolean = {
    if (repository.getUserIdList().contains(id)) {
      repository.updateUser(id, name)
      true
    }
    else {
      false
    }
  }

  //method to validate if the id exist then delete the id
  def removeUser(id : Int) : Boolean = {
    if (repository.getUserIdList().contains(id)) {
      repository.deleteUser(id)
      true
    } else {
      false
    }
  }

}

