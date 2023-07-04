package textprocess

/**
 * ClassName: TextProcessorV1
 * Description:TextProcessorV1
 *
 * @author YCKJ1729
 * @version 1.1.0
 * @date 2023/5/22 11:37
 */

@Deprecated(
    message = "Use TextProcessorV4 instead",
    replaceWith = ReplaceWith("TextProcessorV4"),
            level = DeprecationLevel.ERROR
)
class TextProcessorV1 {
    fun processText(text: String): List<WordFreq> {
        // 步骤1 清理文本中的标点符号
        val cleaned = clean(text)
        // 步骤2: 将文本分割成单词
        val words = cleaned.split(" ")
        // 步骤3: 计算单词出现的频率
        val map = getWordCount(words)
        // 步骤4: 按照频率排序
        val list = sortByFrequency(map)
        return list
    }


    /**
     * 清除文本中的标点符号
     */
    fun clean(text: String): String {
        //非字符串的字符替换成空格
        return text.replace("[^A-Za-z]".toRegex(), " ")
            .trim()
    }


    fun getWordCount(list: List<String>): Map<String, Int> {
        val map = hashMapOf<String, Int>()

        for (word in list) {
            // ① 如果是空字符串，跳过
            if (word == "") continue
            val trim = word.trim()
            // ② 更新map中的值
            val count = map.getOrDefault(trim, 0)
            map[trim] = count + 1
        }
        return map
    }


    fun sortByFrequency(map: Map<String, Int>): MutableList<WordFreq> {
        val list = mutableListOf<WordFreq>()
        for (entry in map) {
            if (entry.key == "") continue
            val freq = WordFreq(entry.key, entry.value)
            // ①
            list.add(freq)
        }

        // ②
        list.sortByDescending {
            it.frequency
        }
        return list
    }
}