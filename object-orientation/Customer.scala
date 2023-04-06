import java.util.UUID

class Customer(first:String,last:String,email:String) {
  
    private val _id=UUID.randomUUID();
    private val _first=first
    private val _last=last
    private val _email=email

    def getId:UUID= _id
    def getFirst:String=_first
    def getLast:String=_last
    def getEmail:String=_email

    override def toString(): String = s"Id=${_id}, Name= ${_first} ${_last}, Email=${_email}"

}

trait Address{
    protected var _zip:Int
    protected var _street:String
    protected var _state:String

    def setZip(zip:Int):Unit
    def setStreet(street:String):Unit
    def setState(state:String):Unit
    def printAddress():Unit = println(s"${_street},${_state},${_zip}")
}

class CustomerWithAddress(first:String,last:String,email:String) 
                    extends Customer(first,last,email) with Address{

    override protected var _state: String = ""
    override protected var _zip: Int = -1
    override protected var _street: String = ""

    override def setStreet(street: String): Unit = {
        _street=street
    }
    override def setState(state: String): Unit = {
        _state=state
    }
    override def setZip(zip: Int): Unit = {
        _zip=zip
    }
    
}




object CustomerRunner extends App{
     val c1:Customer=new Customer("Tom","Smith","tom.smith@gmail.com")
     println(c1.getId,c1.getFirst,c1.getLast,c1.getEmail)

     val c2=new CustomerWithAddress("Tony","Stark","tony.stark@gmail.com")
     c2.setState("California")
     c2.setStreet("45 Fermont St")
     c2.setZip(950501)
     println(c2)
     c2.printAddress()

}
