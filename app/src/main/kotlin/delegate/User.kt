package delegate

import kotlin.properties.Delegates

/**
 * ClassName: User<br/>
 * Description: TODO Description. <br/>
 * date: 2023/6/16 15:44<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
class User {
    var name: String by Delegates.observable("<no name>") {
            prop, old, new ->
        println("$old -> $new")
    }
}