package Labs_2;

public class task4 {
  public static void main(String[] args) {
    System.out.println(countSum(50));
  }
  public static int countSum(int number) {
    if (number <= 1) return 1;
    return number + countSum(number - 1);
}
}
