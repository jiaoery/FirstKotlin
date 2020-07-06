package cn.cloudwalk.myapplication

/**
 * ClassName: Person<br/>
 * Description: TODO Description. <br/>
 * date: 2020/6/19 14:20<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
open class Person {
    //姓名
    var name = ""
    //性别
    var age = 0


    fun eat(){
        println("$name is eating.He is $age years old.")
    }
}

fun main(){
    val p = Person()
    p.name = "Jack"
    p.age = 19
    p.eat()
}