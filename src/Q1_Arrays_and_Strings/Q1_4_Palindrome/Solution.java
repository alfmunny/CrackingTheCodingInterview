package Q1_Arrays_and_Strings.Q1_4_Palindrome;

// case insensitive skip non-letter characters
public class Solution {
    public static boolean isPalindromePermutation(String str) {
        int[] table = new int[26];
        int oddCount = 0;

        for (char c : str.toCharArray()) {
            if ( c < 'a' || c > 'z') continue;
            int val = c - 'a';
            table[val]++;
            if(table[val] % 2 == 1) oddCount++;
            else oddCount--;
        }
        return oddCount <= 1;
    }
    
    public static void main(String[] args) {
        String s = "aaabbbbcccc";
        System.out.println("The string is palindrome permutation ? : " + isPalindromePermutation(s));
    }
       
}
