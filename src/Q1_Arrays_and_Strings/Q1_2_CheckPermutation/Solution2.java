package Q1_Arrays_and_Strings.Q1_2_CheckPermutation;

// assume we have only ASCII characters

public class Solution2 {
    public static boolean checkPermutation(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] checker = new int[128];

        for (int i = 0; i < s.length(); i++) {
            checker[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++) {
            checker[t.charAt(i)]--;
            if (t.charAt(i) < 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        String s = "aaabbb";
        String t = "bbbaaa";

        System.out.println("Is a permutation ? : " + checkPermutation(s, t));
    }
}
