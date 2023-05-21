public class SumArray {

  public static double sum(double[] numbers) {
   double totalSum = 0;
    for(int i = 0; i < numbers.length; i++){
      totalSum +=numbers[i]; 
    }
   return (totalSum == 0)? 0 : totalSum;
  }
}