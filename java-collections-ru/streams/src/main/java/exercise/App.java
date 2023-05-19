package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        return emails.stream()
                .filter(App::isFree)
                .count();
    }

    private static boolean isFree(String email) {
        String[] freeEmails = {
                "@gmail.com",
                "@yandex.ru",
                "hotmail.com"
        };

        return Arrays.stream(freeEmails).
                anyMatch(email::contains);
    }
}
// END
