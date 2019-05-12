public class Solution {
    public static String compression(String s) {
        StringBuilder compressed = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;

            if (i+1 >= s.length() || s.charAt(i+1) != s.charAt(i)) {
                compressed.append(s.charAt(i));
                compressed.append(count);
                count = 0;
            }
        }

        return compressed.length() < s.length() ? compressed.toString() : s;
    }

    public static void main(String[] args) {
        String test = "aaabbbc";
        System.out.println(compression(test));
    }
}
// Time O(n)
// Space O(n)

