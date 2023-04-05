object MutableVSImmutable extends App {

    import scala.collection.mutable.Set
    val a=Set(1,2)

    a+=4

    println("a",a)

    println("-------- Mutable to Immutable to Mutable -------------")

    import scala.collection.{immutable,mutable}

    val x=immutable.Set(1,2,3)
    println(x)

    val y=x to mutable.SortedSet
    println(y)

    val z=y to immutable.Set
    println(z)
  
}
