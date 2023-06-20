package delegate

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * ClassName: StringDelegate<br/>
 * Description: TODO Description. <br/>
 * date: 2023/6/16 18:35<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */

class StringDelegate(private var s: String = "Hello"): ReadWriteProperty<Owner, String> {
    override operator fun getValue(thisRef: Owner, property: KProperty<*>): String {
        return s
    }
    override operator fun setValue(thisRef: Owner, property: KProperty<*>, value: String) {
        s = value
    }
}