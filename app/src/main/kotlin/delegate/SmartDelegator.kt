package delegate

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * ClassName: SmartDelegator<br/>
 * Description: TODO Description. <br/>
 * date: 2023/6/16 18:33<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */

class SmartDelegator {

    operator fun provideDelegate(
        thisRef: Owner,
        prop: KProperty<*>
    ): ReadWriteProperty<Owner, String> {

        return if (prop.name.contains("log")) {
            StringDelegate("log")
        } else {
            StringDelegate("normal")
        }
    }
}



class Owner {
    var normalText: String by SmartDelegator()
    var logText: String by SmartDelegator()
}

fun main() {
    val owner = Owner()
    println(owner.normalText)
    println(owner.logText)
}

//结果：
//normal
//log