object Functions extends App {
  

    def square(x:Int):Int ={
        return x*x
    }

    val sq_10=square(10);
    println(sq_10)

    def sqaureWithoutReturn(x:Int):Int ={
        x*x
    }

    val sq_10_1=sqaureWithoutReturn(9);
    println(sq_10_1)

    def sqaureWithoutBraces(x:Int):Int = x*x 
    println(sqaureWithoutBraces(8))

    println("---------- Function with multiple parameters -------------")

    def multiply(x:Int,y:Int)=x*y 

    val mul_10_30=multiply(10,30)
    println(mul_10_30)

    println("---------- Function with varying args -------------")

    def multiply(nums:Int*)={
        var product=1;
        for(num<-nums){
            product=product*num
        }
        product
    }

    val mul_10_30_20=multiply(10,20,30)
    val mul_10_30_20_40=multiply(10,20,30,40)
    val mul_10=multiply(10)
    println(mul_10_30_20)
    println(mul_10_30_20_40)
    println(mul_10)

    println("----------------- Local Functions----------------")
    /**
      * We will create a function sumOdd, which takes an integer
      * for example argument was 15 , we will first filter out all the odd number in 1-15
      * then we will take the sum of it
      */

      def sumOdd(n:Int):Int ={

        def getOdd(x:Int):Array[Int]={
            var result=Array[Int]()
            var current=1
            while(current<=x){
                if(current%2==1){
                    result=result:+current
                }
                current=current+1
            }
            result
        }

        val odds=getOdd(n)
        println(odds.mkString(","))
        odds.sum

      }

      val sumOfOdds=sumOdd(15);
      println("SUM:"+sumOfOdds)

      println("---------- Named Arguments ------------------")

      def greet(first:String,last:String):Unit={
        println("Hello!",first,last)
      }

      greet("Zartab","Nakhwa")
      greet("Nakhwa","Zartab")
      greet(last="Nakhwa",first="Zartab")

      println("-------------- Default Arguments -----------")

      def logTransactions(amount:Double,
                          debit:Boolean=true,
                          currency:String="INR")={
        val symbol=if(debit) "-" else "+"
        println(symbol+currency+amount)
      }

      logTransactions(100.25)
      logTransactions(23.44)
      logTransactions(10000.25,false,"INR")
      logTransactions(10.25,debit=false,currency="USD")

}
