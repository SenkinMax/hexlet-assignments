package exercise;

import java.util.*;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        List<String> words = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        Map<String, Integer> result = new HashMap<>();

        if (sentence.equals("")) {
            return result;
        }

        for (String word: words) {
            if (result.containsKey(word)) {
                Integer value = result.get(word);
                result.replace(word, value + 1);
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }

    public static String toString(Map<String, Integer> words) {
        StringBuilder result = new StringBuilder();

        if (!words.isEmpty()) {
            for (Map.Entry<String, Integer> wordsEntry : words.entrySet()) {
                result.append("\n  ").append(wordsEntry.getKey()).append(": ").append(wordsEntry.getValue());
            }
            result.append("\n");
        }

        return "{" + result + "}";
    }
}
//END
