package cn.cloudwalk.myapplication

/**
 * ClassName: LambdaTest<br/>
 * Description: TODO Description. <br/>
 * date: 2020/7/7 15:16<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
class LambdaTest {

}

fun main() {
    /**listof创建的集合为不可变集合，无法对集合进行增删改**/
    val list = listOf("Apple","Banana","Orange","Pear","Grape")
//    list.add("Watermelon")
    for (fruit in list){
        println(fruit)
    }

    /**mutableListOf建立可拓展list**/
    val list1  = mutableListOf("Apple","Banana","Orange","Pear","Grape")
    list1.add("Watermelon")
    for (fruit in list1){
        println(fruit)
    }
    val maxlengthFruit = list.maxBy { it.length }
    println("max length fruit is "+maxlengthFruit)

    /**map构建**/
    val map = HashMap<String,Int>()
    map["Apple"]=1
    map["Banana"]=2
    map["Orange"]=3
    map["Pear"]=4
    map["Graper"]=5

    val map1 = mapOf("Apple" to 1,"Banana" to 2,"Orange" to 3,"Pear" to 4,"Graper" to 5)
    for ((fruit,number) in map){
        println("fruit is "+ fruit+". number is "+number)
    }



}