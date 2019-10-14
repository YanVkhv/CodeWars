import java.util.StringJoiner;

public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("abcd"));
    }

    public static String accum(String s) {

       StringJoiner sj = new StringJoiner("-", "", "");
        for (int i = 0; i < s.length(); i++) {
            sj.add(String.valueOf(s.charAt(i)).toUpperCase());
            for (int x = i; x < s.length()-1; x++) {
                sj.add(String.valueOf(s.charAt(i)).toLowerCase().repeat(i));
            }
        }
        return sj.toString();
    }
}
