package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
class App {
    public static <K extends String, V extends String> List<Map<K, V>> findWhere(List<Map<K, V>> books, Map<K, V> query) {
        List<Map<K, V>> result = new ArrayList<>();
        Set<Entry<K, V>> queryEntrySet = query.entrySet();

        for (Map<K, V> book : books) {
            Set<Map.Entry<K, V>> bookEntrySet = book.entrySet();

            if (bookEntrySet.containsAll(queryEntrySet)) {
                result.add(book);
            }
        }

        return result;
    }
}
//END
