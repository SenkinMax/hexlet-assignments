package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
class App {
    /**
     * Метод принимает преложение sentence и возвращает словарь слов и их частоты в предложении
     * @param sentence Исходное предложение.
     * @return Возвращает словарь, где ключи - слова, а значение - частота появления в предложении
     */
    public static Map<String, Integer> getWordCount(String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Integer> result = new HashMap<>();

        if (sentence.length() == 0) {
            return result;
        }

        for (String word: words) {
            int wordCount = result.getOrDefault(word, 0);
            wordCount++;
            result.put(word, wordCount);

        }

        return result;
    }

    public static String toString(Map<String, Integer> words) {
        StringBuilder result = new StringBuilder();

        result.append("{");

        if (!words.isEmpty()) {
            for (Map.Entry<String, Integer> wordsEntry : words.entrySet()) {
                result.append("\n  ")
                        .append(wordsEntry.getKey())
                        .append(": ")
                        .append(wordsEntry.getValue());
            }
            result.append("\n");
        }

        result.append("}");

        return result.toString();
    }
}
//END
