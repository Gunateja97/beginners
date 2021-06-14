import java.util.Scanner;

class Operations{
public static void main(String args[])
{
Scanner i=new Scanner(System.in);
System.out.println("Enter the First number:");
double num1=i.nextDouble();
System.out.println("Enter the second number:");
double num2=i.nextDouble();
System.out.println("Enter the operator:");
char o=i.next().charAt(0);
double result=0;
switch(o)
{
case '+':  result =num1 + num2;
           break;
case '-':  result=num1-num2;
           break;
case '*':  result =num1 * num2;
           break;
case '/':  result=num1/num2;
           break;
}
System.out.println("the operation is done!!!" );
System.out.println(""+num1 + o + num2+ "=" + result );

}
}
