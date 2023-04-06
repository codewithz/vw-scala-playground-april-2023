
import java.time.LocalDateTime


case class Transaction(name:String,amount:Double,kind:String,when:LocalDateTime)

object TransactionRunner extends App{

    private val when=LocalDateTime.now
    val t1=Transaction("T1",12.22,"debit",when)
    println(t1.toString)
    // t1.amount=34.12  error: reassignment to val

    val t2=Transaction("T1",12.22,"debit",when)
    println(t2)

    println(t1 == t2)
    println(t1.hashCode())
    println(t2.hashCode())

    val t3=t1.copy(name = "T3",amount=100.10)
    println(t3)

}
