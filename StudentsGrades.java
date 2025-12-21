import java.util.Scanner;
public class StudentsGrades{
    public static void main(String... args){
    Scanner input = new Scanner(System.in);
     System.out.println("Choose options to see students names ");
    int num1 = input.nextInt();
    String name = """
               1.Student's name
                """;
  System.out.println(name);
    System.out.println("Choose options to see students ");
  int studentName = input.nextInt();

switch(studentName){
            case 1-> {
                    String names = """
                    1: Student one
                    2: Student two
                    3: Student three
                    4: Student four
                    5: Student five
                    6: Studet six
                     """;


System.out.println(names);
 System.out.println("Choose options to see students grades");
 int grades = input.nextInt();

switch(grades){
           case 1-> System.out.println("'A'");
            case 2-> System.out.println("'B'");
            case 3-> System.out.println("'C'");
            case 4-> System.out.println("'D'");
            case 5-> System.out.println("'E'");
            case 6-> System.out.println("'F'");
}
}
}


}







  }

    







