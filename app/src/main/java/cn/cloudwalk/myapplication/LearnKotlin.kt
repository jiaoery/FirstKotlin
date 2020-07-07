package cn.cloudwalk.myapplication

import kotlin.math.max

/**
 * ClassName: LearnKotlin<br/>
 * Description: TODO Description. <br/>
 * date: 2020/6/18 15:43<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */

/**
 * kotlin中函数
 * @param param1 参数一
 * @param param2 参数二
 * @return 返回参数
 */
fun methodName(param1: Int, param2: Int): Int {
    return 0
}

fun largerNumber(param1: Int, param2: Int): Int {
    return max(param1, param2)
}

/**
 * if语句，与java通用
 */
fun largerNumber0(num1: Int, num2: Int): Int {
    var value = 0
    if (num1 > num2) {
        value = num1
    } else {
        value = num2
    }
    return value
}

/**
 * 特殊使用语句if，简化largerNumber0方法
 */
fun largerNumber1(num1: Int, num2: Int): Int {
    var value = if (num1 > num2) {
        num1
    } else {
        num2
    }
    return value
}

/**
 * 更加简化版本的largeNumber1
 */
fun largerNumber2(num1: Int, num2: Int): Int {
    return if (num1 > num2) {
        num1
    } else {
        num2
    }
}

/**
 * 利用语法糖实现的
 */
fun largerNumber3(num1: Int, num2: Int) = if (num1 > num2) {
    num1
} else {
    num2
}

//When语句
fun getScore(name: String) = if (name == "Tom") {
    86
} else if (name == "Jim") {
    77
} else if (name == "Jack") {
    95
} else if (name == "Lily") {
    100
} else {
    0
}

/**
 * 使用when语句实现
 */
fun getScore1(name: String) = when (name) {
    "Tom" -> 86
    "Jim" -> 77
    "Jack" -> 95
    "Lily" -> 100
    else -> 0

}

/**
 * 简化版本
 */
fun getScore2(name: String) = when {
    name == "Tom" -> 86
    name == "Jim" -> 77
    name == "Jack" -> 95
    name == "Lily" -> 100
    else -> 0
}

/**
 * 使用when做类型判断
 */
fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("num is Int")
        is Double -> println("num is Double")
        else -> println("num not support")
    }

}

//循环语句
fun forwhile() {
    /**类似于java中的for(int i=0;i<=10;i++)**/
    for (i in 1..10) {
        println(i)
    }

    /**类似于java中的for(int i=0;i<10;i+=2)**/
    for (i in 0 until 10 step 2) {
        println(i)
    }

    /**类似于java中的for(int i =10;i>=1;i--)**/
    for (i in 10 downTo 1) {
        println(i)
    }
}


fun main() {
    println("Hello World")

//    变量
    var a = 10
    println("a = $a")
    a *= 10
    println("a = $a")
    val num = 10
    checkNumber(num)
    val num1 = 10L
    checkNumber(num1)
    forwhile()
    /**实例化对象无需写new**/
    val p = Person()
    p.name = "Jack"
    p.age = 19
    p.eat()

    val student = Student("snow",12)
    student.readBooks()
    student.doHomework()
    val student1 =Student1("aa",5,"jack",19)
    student1.doHomework()

    val cellphone1 = Cellphone("Samsung",1299.99)
    val cellphone2 = Cellphone("Samsung",1299.99)
    println(cellphone1)
    println("cellphone1 equals cellphone2 " + (cellphone1 == cellphone2))

    //单例模式对比java和kotlin
    SingletonJava.getInstance().singletonTest()
    SigntonKotlin.singletonTest()


}