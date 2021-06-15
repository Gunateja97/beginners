import java.util.Scanner;
class Vote {
public static void main(String args[]) {
int age;
String s;
Scanner a = new Scanner(System.in);
Scanner b = new Scanner(System.in);
System.out.println("Enter age of the candidate:");
age = a.nextInt();
if (age >= 18) 
 {
    System.out.println("enter candidate citizenship:");
    s = b.nextLine();
           if (s.equals("indian"))
            {
                System.out.println("candidate is eligible to vote!");

          }
                else
                System.out.println("Candidate is not eligible to vote!");
  }
            else
            System.out.println("Candidate is not eligible to vote!");

    }
}