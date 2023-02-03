package cn.cloudwalk.myapplication

/**
 * ClassName: InlineTest<br/>
 * Description: TODO Description. <br/>
 * date: 2023/2/3 11:36<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
inline fun num1AndNum2(num1:Int,num2:Int,operation:(Int,Int) -> Int):Int{
    val result = operation(num1,num2)
    return result
}

inline fun printString(str:String,block:(String)->Unit){
    println("printString begin")
    block(str)
    println("printString end")
}

inline fun runnaable(crossinline block: () -> Unit){
    val runnable = Runnable {
        block()
    }
    runnable.run()
}

fun main() {
    val num1 = 100
    val num2 = 80
    val result = num1AndNum2(num1,num2){n1,n2->
        n1+n2
    }
    println(result)

    println("main start")
    val str  = ""
    printString(str){s->
        println("lambda start")
        if (s.isEmpty()) return@printString
        println(s)
        println("lambda end")
    }
    println("main end")
}