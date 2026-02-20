package org.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> s1 = new HashMap<>();
        Map<Character,Integer> t1 = new HashMap<>();

        for(int i = 0; i < s.length();i++){
            if(s1.containsKey(s.charAt(i))){
                s1.put(s.charAt(i),s1.get(s.charAt(i))+1);
            }else{
                s1.put(s.charAt(i),1);
            }
        }
        for(int i = 0; i < t.length();i++){
            if(t1.containsKey(t.charAt(i))){
                t1.put(t.charAt(i),t1.get(t.charAt(i))+1);
            }else{
                t1.put(t.charAt(i),1);
            }
        }

        return s1.equals(t1);
    }
//    public boolean isAnagram(String s, String t) {
//        HashMap<Character,Integer> box = new HashMap<>();
//
//        for(int i = 0; i <= s.length() - 1; i++){
//            if(box.containsKey(s.charAt(i))){
//                box.put(s.charAt(i),box.get(s.charAt(i))+1);
//            }else{
//                box.put(s.charAt(i),1);
//            }
//        }
//        for(int x = 0; x <= t.length() - 1; x++){
//            if(box.containsKey(t.charAt(x))){
//                box.put(t.charAt(x),box.get(t.charAt(x))-1);
//            }else{
//                return false;
//            }
//        }
//        Collection<Integer> countWord = box.values();
//        Iterator<Integer> iterator = countWord.iterator();
//        while(iterator.hasNext()){
//            Integer score = iterator.next();
//            if(score == 0){
//
//            }else{
//                return false;
//            }
//        }
//        return true;
//    }
}