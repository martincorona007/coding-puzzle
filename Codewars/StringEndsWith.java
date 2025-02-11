
  public static boolean solution(String str, String ending) {
    if(ending.isEmpty()) return true;
    if(ending.length() > str.length()) return false;
    for(int i = str.length() - ending.length(),j = 0; i < str.length();i++,j++){
      if(str.charAt(i) != ending.charAt(j)){
        return false;
      }
    }
    return true;
  }


