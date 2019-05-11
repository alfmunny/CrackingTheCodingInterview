package Q1_Arrays_and_Strings.Q1_1_IsUnique;

// reduce the space even smaller
// assume the characters only rang from a to z.

public class Solution2 {

    public static boolean isUniqueChars(String str) {
        int checker = 0;

        for ( int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if ( (checker & (1 << val)) > 0 ) return false;
            checker |= 1 << val;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = { "abcde", "hello", "apple", "kite", "padle" };
        System.out.println("Time: O(n) ~ O(1), because we only have 128 different characters");
        System.out.println("Space: O(1)");
        for (String word : words) {
            System.out.println( word + ": " + isUniqueChars(word));
        }
    }
}
