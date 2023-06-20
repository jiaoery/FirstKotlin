package delegate

/**
 * ClassName: Item<br/>
 * Description: TODO Description. <br/>
 * date: 2023/6/16 15:51<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */

// 近似逻辑，实际上，底层会生成一个Item$total$2类型的delegate来实现

class Item {
    var count: Int = 0

    var total: Int
        get() = count

        set(value: Int) {
            count = value
        }
}