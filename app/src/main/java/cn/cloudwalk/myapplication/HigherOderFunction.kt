import kotlin.math.min

/**
 * ClassName: HigherOderFunction<br/>
 * Description: TODO Description. <br/>
 * date: 2023/2/2 15:47<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */

fun num1AndNum2(num1:Int,num2:Int,operation:(Int,Int)->Int):Int{
    val result = operation(num1,num2)
    return result
}

fun plus(num1: Int,num2: Int):Int{
    return num1+num2
}

fun minus(num1: Int,num2: Int):Int{
    return num1-num2
}

fun main() {
    val num1 = 100
    val num2 = 80
    val result1 = num1AndNum2(num1,num2,::plus)
    val result2 = num1AndNum2(num1,num2,::minus)
    println("result1 is $result1")
    println("result2 is $result2")

    val result3 = num1AndNum2(num1,num2){n1,n2->
        n1+n2
    }
    val result4 = num1AndNum2(num1,num2){n1,n2->
        n1-n2
    }
    println("result3 is $result3")
    println("result4 is $result4")
}