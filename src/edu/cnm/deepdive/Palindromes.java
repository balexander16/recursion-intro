package edu.cnm.deepdive;

public class Palindromes {

  public static boolean isPalindrome(String s){

    s = lowerCaseString(s);
    s = removeSpecialCharacters(s);


     return s.length() <= 1
     || (
     s.charAt(0) == s.charAt(s.length() -1)
     && isPalindrome(s.substring(1,s.length()-1)
     )
    );

//    char[] chars = s.toCharArray();
//    for(int i = 0, j = chars.length -1; i < j; i++, j--){
//      if(chars[i] != chars[j]){
//        return false;
//      }
//    }
//    return true;

  }


  // public method1 that will remove special characters
      // use regex? what can I use, methods of the string class that uses simple method operation to
      // replace characters

  public static String removeSpecialCharacters(String s){
    s = s.replaceAll("[\\W_]+" , "");
    return s;
  }



  // call toLowerCase();
  public static String lowerCaseString(String s){
    s = s.toLowerCase();
    return s;

    // return s.toLowerCase();
  }





}
