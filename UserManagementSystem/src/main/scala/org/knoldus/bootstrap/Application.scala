// Author - Tanishka Garg

package org.knoldus.bootstrap
import org.knoldus.dao.Dao
import org.knoldus.models._
import org.knoldus.repo.UserRepository
import org.knoldus.validate.UserValidate
import java.sql.{Connection, DriverManager}

object Application extends App {

  val repository : Dao[User] = new UserRepository
  val operations = new UserValidate(repository)
  val userAdmin = User( 1, "Tanishka" , UserType.ADMIN)
  val userCustomer = User(2 , "Divya" , UserType.CUSTOMER)

  val driver = "com.mysql.cj.jdbc.Driver"
  val url = "jdbc:mysql://localhost/mysql"
  val username = "Tanishka"
  val password = "Tanishkagarg@04"
  var connection:Connection = _

  //adding users in the table by adduser method
  print(s"Admin added in the Table: ${operations.addUser(userAdmin)}") // will return Data Inserted.
  print(s"Customer added the Table: ${operations.addUser(userCustomer)}") // will return Data Inserted.

  //printing the entire table to check if users got added or not
  operations.getUserList

  //method to get the name of the particular id[ Here we will get Tanishka as output]
  operations.getUser(1)

  //method to update the name of particular id
  operations.changeUserName(1 , "Purva")
  print(s"\nUsers in the Table after Updating id 1 by Purva:\n ${operations.getUserList}")

  //method to delete a particular row from the table
  operations.removeUser(1)

  print(s"\nUsers in the Table after Deleting id 1 : ${operations.getUserList}")

  try {
    Class.forName(driver)
    connection = DriverManager.getConnection(url, username, password)
  } catch {
    case e: Throwable=> e.printStackTrace
  }
  connection.close()
}
