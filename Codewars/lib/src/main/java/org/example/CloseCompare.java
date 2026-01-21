package org.example;

public class CloseCompare {

    public  int closeCompare(double a, double b) {
        if(a < b){
            return -1;
        }else if(a > b){
            return 1;
        }
        return 0;
    }

    public  int closeCompare(double a, double b, double margin) {

        double distance = Math.abs(a - b);
        if(margin >= distance){
            return 0;
        }else{
            if(a < b){
                return -1;
            }else if(a > b){
                return 1;
            }
        }
        return 0;
    }
}
