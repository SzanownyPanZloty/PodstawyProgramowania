package Labs_2;

public class task3 {
  public static void main(String[] args) {
    int[] numbersArray = {4,56,6,34,2,4,4,543,6};
    System.out.println(countNumberOccurrencesInArray(4,numbersArray));
  }
  public static int countNumberOccurrencesInArray(int numberToFind, int[] numbersArray) {
    int occurrences = 0;
    for (int number: numbersArray) {
      if (number == numberToFind) occurrences += 1;
    }
    return occurrences;
  }
}
