// Author - Tanishka Garg

package org.knoldus.database
import org.knoldus.models.User
import java.sql.{Connection, DriverManager}

trait DatabaseConnection_Api {

  val driver = "com.mysql.cj.jdbc.Driver"
  val url = "jdbc:mysql://localhost/mysql"
  val username = "Tanishka"
  val password = "Tanishkagarg@04"
  var connection: Connection = _

  //method to insert data in the database
  def insertUserDatabase(user: User):String= {
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement()
      val id = user.id
      val name = user.name
      val userType = user.usertype
      statement.executeUpdate(s"INSERT INTO myRepo.user VALUES ('$id', '$name','$userType')")
      "Insertion performed"
    }
    catch {
      case e: Throwable => e.printStackTrace()
        "Insertion not performed"
    }
    finally {
      connection.close()
    }
  }

  // method to return the entire table from database
  def selectUser(): String = {
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement()
      val resultSet = statement.executeQuery("SELECT * FROM myRepo.user")
      print("\nDATA FROM DATABASE: \n")
      while ( resultSet.next() ) {
        val id = resultSet.getString("Id")
        val name = resultSet.getString("Name")
        val userType = resultSet.getString("UserType")
        print("Id = " + id + ", Name = " + name + ", User Type = " + userType + "\n")
      }
      "Table printed"
    }
    catch {
      case e: Throwable => e.printStackTrace()
        "Table not printed"
    }
    finally{
      connection.close()
    }
  }

  //method to return the name of a particular id from database
  def getUserNameByIdDatabase(id: Int): String = {
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement()
      val Id = id
      val resultSet = statement.executeQuery(s"SELECT Name FROM myRepo.user where id = '$Id'")
      print("\nRETRIEVING NAME BY ID: \n")
      while ( resultSet.next() ) {
        val name = resultSet.getString("Name")
        print("Name = " + name )
      }
      "Name returned by Id"
    }
    catch {
      case e: Throwable => e.printStackTrace()
        "Name not returned by Id"
    }
    finally {
      connection.close()
    }
  }

  //method to update the table in database
  def updateUserDatabase(id: Int, new_name: String): String = {
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)

      val statement = connection.createStatement()
      val idToChange = id
      val newName = new_name
      statement.executeUpdate(s"UPDATE myRepo.user SET name = '$newName' where id = '$idToChange'")
      "Name updated"
    }
    catch {
      case e: Throwable=> e.printStackTrace()
      "Name not updated"
    }
    finally{
      connection.close()
    }
  }

  //method to delete an user from the database
  def deleteUserDatabase(id : Int) : String = {
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement()
      val idToDelete = id
      statement.executeUpdate(s"DELETE from myRepo.user where id = '$idToDelete'")
      "Row deleted"
    }
    catch {
      case e: Throwable => e.printStackTrace()
        "Row not deleted"
    }
    finally {
      connection.close()
    }
  }
}
