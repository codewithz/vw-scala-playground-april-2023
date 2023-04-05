object MapAndFlatmap extends App {

  val double:Int => Int = _*2

  val numbers=List(1,2,3,4,5,6,7,8)

  val doubled=numbers.map(double)

  println(doubled)

  println("----------- flatmap-----------------")
  import java.util.Calendar._
  import java.util.Calendar.{getInstance => calendar}

  def age(year:Int):Int = {
    calendar.get(YEAR)-year
  }

  val years=List(1990,1984)

  println(years.map(age))

    def ages(year:Int):List[Int] = {
    List(age(year-1),age(year+1))
  }

  println("Map : ",years.map(ages))
  println("FlatMap : ",years.flatMap(ages))

}