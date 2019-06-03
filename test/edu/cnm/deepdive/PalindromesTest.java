package edu.cnm.deepdive;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromesTest {

  @Test
  public void isPalindrome() {

    assertTrue(Palindromes.isPalindrome("A man, a plan, a canal - Panama!"));
    assertTrue(Palindromes.isPalindrome("Dammit I'm Mad!"));
    assertTrue(Palindromes.isPalindrome("Madam I'm Adam"));
    assertFalse(Palindromes.isPalindrome("Blah blah blah"));
    assertTrue(Palindromes.isPalindrome("radar"));
    assertFalse(Palindromes.isPalindrome("away"));
    assertTrue(Palindromes.isPalindrome("racecar"));
    assertTrue(Palindromes.isPalindrome("eeeee"));
    assertTrue(Palindromes.isPalindrome("a"));
    assertFalse(Palindromes.isPalindrome("hi"));
    assertTrue(Palindromes.isPalindrome("eve"));
    assertFalse(Palindromes.isPalindrome("eve is eve"));
    assertTrue(Palindromes.isPalindrome(""));
    assertFalse(Palindromes.isPalindrome("1234"));
    assertTrue(Palindromes.isPalindrome("deified"));
    assertTrue(Palindromes.isPalindrome("92139455493129"));
    assertFalse(Palindromes.isPalindrome("9070120709"));

  }




}