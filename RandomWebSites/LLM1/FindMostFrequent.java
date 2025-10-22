import java.util.HashMap;
import java.util.Map;
// Write a method that counts the frequency of each character in a string and returns the character that appears most frequently.å
public class FindMostFrequent {
    
    public char findMostFrequent(String s){
        HashMap<Character,Integer> word = new HashMap<>();

        for(int wordIndex = 0; wordIndex < s.length(); wordIndex++){
            if(word.containsKey(s.charAt(wordIndex))){
                word.put(s.charAt(wordIndex),word.get(s.charAt(wordIndex))+1);
 //               word.put(s.charAt(wordIndex),word.getOrDefault(s.charAt(wordIndex),1)+1);
            }else{
                word.put(s.charAt(wordIndex),1);
            }
        }

        int maxCount = 0;
        char frequentWord = 0;
        for(Map.Entry<Character,Integer> wordsRepated: word.entrySet()){
            if(wordsRepated.getValue()>=maxCount){
                frequentWord = wordsRepated.getKey();
                maxCount = wordsRepated.getValue();
            }
        }
        return frequentWord;
    }
    public static void main(String[] args) {
        FindMostFrequent instance = new FindMostFrequent();
        System.out.println("Test 1 EXPECTED l ACTUAL "+instance.findMostFrequent("hello"));
        System.out.println("Test 2 EXPECTED g ACTUAL "+instance.findMostFrequent("language"));
    }
}
