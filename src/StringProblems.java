public class StringProblems {
    public static void main(String[] args) {
        System.out.println(abcTest("hasdnfi.abc"));
        System.out.println(abcTest("aabc"));
        System.out.println(abcTest(".abc123abc"));

        System.out.println(alternateStrings("abc", "xyz"));
        System.out.println(alternateStrings("xxxx", "Thereee"));

    }

    public static String alternateStrings(String s1, String s2) {
        String output = "";
        int index = 0;
        while (index < s1.length() || index < s2.length()) {
            if (index < s1.length()) {
                output += s1.substring(index, index + 1);
            }
            if (index < s2.length()) {
                output += s2.substring(index, index + 1);
            }
            index++;
        }

        return output;
    }

    public static boolean abcTest(String s) {
        int i = 0;
        while (i < s.length()) {
            int loc = s.indexOf("abc", i);
            if (loc == -1) {
                return false;
            }
            if (loc == 0 || !s.substring(loc - 1, loc).equals(".")) {
                return true;
            }
            i = loc + 3;
        }
        return false;
    }

}
