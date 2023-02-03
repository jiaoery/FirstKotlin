package cn.cloudwalk.myapplication

/**
 * ClassName: Money<br/>
 * Description: TODO Description. <br/>
 * date: 2023/2/2 14:31<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
class Money(val value:Int) {
    operator fun plus(money: Money):Money{
        val sum = value + money.value
        return Money(sum);
    }

    operator fun plus(newValue:Int):Money{
        val sum = value+newValue
        return Money(sum)
    }
}

fun main() {
    val money1 = Money(5)
    val money2 = Money(10)
    val money3 = money1 + money2
    println(money3.value)
    val money4 = money3+20
    println(money4.value)
}