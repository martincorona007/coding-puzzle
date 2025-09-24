public class Sum_of_positive {
      public static int sum(int[] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i ++){
      if(arr[i] >= 1){
        sum+=arr[i];
      }
    }
    return sum;
  }

}
