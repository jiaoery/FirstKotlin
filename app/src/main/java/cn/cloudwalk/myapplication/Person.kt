package cn.cloudwalk.myapplication

/**
 * ClassName: Person<br/>
 * Description: open字段代表该类可被继承；默认类是不可被继承的
 * date: 2020/6/19 14:20<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
open class  Person {
    //姓名
    var name = ""
    //性别
    var age = 0


    fun eat(){
        println("$name is eating.He is $age years old.")
    }
}
