package edu.cnm.deepdive;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromesTest {

  @Test
  public void isPalindrome() {
    String s = "A man, a plan, a canal - Panama!";
    assertTrue(Palindromes.isPalindrome(s));
    assertTrue(Palindromes.isPalindrome("Dammit I'm Mad!"));
    assertTrue(Palindromes.isPalindrome("Madam I'm Adam"));
    assertFalse(Palindromes.isPalindrome("Blah blah blah"));
  }




}