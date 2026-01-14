package org.example;

public class SmashWords {
    public static String smash(String... words) {
        // TODO Write your code below this comment please
        String singleSentence = "";

        if(words.length == 1){
            singleSentence +=words[0];
        }else{
            for (int i = 0; i <= words.length - 1; i++) {
                if(i == 0){
                    singleSentence +=words[i];
                }else{
                    singleSentence += " "+words[i];
                }
            }
        }
        return singleSentence;
    }
}
