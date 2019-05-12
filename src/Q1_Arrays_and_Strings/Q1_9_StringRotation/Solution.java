public class Solution {
    public static boolean isStringRotation(String a, String b) {
        if (a.length() != b.length() || a.length == 0) {
            return false;
        }

        String newStr = a + a;

        return isSubstring(newStr, b);
    }

    public static void main(String[] args) {
        String a = "bottlewater";
        String b = "erbottlewat";
        System.out.println(isStringRotation(a, b));
    }
}

