class Solution {
    public boolean isVowel(char c) {
            return "AEIOUaeiou".indexOf(c) != -1;
        }

    public String reverseVowels(String s) {
        ArrayList<Integer> indexVowels = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                indexVowels.add(i);
            }
        }
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < indexVowels.size()/2; i++){
            // change first vowel with second vowel
            str.setCharAt(indexVowels.get(i), s.charAt(indexVowels.get(indexVowels.size() - 1 - i)));
            // change second vowel with first vowel
            str.setCharAt(indexVowels.get(indexVowels.size() - 1 - i), s.charAt(indexVowels.get(i)));
        }
        return str.toString();
    }
}
