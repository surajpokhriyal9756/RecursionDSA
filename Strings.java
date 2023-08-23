public class Strings {
    public static void skip(String ans, String str) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if (ch == 'a') {
            skip(ans, str.substring(1));
        } else {
            skip(ans + ch, str.substring(1));
        }
    }

    public static String skip2(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.charAt(0) == 'a') {
            return skip2(str.substring(1));
        } else {
            return str.charAt(0) + skip2(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "baccach";
        // skip("", str);
        String ans = skip2(str);
        System.out.println(ans);
    }
}
