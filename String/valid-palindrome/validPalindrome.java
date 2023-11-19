class Solution {
    public boolean isPalindrome(String s) {
        if (s == "")
            return false;

        String givenString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverseString = "";

        for (int i = 0; i < givenString.length(); i++) {
            reverseString = givenString.charAt(i) + reverseString;
        }
        return givenString.equals(reverseString);
    }
}

public class validPalindrome {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(" "));
    }
}