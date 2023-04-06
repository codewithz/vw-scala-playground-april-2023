class Student(id:Int,name:String,age:Int) {

    var _id:Int=id
    var _name=name
    var _age=age

    def this(name:String,age:Int)={
        this(1234,name,age)
    }
  
}

object StudentRunner extends App{

    val s1=new Student(1000,"Tom",25)
    val s2=new Student(1001,"Alex",26)
    val s3=new Student("Mike",26)
    

    println(s1._id,s1._name,s1._age)
    println(s2._id,s2._name,s2._age)
    println(s3._id,s3._name,s3._age)

}
