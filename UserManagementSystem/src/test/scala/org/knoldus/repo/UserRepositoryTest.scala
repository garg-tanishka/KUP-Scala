// Author - Tanishka Garg

package org.knoldus.repo
import org.knoldus.models.{User, UserType}
import org.scalatest.flatspec.AnyFlatSpec

class UserRepositoryTest extends AnyFlatSpec {


  val userRepository = new UserRepository
  val userAdmin: User = User(1, "Tanishka", UserType.ADMIN)
  val userCustomer: User = User(2, "Divya", UserType.CUSTOMER)
  val input1 = 4

  //Test case for createUser method
  "Validating createUser" should "be valid when adding admin" in {
    assert(userRepository.createUser(userAdmin))
    userRepository.deleteUser(1)
  }
  "Validating createUser" should "be valid when adding customer" in {
    assert(userRepository.createUser(userCustomer))
    userRepository.deleteUser(2)
  }
  "Validating createUser" should "be invalid when adding same admin again" in {
    val actualResult = userRepository.createUser(userAdmin)
    val expectedResult = false
    assert(actualResult != expectedResult)
    userRepository.deleteUser(1)
  }
  "Validating createUser" should "be invalid when adding same customer again" in {
    val actualResult = userRepository.createUser(userCustomer)
    val expectedResult = false
    assert(actualResult != expectedResult)
    userRepository.deleteUser(2)
  }

  //Test case for getUserList method
  "Validating getUserList" should "be valid" in {
    userRepository.createUser(userAdmin)
    userRepository.createUser(userCustomer)
    val actualResult = userRepository.getUserList
    val expectedResult = List(userAdmin, userCustomer)
    assert(actualResult === expectedResult)
    userRepository.deleteUser(1)
    userRepository.deleteUser(2)
  }

  "Validating getUserList" should "be empty" in {
    val actualResult = userRepository.getUserList
    val expectedResult = List()
    assert(actualResult === expectedResult)
  }

  "Validating getUserList" should "be invalid" in {
    userRepository.createUser(userAdmin)
    val actualResult = userRepository.getUserList
    val expectedResult = List(userCustomer)
    assert(actualResult != expectedResult)
    userRepository.deleteUser(1)
  }

  //Test case for listUserId method
  "Validating listUserId" should "be valid" in {
    userRepository.createUser(userAdmin)
    userRepository.createUser(userCustomer)
    val actualResult = userRepository.getUserIdList()
    val expectedResult = List(1, 2)
    assert(actualResult === expectedResult)
    userRepository.deleteUser(1)
    userRepository.deleteUser(2)
  }
  "Validating listUserId" should "return empty" in {
    val actualResult = userRepository.getUserIdList()
    val expectedResult = List()
    assert(actualResult === expectedResult)
  }
  "Validating listUserId" should "be invalid" in {
    userRepository.createUser(userAdmin)
    val actualResult = userRepository.getUserIdList()
    val expectedResult = List(2)
    assert(actualResult != expectedResult)
    userRepository.deleteUser(1)
  }

  //Test case for updateUser method
  "Validating updateUser" should "be valid" in {
    userRepository.createUser(userAdmin)
    userRepository.createUser(userCustomer)
    assert(userRepository.updateUser(1, "Swantika"))
    userRepository.deleteUser(1)
    userRepository.deleteUser(2)
  }
  "Validating updateUser" should "be invalid" in {
    userRepository.createUser(userAdmin)
    assert(!userRepository.updateUser(2, "Rahul"))
    userRepository.deleteUser(1)
  }

  //Test case for deleteUser method
  "Validating deleteUser" should "be valid" in {
    userRepository.createUser(userAdmin)
    assert(userRepository.deleteUser(1))
  }
  "Validating deleteUser" should "be invalid" in {
    userRepository.createUser(userAdmin)
    assert(userRepository.deleteUser(input1))
    userRepository.deleteUser(1)
  }

