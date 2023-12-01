class Solution {
    public int longestPalindrome(String s) {
        int[] alphabets = new int[58];
        boolean odd = false;
        char[] stringArray = s.toCharArray();
        int length = 0;

        for (char c : stringArray) {
            alphabets[c - 'A']++;
        }

        for (int i : alphabets) {
            if (i == 0) continue;

            if(i % 2 == 1) {
                if(!odd) {
                    length += i;
                    odd = true;
                } else {

                    length += i - 1;
                }

            } else {
                length += i;
            }
        }

        return length;
    }
}
