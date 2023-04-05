object CardValidation extends App {

    def validate(number:String):Boolean ={
        val sum=number
            .map(_.asDigit)
            .reverse
            .zipWithIndex
            .map{ case (digit,index) => if(index%2==0) digit else digit*2}
            .flatMap(number=>List(number/10,number%10).filter(_ != 0))
            .sum

        sum%10 == 0

    }

    print(validate("49927398716")) //valid
    print(validate("79927398711")) //invalid
  
}
