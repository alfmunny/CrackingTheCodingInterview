package Q1_Arrays_and_Strings.Q1_5_OneAway;
//check if two strings are one edit away

public class Solution {

    public static boolean oneEditAway(String s, String t) {
        String ls = s; //the long string
        String ss = t; // the short string

        if (s.length() < t.length()) {
            ls = t;
            ss = s;
        }

        int count = 0;
        int j = 0;

        for (int i = 0; i < ls.length(); i++) {
            if (j >= ss.length() || ls.charAt(i) != ss.charAt(j)) {
                count++;
                if (ls.length() == ss.length()) j++; // for case "replace"
            }
            else j++; // for case "insert" and "delete", because of different length

            if (count > 1) return false;
        }

        return true;

    }

    public static void main(String[] args) {
        String[] one = { "pale", "ple"};
        String[] two = {"pales", "pale"};
        String[] three = {"pale", "bale"};
        String[] four = {"pale", "bae"};
       
        System.out.println(oneEditAway(one[0], one[1]));
        System.out.println(oneEditAway(two[0], two[1]));
        System.out.println(oneEditAway(three[0], three[1]));
        System.out.println(oneEditAway(four[0], four[1]));

    }
}
