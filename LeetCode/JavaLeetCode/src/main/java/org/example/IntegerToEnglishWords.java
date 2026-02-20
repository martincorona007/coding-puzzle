package org.example;

import java.util.ArrayList;

public class IntegerToEnglishWords {
    // MMC MMD MMU,CM DM UM, C D U
    String unitTeenWord [] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    String centWord [] = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    String suffix [] = {"","Thousand","Million","Billion"};

    public String numberToWords(int num) {
        String result = "";
        if( num == 0){
            result += "Zero";
        }
        ArrayList<Integer> groups = new ArrayList<>();


        while (num > 0) {
            int lastDigit = num % 1000; // Extract the last digit
            groups.add(lastDigit);
            num /= 1000;                // Remove the last digit
        }

        for(int i = groups.size() - 1 ; i >= 0 ; i--){

            if(groups.get(i) == 0){
                continue;//skip the group if zero
            }
            //System.out.print(numberToEnglishWords(groups.get(i))+" "+suffix[i]+" ");
            String groupOfWords = numberToEnglishWords(groups.get(i))+" "+suffix[i]+" ";
            result += groupOfWords;
        }


        return result.trim();
    }
    public String numberToEnglishWords(int number){


        String englishNumber = "";
        boolean enableUnit = true;
        int hundred = number / 100;
        int centsNumber = number % 100;
        int cent = centsNumber /10;
        int unit = centsNumber %10;
        // Hundred
        if(number > 99){
            englishNumber+=unitTeenWord[hundred] + " Hundred";
        }
        //Teens
        if(centsNumber >= 10 && centsNumber <= 19){
            enableUnit = false;
            englishNumber+=" "+unitTeenWord[centsNumber];
        }
        //Cents
        if(centsNumber >= 20){
            englishNumber += " "+centWord[cent];
        }
        //Units
        if(enableUnit == true){
            if(unit >= 1  && unit <=9){
                englishNumber += " "+unitTeenWord[unit];
            }
        }

        return englishNumber.trim();
    }
}
