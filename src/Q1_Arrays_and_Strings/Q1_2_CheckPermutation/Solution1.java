package Q1_Arrays_and_Strings.Q1_2_CheckPermutation;

// sort the two string

public class Solution1 {
    public static String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public static boolean checkPermutation(String s, String t) {
        if(s.length() != t.length()) return false;
        return sort(s).equals(sort(t));
    }

    public static void main(String[] args) {
       String s = "aaabbb";
       String t = "bbaaa";

       System.out.println("Are second string a permutation of first string: " + checkPermutation(s, t));

    }
}
