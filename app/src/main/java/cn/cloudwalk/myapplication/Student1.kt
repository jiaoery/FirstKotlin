package cn.cloudwalk.myapplication

/**
 * ClassName: Student1<br/>
 * Description: 特殊方式的构造函数
 * date: 2020/7/6 18:20<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Student1(val sno:String,val grade:Int,name:String,age:Int) : Person1(name,age),Study {

    constructor(name: String,age: Int):this("",0,name,age){

    }

    constructor():this("",0){

    }

    override fun readBooks() {
        println(name+" is reading.")
    }

}