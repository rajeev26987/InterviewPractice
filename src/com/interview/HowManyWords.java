package com.interview;

/*
count number of words in a sentence ignoring ".", ",", "!", "?" & numbers.
Besides "te[r" is also not a valid word as it contains special character.
Example:
input: "jds dsaf lkdf kdsa fkldsf, adsbf ldka ads? asd bfdal ds bf[l. akf dhj ds 878  dwa WE DE 7475 dsfh ds  RAMU 748 dj."
output: 21
 */
public class HowManyWords {
    public static void main(String[] args) {

    }

    static int countWords(String str){
        String validWordRegex = "([a-zA-Z]*)$";
        String[] arr = str.split(" ");
        int count = 0;
        for (String s:arr){

        }
        return 1;
    }
}
