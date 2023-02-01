package cn.cloudwalk.myapplication

/**
 * ClassName: Util<br/>
 * Description: TODO Description. <br/>
 * date: 2023/1/30 17:18<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
class Util {
    fun doAction1(){
        println("do action1")
    }

    companion object{

        //标记为真正的静态方法
        @JvmStatic
        fun doAction2(){
            println("do Action2")
        }
    }
}