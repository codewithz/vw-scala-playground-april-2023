object ForLoop extends  App {
  
    val amounts=Array(10,34,21,54,12,17)
    val currencies=Array("USD","INR")

    for (amount <- amounts){
        println(amount)
    }
    println("---------------------------")
    println(amounts(3));

    //  Java 
    // for(Integer amount : amounts){

    // }
    println("-------- YIELDING---------")
    val result:Array[Int]=for (amount <- amounts) yield {
        amount*amount
    }

    println(result)

    for (r2<-result){
        println(r2)
    }

    println("--------------------------------------")
        // val result= for {} yield {}
   val result1=for {
        amount <- amounts
        currency <- currencies
    } yield currency+" "+amount


    for(r<-result1){
        println(r)
    }

    println("---------------Add the guards-----------------------")
        // val result= for {} yield {}
   val result3=for {
        amount <- amounts
        currency <- currencies
        if (currency == "USD") && amount>20
    } yield currency+" "+amount


    for(r3<-result3){
        println(r3)
    }

    println("-------------- foreach -------------------")

    amounts.foreach(amount => println(amount*1000))

    List(1,2,3,4).foreach(num => println(num*20))

    println("---------------------- while loop-------------------")

    var i=10

    while (i>0 && i<5){
        println(i)
        i=i-1
    }

    println("------------- do while loop -------------")

    var j = -100

    do{
        println(j)
        j=j-1
    }while (j>0 )

    






}
