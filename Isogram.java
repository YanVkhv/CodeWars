import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Isogram {
    public static boolean  isIsogram(String str) {
        List<String> charList = Arrays.asList(str.toLowerCase().split(""));
        Set<String> set = new HashSet<>();

        for (String c: charList){
            if (!set.add(c))
                return false;
        }

        return true;
    }
}