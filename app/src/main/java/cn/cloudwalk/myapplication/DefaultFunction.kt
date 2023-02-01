package cn.cloudwalk.myapplication

class DefaultFunction {
    fun printParams(num:Int,str:String="hello"){
        println("num is $num ,str is $str")
    }

    fun printParams1(num: Int =100,str: String){
        println("num is $num , str is $str")
    }

}

fun main() {
    printParams(123)
    printParams1(str="world")
}