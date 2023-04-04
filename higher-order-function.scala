object HigherOrderFunction extends  App {
  
    def square(n:Int):Int = n*n             // (Int) => Int
    def square(n:Int,i:Int):Int = n*n             // (Int,Int) => Int
    def cube(n:Int):Int = n*n*n             // (Int) => Int
    def sum(a:Int,b:Int)=a+b                // (Int,Int) => Int
    def length(a:String):Int = a.length     // (String) => Int


    def transform(f:Int=>Int,numbers:Int*)={
        numbers.map(f)
    }

    val squaredNumbers=transform(square,1,2,3,4)
    println("Squared Number:",squaredNumbers)

    val cubedNumbers=transform(cube,1,2,3,4)
    println("Cubed Number:",cubedNumbers)

    val addedBy2=transform(n=>n+2,2,4,6,8)
    println("Added By 2 Numbers",addedBy2)

    println("--------- Inbuilt Higer Order Functions--------")

    val numbers=Array(1,2,3,4,5,6,7)
    val derivedFromMap=numbers.map(number=>number+10)
    val filteredBy3=numbers.filter(number=>number%3==0)

    println(derivedFromMap.mkString(","))
    println(filteredBy3.mkString(","))
}
