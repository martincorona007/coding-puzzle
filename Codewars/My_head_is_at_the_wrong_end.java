public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    
      String temp = arr[0];
      arr[0] = arr[arr.length - 1];
      arr[arr.length - 1] = temp;
    return arr;
  }
}