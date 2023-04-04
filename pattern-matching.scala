object PatternMatching extends App {

    var amount=500

    println("----------- Literal Pattern-----------")
    amount match{
        case 50 => println("$50") 
        case 100 => println("$100") 
        case _ => println("Not a 50 or 100 $ bill")
    }

    println("----------- Variable Pattern-----------")

    amount match {
        case a if a>=500 => println("Bill is >=500, its a "+a)
        case a if a == 100 =>println("Its a $100 bill")
        case a => println("The amount is "+a)
    }

    println("-----------  Pattern as an expression-----------")

     val result=amount match {
        case a if a>=500 => a
        case a if a == 100 =>"Its a $100 bill"
        case a => "The amount is "+a
    }

    println("Result:"+result)

    println("----------------- Pattern Matching on Types ---------------")
    
    abstract class Currency 
    case class USD() extends Currency
    case class CAD() extends Currency
    case class NZD() extends Currency

    val currency:Currency =CAD()
    val amount1=100;

    currency match{
        case u:USD =>println("USD "+amount1)
        case c:CAD =>println("USD "+amount1*(1/1.30))
        case n:NZD =>println("USD "+amount1*(1/1.50))
    }
        
    println("---------- Extracting Data using Pattern ---------")

    val anArray=Array(100,200,300,400)

    anArray match{
        case Array(first,second,third) =>println(first+"-"+second+"-"+third)
        case Array(_,_,third,_) =>println("Third:"+third)
        case _: Array[?] => println("Default")
    }
        
    
    
        
    
        
    
  
}
