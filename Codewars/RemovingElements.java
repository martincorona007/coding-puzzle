public class RemovingElements {
  
  public static Object[] removeEveryOther(Object[] arr) {
    
    Object[] newObject = new Object[arr.length / 2 + arr.length % 2];
    
    int j = 0;
    for(int i = 0; i < arr.length;i++){
      if(i % 2 == 0 ){
        newObject[j] = arr[i];
        j++;
      }
        
      
    }
    
    return newObject;
  }

}
