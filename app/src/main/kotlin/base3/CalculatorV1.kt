package base3

import kotlin.system.exitProcess

/**
 * ClassName: Test<br/>
 * Description: TODO Description. <br/>
 * date: 2023/5/5 15:11<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
val help ="""
    1. 输入 1 + 1，按回车，即可使用计算器；
    2. 注意：数字与符号之间要有空格；
    3. 想要退出程序，请输入：exit
    --------------------------------------
    """.trimMargin()
fun main(){
    while (true){
        //初始化打印信息
        println(help)
        //第一步，读取输入命令：
        val input = readLine() ?: continue
        //第二步，判断输入是否为exit，如果是则退出程序
        if (input == "exit") exitProcess(0)
        //第三步，解析算式,分解出“数字”与“操作符”：“1”“+”“2”；
        val inputList = input.split(" ")
        val result = calculate(inputList)
        // 第五步，输出结果：1 + 2 = 3；
        if (result == null) {
            println("输入格式不对")
            continue
        } else {
            println("$input = $result")
        }
        // 第六步，进入下一个while循环。

    }
}

// 具体计算逻辑
private fun calculate(inputList: List<String>): Int? {
    if (inputList.size != 3) return null
    // 第七步，取出数字和操作符
    val left = inputList.get(0).toInt()
    val operation = Operation.valueOf(inputList.get(1))
    val right = inputList.get(2).toInt()
    // 第八步，根据操作符的类型，执行计算
    return when(operation) {
        Operation.ADD -> left + right
        Operation.MINUS -> left - right
        Operation.MULTI -> left * right
        Operation.DIVI -> left / right
    }
}


