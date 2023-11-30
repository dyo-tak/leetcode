class Solution {
    public int longestPalindrome(String s) {
                
    }
    
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
