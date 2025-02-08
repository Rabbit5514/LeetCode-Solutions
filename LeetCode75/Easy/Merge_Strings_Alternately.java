class Solution {
    public String mergeAlternately(String word1, String word2) {
        String shorterWord;
        String longerWord;
        int shortestWordCnt;
        String mergedWord = "";
        char[] word;

        if (word1.length() <= word2.length()) {
            shorterWord = word1;
            longerWord = word2;
        }
        else {
            shorterWord = word2;
            longerWord = word1;
        }

        word = new char[2 * shorterWord.length() + (longerWord.length() - shorterWord.length())];

        for (int i = 0; i < shorterWord.length(); i++) {
            word[2*i] = word1.charAt(i);
            word[2*i+1] = word2.charAt(i);
        }

        // Shorter version using better variable names
        for (int i = 0; i < longerWord.length() - shorterWord.length(); i++) {
            word[i+2*shorterWord.length()] = longerWord.charAt(shorterWord.length()+i);
        }


        return String.valueOf(word);
    }
}
