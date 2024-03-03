package Labs_2;
import java.util.*;

public class task2 {
  public static void main(String[] args) {
    System.out.println(findPrimeNumbersWithinRange(1,50));
  }
  public static List<Integer> findPrimeNumbersWithinRange(int rangeStart, int rangeEnd) {
    List<Integer> primeNumbersFound = new ArrayList<Integer>();
    for(int i = rangeStart; i < rangeEnd; i++) {
      if (isPrimeNumber(i)) {
        primeNumbersFound.add(i);
      }
    }
    return primeNumbersFound;
  }
  public static boolean isPrimeNumber(int number) {
    if (number <= 1) return false;
    for(int i = 2; i < number; i++) {
      if (number % i == 0 ) return false; 
    }
    return true;
  }
}
