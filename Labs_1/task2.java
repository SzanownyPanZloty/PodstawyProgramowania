package Labs_1;

public class task2 {
  public static void main(String[] args) {
    int[] numbersArray = {3,4,5,54,234,77};
    double sum = 0;
    for (int i = 0; i < numbersArray.length; i++) {
      sum+=numbersArray[i];
    }
    System.out.println("average: " + sum/numbersArray.length);
  }
}
