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

    // 需要MutableList<Animal>，实际传MutableList<Cat>
//    foo(mutableListOf<Cat>(Cat()))
    // 实际上，编译器在这里就会提示错误，我们现在假设编译器不阻止我们，会出什么问题


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



// 需要父类集合，传入子类集合

fun foo(list: MutableList<Animal>) {
    // 出错，Cat集合不能存Dog对象
    list.add(Dog())
    // 通过
    val animal: Animal = list[0] // 取出的Cat对象
}


//                         变化在这里
//                             ↓
fun buy(controller: Controller<in XiaoMiTV1>) {
    val xiaoMiTV1 = XiaoMiTV1()
    // 打开小米电视1
    controller.turnOn(xiaoMiTV1)
}
