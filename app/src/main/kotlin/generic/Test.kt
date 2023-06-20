package generic

/**
 * ClassName: Test<br/>
 * Description: TODO Description. <br/>
 * date: 2023/6/20 15:47<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
fun main() {
//                                泛型的实参
//                                   ↓
//        val mi1Controller = Controller<XiaoMiTV1>()
//        mi1Controller.turnOn()

//                                  泛型的实参
//                                     ↓
//        val mi2Controller = Controller<XiaoMiTV2>()
//        mi2Controller.turnOn()


    // 报错，因为Car不是TV的子类
//    val controller = Controller<Car>()


}



//     函数的泛型参数
//   ↓             ↓
fun <T> turnOn(tv: T){
    //...
}


fun <T> turnOff(tv: T){
    //...
}

fun turnOnAll(mi1: XiaoMiTV1, mi2: XiaoMiTV2) {
//      泛型实参自动推导
//          ↓
    turnOn(mi1)
    turnOn(mi2)
}