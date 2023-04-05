object Filtering extends App {

    val evens:Int =>Boolean = _ % 2 == 0
    val shortWords :String => Boolean = _.length<=3

    val numbers=List(1,2,3,4,5,6)
    val words="The quick brown fox jumps over the lazy dog".split(" ").to(List)

    println(numbers.filter(evens))
    println(words.filter(shortWords))
}
