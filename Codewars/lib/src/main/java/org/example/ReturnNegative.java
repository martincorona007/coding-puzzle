package org.example;

public class ReturnNegative {
    public static int makeNegative(final int x) {
    int result = 0;
    if(x >= 1){
      result = x*-1;
    }else if(x < 0 ){
      result =  x;
    }else if(x == 0){
      result =  x;
    }
    return result;
    }
    // public static void main(String[] var0) {
    //     Return_Negative test = new Return_Negative();
    //     System.out.println(test.makeNegative(42));
    //     System.out.println(test.makeNegative(-5));
    //     System.out.println(test.makeNegative(0));
    //     System.out.println(test.makeNegative(-1));
        
    // }

}
