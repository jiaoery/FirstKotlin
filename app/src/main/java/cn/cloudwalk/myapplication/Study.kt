package cn.cloudwalk.myapplication

/**
 * ClassName: Study<br/>
 * Description: TODO Description. <br/>
 * date: 2020/7/7 14:41<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
interface Study {
    fun readBooks()
    fun doHomework(){
        //默认接口实现
        println("do homework default implementation.")
    }
}