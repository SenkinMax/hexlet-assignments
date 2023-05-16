package exercise;

import java.nio.charset.StandardCharsets;
import java.util.*;

// BEGIN
class App {

    /** Метод проверяет, можно ли из букв в <b>letterSequence</b> составить <b>word</b>.
     *
     * @param letterSequence Набор букв для составления <b>word</b>
     * @param word Проверяемое слово
     * @return Возвращает true, если <b>word</b> можно составить из <b>letterSequence</b>, иначе false
     */
    public static boolean scrabble(String letterSequence, String word) {
        if (word.equals("")) {
            return true;
        }

        int letterSequenceLength = letterSequence.length();
        int wordLength = word.length();

        if (letterSequenceLength < wordLength) {
            return false;
        }

        List<String> letters = new ArrayList<>(Arrays.asList(letterSequence.toLowerCase(Locale.ROOT).split("")));
        List<String> wordLetters= new ArrayList<>(Arrays.asList(word.toLowerCase(Locale.ROOT).split("")));

        for (String letter: letters) {
            wordLetters.remove(letter);

            if (wordLetters.isEmpty()) {
                return true;
            }
        }

        return false;
    }
}
//END
