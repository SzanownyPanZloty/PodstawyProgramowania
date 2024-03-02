public class task3 {
  public static void main(String[] args) {
    int oddNumber = 1;
    int evenNumber = 2;
    System.out.println(
      new StringBuilder()
        .append(isEvenOrOdd(oddNumber))
        .append('\n')
        .append(isEvenOrOdd(evenNumber))
    );
  }
  public static String isEvenOrOdd(int number) {
    if (number % 2 == 0) {
      return "Number: " + number + " is even";
    } else {
      return "Number: " + number + " is odd";
    }
  }
}
