package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    private static final String[] FREE_MAILS = {
            "@gmail.com",
            "@yandex.ru",
            "hotmail.com"
    };

    public static long getCountOfFreeEmails(List<String> emails) {
        return emails.stream()
                .filter(App::isFree)
                .count();
    }

    private static boolean isFree(String email) {
        return Arrays.stream(FREE_MAILS).
                anyMatch(email::contains);
    }
}
// END
