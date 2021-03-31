// Author - Tanishka Garg

package org.knoldus.validate
import org.knoldus.dao.Dao
import org.knoldus.models.{User, UserType}
import org.knoldus.repo.UserRepository
import org.scalatest.flatspec.AnyFlatSpec

class UserValidateTest extends AnyFlatSpec{

  val repository : Dao[User] = new UserRepository
  val operations = new UserValidate(repository)
  val userAdmin:User = User( 1, "Tanishka" , UserType.ADMIN)
  val userCustomer:User = User(2 , "Divya" , UserType.CUSTOMER)

  //Test case for addUser method
  "Validating addUser" should "be valid when adding admin" in {
    val actualResult =operations.addUser(userAdmin)
    val expectedResult = "Data Inserted.\n"
    assert(actualResult === expectedResult)
    operations.removeUser(1)
  }

  "Validating addUser" should "be valid when adding customer" in {
    val actualResult =operations.addUser(userCustomer)
    val expectedResult = "Data Inserted.\n"
    assert(actualResult === expectedResult)
    operations.removeUser(2)
  }

  "Validating addUser" should "be invalid when adding same admin again" in {
    val actualResult =operations.addUser(userAdmin)
    val expectedResult = "Invalid Data.\n"
    assert(actualResult != expectedResult)
    operations.removeUser(1)
  }

  "Validating addUser" should "be invalid when adding same customer again" in {
    val actualResult =operations.addUser(userCustomer)
    val expectedResult = "Invalid Data.\n"
    assert(actualResult != expectedResult)
    operations.removeUser(2)
  }

  //Test case for getUserList method
  "Validating getUserList" should "be valid" in {
    operations.addUser(userAdmin)
    operations.addUser(userCustomer)
    val actualResult =operations.getUserList
    val expectedResult = List(userAdmin,userCustomer)
    assert(actualResult === expectedResult)
    operations.removeUser(1)
    operations.removeUser(2)
  }

  "Validating getUserList" should "return empty" in {
    val actualResult =operations.getUserList
    val expectedResult = List()
    assert(actualResult === expectedResult)
  }
  "Validating getUserList" should "be invalid" in {
    operations.addUser(userAdmin)
    val actualResult =operations.getUserList
    val expectedResult = List(userCustomer)
    assert(actualResult != expectedResult)
    operations.removeUser(1)
  }

  //Test case for removeUser method
  "Validating removeUser" should "be valid" in {
    operations.addUser(userAdmin)
    assert(operations.removeUser(1))
  }

  "Validating removeUser" should "be invalid" in {
    operations.addUser(userAdmin)
    assert(!operations.removeUser(2))
    operations.removeUser(1)
  }

  //Test case for changeUserName method
  "Validating changeUserName" should "be valid" in {
    operations.addUser(userAdmin)
    assert(operations.changeUserName(1, "Swantika"))
    operations.removeUser(1)
  }

  "Validating changeUserName" should "be invalid" in {
    operations.addUser(userAdmin)
    assert(!operations.changeUserName(2, "Rahul"))
    operations.removeUser(1)
  }

  //Test case for getUser method
  "Validating getUser" should "be valid" in {
    operations.addUser(userAdmin)
    val actualResult =operations.getUser(1)
    val expectedResult = "Tanishka"
    assert(actualResult === expectedResult)
    operations.removeUser(1)
  }

  "Validating getUser" should "be invalid" in {
    operations.addUser(userAdmin)
    val actualResult =operations.getUser(2)
    val expectedResult = "Swantika"
    assert(actualResult != expectedResult)
    operations.removeUser(1)
  }

  //Test case for getUserIdList method
  "Validating getUserIdList" should "be valid" in {
    operations.addUser(userAdmin)
    val actualResult =operations.getUserIdList
    val expectedResult = List(1)
    assert(actualResult === expectedResult)
    operations.removeUser(1)
  }

  "Validating getUserIdList" should "return empty" in {
    val actualResult =operations.getUserIdList
    val expectedResult = List()
    assert(actualResult === expectedResult)
  }
  "Validating getUserIdList" should "be invalid" in {
    operations.addUser(userAdmin)
    val actualResult =operations.getUserIdList
    val expectedResult = List(2)
    assert(actualResult != expectedResult)
    operations.removeUser(1)
  }
}
