package delegate

/**
 * ClassName: Test<br/>
 * Description: TODO Description. <br/>
 * date: 2023/6/16 15:11<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */

//            定义懒加载委托
//               ↓   ↓
val data: String by lazy {
    request()
}

fun request(): String {
    println("执行网络请求")
    return "网络数据"
}

fun main() {
    val item = Item()
    item.total = 10
    println("item.total = ${item.total},item.count = ${item.count}")
    item.count = 11
    println("item.total = ${item.total},item.count = ${item.count}")

    val user1 = User1(mapOf(
        "name" to "John Doe",
        "age"  to 25
    ))
    println(user1.name) // Prints "John Doe"
    println(user1.age)  // Prints 25

    println("开始")
    println(data)
    println(data)

    val user = User()
    user.name = "first"
    user.name = "second"
}

//结果：
//开始
//执行网络请求
//网络数据
//网络数据