import java.util.UUID
import java.time.LocalDateTime

abstract class Account(id:UUID,name:String,dateOpened:LocalDateTime) {

    private var _id:UUID=id
    private var _name:String=name
    private var _dateOpened:LocalDateTime=dateOpened
    val _accountType:String

    //Auxiliary Constructor 

    def this(name:String)={
        this(UUID.randomUUID(),name,LocalDateTime.now)
    }

    def getId:UUID = _id
    def getName:String =_name
    def getDateOpened:LocalDateTime=_dateOpened
    def getAccountType:String = _accountType
    override def toString(): String = s"Account Id= ${_id},name=${_name},dateOpened=${_dateOpened}"

    def setName(newName:String):Unit = {
        _name=newName
    }

  
}

class CreditAccount(name:String) extends Account(name:String){
    override val _accountType: String = "Credit"
}

class DepositAccount(name:String) extends Account(name:String){

    override val _accountType: String = "Deposit"
    override def toString(): String = s"Account Id= ${getId},name=${getName},dateOpened=${getDateOpened},accountType=${_accountType}"
    
}



object AccountRunner extends App{

    // val a1=new Account(UUID.randomUUID(),"Account 1",LocalDateTime.now())
    // val a2=new Account(UUID.randomUUID(),"Account 2",LocalDateTime.now())
    // val a3=new Account("Account 3")

    // println(a1.getId,a1.getName,a1.getDateOpened)
    // println(a2.getId,a2.getName,a2.getDateOpened)
    // println(a3.getId,a3.getName,a3.getDateOpened)

    // // a1._id=UUID.randomUUID()
    // // a1._name="Updated Account 01"
    // a1.setName("Updated Account 1")
    // println(a1.getId,a1.getName,a1.getDateOpened)

    val ca1:Account =new CreditAccount("Travel Mastercard")
    println(ca1.getId,ca1.getName,ca1.getDateOpened,ca1.getAccountType)
    println(ca1)

    println("---------------------------------------------")

    val da1:Account=new DepositAccount("Super Savings Account")
    println(da1.getId,da1.getName,da1.getDateOpened,da1.getAccountType)
    println(da1)

}
