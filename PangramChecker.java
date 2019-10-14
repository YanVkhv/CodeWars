import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PangramChecker {
    public boolean check(String sentence){
        List<String> charList = Arrays.asList(sentence.toLowerCase().split(""));
        int uniqueLetters = (int) charList.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.matches("[abcdefghijklmnopqrstuvwxyz]");
                    }
                })
                .distinct()
                .count();
        return uniqueLetters == 26;
    }
}