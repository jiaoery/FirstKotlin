package cn.cloudwalk.myapplication

/**
 * ClassName: NullCheck<br/>
 * Description: TODO Description. <br/>
 * date: 2020/7/7 17:10<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
object NullCheck {

    /**
     * 这里无需判空，kotlin本身可以判空
     */
    fun doStudy(study:Study){
        study.readBooks()
        study.doHomework()
    }

    /**
     * 标记可以为空，方法中必须判空
     */
    fun doNullStudy(study: Study?){
        if(study != null){
            study.readBooks()
            study.doHomework()
        }
    }
}

fun main() {
    /**kotlin本身具备非空判定的能力**/
//    NullCheck.doStudy(null)
    NullCheck.doNullStudy(null)
}