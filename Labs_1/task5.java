package Labs_1;

public class task5 {
  public static void main(String[] args) {
    int[] gradeArray = {3,4,5,3};
    double sum = 0;
    for (int i = 0; i<gradeArray.length; i++) {
      sum+=gradeArray[i];
    }
    double gradeAverage = sum/gradeArray.length;
    if (gradeAverage >= 4.75) {
        System.out.println("A+");
    } else if (gradeAverage >= 4.5) {
        System.out.println("A");
    } else if (gradeAverage >= 4.0) {
        System.out.println("A-");
    } else if (gradeAverage >= 3.5) {
        System.out.println("B+");
    } else if (gradeAverage >= 3.0) {
        System.out.println("B");
    } else if (gradeAverage >= 2.5) {
        System.out.println("B-");
    } else if (gradeAverage >= 2.0) {
        System.out.println("C+");
    } else if (gradeAverage >= 1.5) {
        System.out.println("C");
    } else if (gradeAverage >= 1.0) {
        System.out.println("C-");
    } else {
        System.out.println("F");
    }
  }
}
