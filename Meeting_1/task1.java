public class task1 {
  public static void main(String[] args) {
    double firstNumber = 5;
    double secondNumber = 2;
    System.out.println(
      new StringBuilder()
        .append("addition: ")
        .append(firstNumber + secondNumber)
        .append("\nsubstract: ")
        .append(firstNumber - secondNumber)
        .append("\nmultiply: ")
        .append(firstNumber * secondNumber)
        .append("\ndevide: ")
        .append(firstNumber / secondNumber)
    );
  }
}
