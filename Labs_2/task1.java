package Labs_2;

public class task1 {
  public static void main(String[] args) {
    int[] numbersArray = {5,34,6,3,4,3,6,3};
    System.out.println(findIndexInArray(4,numbersArray));
  }
  public static int findIndexInArray(int numberToFind, int[] numbersArray) {
    int hitIndex = -1;
    for (int i = 0; i < numbersArray.length; i++) {
      if (numbersArray[i] == numberToFind) {
        hitIndex = i;
        break;
      }
    }
    return hitIndex;
  }
}
