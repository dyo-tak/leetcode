import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        
        if (s1.length != s2.length) return false;
        
        Arrays.sort(s1);
        Arrays.sort(s2);

        for (int i = 0; i < s2.length; i++) {
            if(s1[i] != s2[i]) return false;
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "rat", t = "car";
        System.out.println(sol.isAnagram(s, t));
    }
}