object FindingElementsInList extends App {
  
    val names:List[String]=List("Dale","Susan","Bob","Del")

    names match {
        case List("Dale",_,_) => println("found Dale")
        case List(_,"Susan",x,_*) if x=="Del" => println("after Susan is "+x)
        case _                 => println("No matches found")
    }

    println("----------- Patterns on List of Names----------")
 
    val namesList=List(List("Tom","Alex"),List("Mike","John"))

    namesList match{
        case List(List("Tom",_,_),_*) =>println("Found Tom")
        case List(_,List("Mike",_*),_*) => println("Found Mike")
        case _                      =>println("No Match")
    }

    println("-------------- find---------------------")

    val susan:String=>Boolean = name=>if(name == "Susan") true else false

    println(names.find(susan))
    println(names.find(name=>name=="Zartab"))
    println(names.find(_ =="Susan"))
    println(names.filter(susan))
    



        
        
    
}
