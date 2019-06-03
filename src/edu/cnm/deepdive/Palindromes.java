package edu.cnm.deepdive;

public class Palindromes {

  public static boolean isPalindrome(String s){
   // TODO strip out punctuation, spaces, convert result to lower case, and compute and return a
   // result indicating whether resulting string is a palindrome. Use any necessary helper
   // methods.
    s = lowerCaseString(s);
    s = removeSpecialCharacters(s);

    char[] chars = s.toCharArray();
    for(int i = 0, j = chars.length -1; i < j; i++, j--){
      if(chars[i] != chars[j]){
        return false;
      }
    }
    return true;

  }


  // public method1 that will remove special characters
      // use regex? what can I use, methods of the string class that uses simple method operation to
      // replace characters

  public static String removeSpecialCharacters(String s){
    s = s.replaceAll("[\\W]+" , "");
    return s;
  }



  // call toLowerCase();
  public static String lowerCaseString(String s){
    s = "" + s.toLowerCase();
    return s;

    // return s.toLowerCase();
  }





}
