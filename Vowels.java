import java.util.List;
import java.util.stream.Collectors;

public class Vowels {

    public static int getCount(String str) {
        List<Character> chars = str
                .chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());

        return (int) chars.stream()
                .filter(c -> c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i')
                .count();

    }

}