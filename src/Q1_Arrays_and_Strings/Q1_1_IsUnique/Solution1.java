package Q1_Arrays_and_Strings.Q1_1_IsUnique;

// If the string contains only ASCII characters

public class Solution1 {
    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;
        boolean[] hash = new boolean[128];

        for ( int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (hash[val]) return false;
            hash[val] = true;
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
