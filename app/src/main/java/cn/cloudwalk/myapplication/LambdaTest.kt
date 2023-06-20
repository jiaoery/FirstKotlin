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
object  LambdaTest {

    fun lambda(){
        val list  = mutableListOf("Apple","Banana","Orange","Pear","Grape")
        list.add("Watermelon")
        /**lambda表达式**/
        val lambda = {fruit:String -> fruit.length}
        val maxLengthFruit = list.maxByOrNull(lambda)
        println("maxlength fruit is $maxLengthFruit")
        /**优化表达式1；直接传递lambda表达式**/
        val maxLengthFruit1 = list.maxByOrNull({fruit:String ->fruit.length})
        /**当只有一个表达式，可以放在外面**/
        val maxLengthFruit2 = list.maxByOrNull(){fruit:String ->fruit.length}
        /**参数不需要指定参数类型**/
        val maxLengthFruit3 = list.maxByOrNull{fruit->fruit.length}
        /**参数只有一个，可以用it代替**/
        val maxLengthFruit4 = list.maxByOrNull{it.length}
    }

    /**
     * 小写转大写
     */
    fun upperCase(){
        val list = listOf("Apple","Orange","Pear","Grape","Watermelon")
        val newlist = list.map { it.toUpperCase() }
        for (fruit in newlist){
            println(fruit)
        }
    }

    /**
     * 增加筛选条件
     */
    fun filterUpperCase(){
        val list = listOf("Apple","Orange","Pear","Grape","Watermelon")
        val newlist = list.filter {it.length>5 }.map { it.toUpperCase() }
        for (fruit in newlist){
            println(fruit)
        }
    }

}

fun main() {
    /**listof创建的集合为不可变集合，无法对集合进行增删改**/
    val list = listOf("Apple","Banana","Orange","Pear","Grape","Watermelon")
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
    val maxlengthFruit = list.maxByOrNull { it.length }
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
        println("fruit is $fruit. number is $number")
    }

    LambdaTest.lambda()

    LambdaTest.upperCase()

    LambdaTest.filterUpperCase()

    val anyResult = list.any { it.length<=5 };
    var allResult = list.all { it.length<=5 };
    println("anyResult is $anyResult,allResult is $allResult")

    Thread{ println("Thread is running") }.start()

}