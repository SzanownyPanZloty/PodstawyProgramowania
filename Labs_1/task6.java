package Labs_1;

public class task6 {
  public static void main(String[] args) {
    String word = "kajak";
    if (isPalindrome(word)) {
      System.out.println("Word: " + word + " is palindrome");
    } else {
      System.out.println("Word: " + word + " is not palindrome");
    }

  }
  public static boolean isPalindrome(String baseWord) {
    String reversedWord = new StringBuilder(baseWord)
      .reverse()
      .toString();
    return reversedWord.equals(baseWord) ? true : false;
  }
}
