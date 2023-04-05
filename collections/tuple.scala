object TupleExample extends App {

    val t1=(1,3)
    println(t1)

    val t2=("A","B","C")
    println(t2)

    val t3=(("BEL",7),("CR",13),("LF",10))
    println(t3)

    val t4:Tuple2[String,Int]=("A",23)
    println(t4)

    println("----- getting elements in tuple ---------- tuple._n")

    val tuple="A"->23
    println(tuple)
    val a=tuple._1
    val b=tuple._2

    println(a," ",b)
}
