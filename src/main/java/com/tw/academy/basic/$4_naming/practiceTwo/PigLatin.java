package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {

    public static final String SPACE_SEPATATOR = " ";
    public static final String WORD_SUFFIX = "ay";
    public static final String WORD_SEPATATOR = " ";

    public static String pigIt(String sentence) {
        String[] punctuationMarks={".",",","-",":",";","!","?"};
        String[] words = sentence.split(SPACE_SEPATATOR);
        char firstLetter;
        boolean isWord = true;

        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < punctuationMarks.length; j++)
                if(words[i].contains(punctuationMarks[j]))
                    isWord = false;

            if (isWord){
                firstLetter = words[i].charAt(0);
                words[i] = words[i].substring(1);
                words[i] = words[i].replace(words[i], words[i] + firstLetter + WORD_SUFFIX);
            }
            isWord = true;
        }

        return String.join(WORD_SEPATATOR, words);
    }
}
