package cn.cloudwalk.myapplication

/**
 * ClassName: StringExtend<br/>
 * Description: TODO Description. <br/>
 * date: 2023/2/2 14:16<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
fun String.lettersCount():Int{
    var count = 0
    for (char in this){
        if (char.isLetter()){
            count++
        }
    }
    return count
}

operator fun String.times(n:Int)=repeat(n)

fun main() {
    val count = "ABC123xyz!@#".lettersCount()
    println("count : $count")
    var str  = "abc"*3
    print(str)
}