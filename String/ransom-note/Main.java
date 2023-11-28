class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabets = new int[26];
        char[] ransomNoteArr = ransomNote.toCharArray();
        char[] magazineArr = magazine.toCharArray();

        for(char ch : magazineArr) {
            alphabets[ch - 'a'] = alphabets[ch - 'a'] + 1;
        }

        for(char ch : ransomNoteArr) {
            alphabets[ch - 'a'] = alphabets[ch - 'a'] - 1;
        }

        for(int i : alphabets) {
            if (i < 0) return false;
        }

        return true;
    }
}