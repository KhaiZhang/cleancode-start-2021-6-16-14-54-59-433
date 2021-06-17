package com.tw.academy.basic.$4_naming.practiceOne;

public class MorseCodeDecoder {

    public static final String MORSE_CODE_WORD_SEPARATOR = "\\s{2,}";
    public static final String MORSE_CODE_SEPARATOR = " ";
    public static final String WORD_SPARATOR = " ";
    public static final String NULL_STR = "null";

    public static String decode(String morseCodeStr) {
        String[] morseCodeWords = morseCodeStr.split(MORSE_CODE_WORD_SEPARATOR);
        StringBuilder decodedMorseCode = new StringBuilder();
        for (String morseCodeWord : morseCodeWords) {
            String [] morseCodeChars = morseCodeWord.split(MORSE_CODE_SEPARATOR);
            for (String morseCodeChar: morseCodeChars) {
                decodedMorseCode.append(MorseCode.get(morseCodeChar));
            }
            decodedMorseCode.append(WORD_SPARATOR);
        }
        return decodedMorseCode.toString().replaceAll(NULL_STR, "").trim();
    }
}
