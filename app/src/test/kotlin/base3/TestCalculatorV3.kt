package base3


import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * ClassName: TestCalculatorV3<br/>
 * Description: TODO Description. <br/>
 * date: 2023/5/6 11:00<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */

class TestCalculatorV3 {
    @Test
    fun testCalculate() {
        val calculator = CalculatorV3()

        val res1 = calculator.calculate("1+2")
        assertEquals("3", res1)
    }
}