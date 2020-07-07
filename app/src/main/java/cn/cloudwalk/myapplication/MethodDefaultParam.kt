package cn.cloudwalk.myapplication

/**
 * ClassName: MethodDefaultParam<br/>
 * Description: TODO Description. <br/>
 * date: 2020/7/7 17:17<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
/**
 * 具备默认参数的方法
 */
fun printParams(num:Int,str:String = "hello"){
    println("num is $num,str is $str")
}

fun printParams1(num:Int=100,str:String ){
    println("num is $num,str is $str")
}

fun main() {
    /**
     * 这里可以只传入num
     */
    printParams(123)
    /**
     * 当第一个参数为默认，后面无默认参数,需要指定赋值参数
     */
//    printParams1("wolrd")
    printParams1(str = "Hello")
}