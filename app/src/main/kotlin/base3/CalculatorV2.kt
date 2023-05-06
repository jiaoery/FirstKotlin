package cn.cloudwalk.myapplication.base3

import base3.Expression
import base3.Operation
import kotlin.system.exitProcess

/**
 * ClassName: Calculator<br/>
 * Description: TODO Description. <br/>
 * date: 2023/5/5 15:09<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
class CalculatorV2 {

    val HELP ="""
    1. 输入 1 + 1，按回车，即可使用计算器；
    2. 注意：数字与符号之间要有空格；
    3. 想要退出程序，请输入：exit
    --------------------------------------
    """.trimMargin()

    fun start() {
        while (true) {
            println(HELP)
            val input = readLine() ?: continue
            val result = calculate(input)
            if (result == null) {
                println("输入格式不对")
                continue
            } else {
                println("$input = $result")
            }
        }
    }


    fun calculate(input: String): String? {
        if (shouldExit(input)) exitProcess(0)
        val exp = parseExpression(input) ?: return null
        val left = exp.left
        val operator = exp.operator
        val right = exp.right
        return when (operator) {
            Operation.ADD -> addString(left, right)
            Operation.MINUS -> minusString(left, right)
            Operation.MULTI -> multiString(left, right)
            Operation.DIVI -> diviString(left, right)
        }
    }

    fun addString(left: String, right: String): String {
        val result = left.toInt() + right.toInt()
        return result.toString()
    }
    fun minusString(left: String, right: String): String {
        val result = left.toInt() - right.toInt()
        return result.toString()
    }
    fun multiString(left: String, right: String): String {
        val result = left.toInt() * right.toInt()
        return result.toString()
    }
    fun diviString(left: String, right: String): String {
        val result = left.toInt() / right.toInt()
        return result.toString()
    }

    fun shouldExit(input: String): Boolean {
        return input == "exit"
    }


    fun parseExpression(input: String): Expression? {
        // 解析操作符
        val operation = parseOperator(input) ?: return null
        // 用操作符分割算式，拿到数字
        val list = input.split(operation.value)
        if (list.size != 2) return null

        return Expression(
            // 算式左边
            left = list[0].trim(),
            operator = operation,
            // 算式右边
            right = list[1].trim()
        )
    }


    fun parseOperator(input: String): Operation? {
        Operation.values().forEach {
            if (input.contains(it.value)) {
                return it
            }
        }
        return null
    }
}

fun main() {
    val calculatorV2 = CalculatorV2()
    calculatorV2.start()
}