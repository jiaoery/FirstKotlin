package textprocess

/**
 * ClassName: TextProcessorV4
 * Description:TextProcessorV4
 *
 * @author YCKJ1729
 * @version 1.1.0
 * @date 2023/6/15 10:25
 */
class TextProcessorV4 {
    fun processText(text: String): List<WordFreq> {
        return text
            .clean()
            .split(" ")
            .filter { it !=""}
            .groupBy { it }
            .map { WordFreq(it.key, it.value.size) }
            .sortedByDescending { it.frequency }
    }
}

private fun String.clean(): String {
    return this.replace("[^A-Za-z]".toRegex(), " ")
        .trim()
}