  //Test case for getUserNameById method
  "Validating getUserNameById" should "be valid" in {
    userRepository.createUser(userAdmin)
    val actualResult = userRepository.getUserNameById(1)
    val expectedResult = "Tanishka"
    assert(actualResult === expectedResult)
    userRepository.deleteUser(1)
  }
  "Validating getUserNameById" should "be invalid" in {
    userRepository.createUser(userAdmin)
    val actualResult = userRepository.getUserNameById(1)
    val expectedResult = "Rahul"
    assert(actualResult != expectedResult)
    userRepository.deleteUser(1)
  }

  /*-------------------------------------------------------------------------------------*/

    /*DATABASE CONNECTION API FILE METHOD TESTING*/

  //Test case for insertUserDatabase method
  "Validating insertUserDatabase" should "be valid when adding admin" in {
    val actualResult =userRepository.insertUserDatabase(userAdmin)
    val expectedResult = "Insertion performed"
    assert(actualResult === expectedResult)
    userRepository.deleteUserDatabase(1)
  }
  "Validating insertUserDatabase" should "be valid when adding customer" in {
    val actualResult =userRepository.insertUserDatabase(userCustomer)
    val expectedResult = "Insertion performed"
    assert(actualResult === expectedResult)
    userRepository.deleteUserDatabase(2)
  }
  "Validating insertUserDatabase" should "be invalid when adding same admin" in {
    val actualResult =userRepository.insertUserDatabase(userAdmin)
    val expectedResult =  "Insertion not performed"
    assert(actualResult != expectedResult)
    userRepository.deleteUserDatabase(1)
  }
  "Validating insertUserDatabase" should "be invalid when adding same customer" in {
    val actualResult =userRepository.insertUserDatabase(userCustomer)
    val expectedResult =  "Insertion not performed"
    assert(actualResult != expectedResult)
    userRepository.deleteUserDatabase(2)
  }

  //Test case for selectUser method
  "Validating selectUser" should "be valid" in {
    userRepository.insertUserDatabase(userAdmin)
    userRepository.insertUserDatabase(userCustomer)
    val actualResult =userRepository.selectUser()
    val expectedResult = "Table printed"
    assert(actualResult === expectedResult)
    userRepository.deleteUserDatabase(1)
    userRepository.deleteUserDatabase(2)
  }

  "Validating selectUser" should "be invalid" in {
    val actualResult =userRepository.selectUser()
    val expectedResult =  "Table not printed"
    assert(actualResult != expectedResult)
  }

  //Test case for updateUserDatabase method
  "Validating updateUserDatabase" should "be valid" in {
    userRepository.insertUserDatabase(userAdmin)
    val actualResult =userRepository.updateUserDatabase(1,"Swantika")
    val expectedResult = "Name updated"
    assert(actualResult === expectedResult)
    userRepository.deleteUserDatabase(1)
  }

  "Validating updateUserDatabase" should "be invalid" in {
    val actualResult =userRepository.updateUserDatabase(2, "Rahul")
    val expectedResult =  "Name not updated"
    assert(actualResult != expectedResult)
  }

  //Test case for deleteUserDatabase method
  "Validating deleteUserDatabase" should "be valid" in {
    userRepository.insertUserDatabase(userAdmin)
    val actualResult =userRepository.deleteUserDatabase(1)
    val expectedResult = "Row deleted"
    assert(actualResult === expectedResult)
  }

  "Validating deleteUserDatabase" should "be invalid" in {
    val actualResult =userRepository.deleteUserDatabase(2)
    val expectedResult =  "Row not deleted"
    assert(actualResult != expectedResult)
  }

  //Test case for getUserNameByIdDatabase method
  "Validating getUserNameByIdDatabase" should "be valid" in {
    userRepository.insertUserDatabase(userAdmin)
    val actualResult =userRepository.getUserNameByIdDatabase(1)
    val expectedResult = "Name returned by Id"
    assert(actualResult === expectedResult)
    userRepository.deleteUserDatabase(1)
  }

  "Validating getUserNameByIdDatabase" should "be invalid" in {
    val actualResult =userRepository.getUserNameByIdDatabase(2)
    val expectedResult =  "Name not returned by Id"
    assert(actualResult != expectedResult)
  }
}