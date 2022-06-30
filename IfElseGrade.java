public class IfElseGrade {
  public static void main (String[] args) {
  
    System.out.print("Enter grade: ");
    String letterGrade;
    int grade = scanner.nextInt();

    if (grade > 90) {
      letterGrade = "A";
    } else if (grade > 80) {
      letterGrade = "B";
    } else if (grade > 70) {
      letterGrade = "C";
    } else if (grade > 65) {
      letterGrade = "D";
    } else {
      letterGrade = "F";
    }

    System.out.println("The grade is: " + letterGrade);

  }

}
