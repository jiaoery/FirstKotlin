package delegate

/**
 * ClassName: User1<br/>
 * Description: TODO Description. <br/>
 * date: 2023/6/16 15:57<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
class User1(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}