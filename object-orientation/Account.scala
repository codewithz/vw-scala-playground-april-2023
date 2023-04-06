import java.util.UUID
import java.time.LocalDateTime

class Account(id:UUID,name:String,dateOpened:LocalDateTime) {

    var _id:UUID=id
    var _name:String=name
    var _dateOpened:LocalDateTime=dateOpened

    //Auxiliary Constructor 

    def this(name:String){
        this(UUID.randomUUID(),name,LocalDateTime.now)
    }
  
}

object AccountRunner extends App{

    val a1=new Account(UUID.randomUUID(),"Account 1",LocalDateTime.now())
    val a2=new Account(UUID.randomUUID(),"Account 2",LocalDateTime.now())
    val a3=new Account("Account 3")

    println(a1._id,a1._name,a1._dateOpened)
    println(a2._id,a2._name,a2._dateOpened)
    println(a3._id,a3._name,a3._dateOpened)

}
