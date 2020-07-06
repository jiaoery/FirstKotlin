package cn.cloudwalk.myapplication

/**
 * ClassName: Student<br/>
 * Description: java中常用的extends ,implementation都用:代替
 * date: 2020/6/19 14:40<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
class Student(val sno:String,val grade:Int):Person() {
    /**
     * 这里构造方式类似java中
     * public Student(String sno ,String grade){
     *
     * }
     */


    init {
        println("sno is " + sno)
        println("grade is " + grade)
    }


}