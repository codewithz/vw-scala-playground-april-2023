object ListsExamples extends App {

    val list1=List()
    println(list1)

    val list2=List(1,2,3,4)
    println(list2)

    val list3:List[String]=List()

    var colors=List("red","green","blue")
    println(colors)

    var list4= "red" :: ("yellow" :: Nil)
    println(list4)

    var list5= "red" :: ("yellow" :: ("blue" :: Nil))
    println(list5)

    println("---------- Traversing the List----------------")

    val numbers=List(2,4,6,8,10)

    for(element <- numbers.iterator){
        println(element)
    }

    for(element <- numbers){
        println(element)
    }

    println("--------------- foreach------------")

    var sum=0
    var anotherSum=0;

    numbers.foreach(sum+=_)
    println(sum)

    numbers.foreach(number => {
        anotherSum=anotherSum+number
    })

    println(anotherSum)

    println("--------------- using for loop-------------")
    for(number <- numbers){
        println(number)
    }

    println("--------------- for-each v1-------------")
    
    numbers.foreach(number => println(number))

    println("--------------- for-each v2-------------")

    numbers.foreach(println)

    



  
}
