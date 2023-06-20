package textprocess

/**
 * ClassName: TextProcessorV2
 * Description:TextProcessorV2
 *
 * @author YCKJ1729
 * @version 1.1.0
 * @date 2023/6/14 15:59
 */
class TextProcessorV2 {

    fun processText(text: String): List<WordFreq> {
        return text
            .clean()
            .split(" ")
            .getWordCount()
            .mapToList { WordFreq(it.key, it.value) }
            .sortedByDescending { it.frequency }
    }
}

private fun String.clean(): String {
    return this.replace("[^A-Za-z]".toRegex(), " ")
        .trim()
}

private fun List<String>.getWordCount(): Map<String, Int> {
    val map = hashMapOf<String, Int>()
    for (word in this) {
        if (word == "") continue
        val trim = word.trim()
        val count = map.getOrDefault(trim, 0)
        map[trim] = count + 1
    }
    return map
}


private fun <T> Map<String, Int>.mapToList(transform: (Map.Entry<String, Int>) -> T): MutableList<T> {
    val list = mutableListOf<T>()
    for (entry in this) {
        val freq = transform(entry)
        list.add(freq)
    }
    return list
}

