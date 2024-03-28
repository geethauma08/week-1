import java.util.Scanner;
class Three{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Choose your operation");
System.out.println("1 for Addition");
System.out.println("2 for Subtraction");
System.out.println("3 for Multiplication");
System.out.println("4 for division");

int choice,a,b;
choice=sc.nextInt();
System.out.println("Enter a value");
a=sc.nextInt();
System.out.println("Enter b value");
b=sc.nextInt();
switch(choice){
case 1:System.out.println("Result= "+(a+b));
       break;
case 2:System.out.println("Result= "+(a-b));
       break;
case 3:System.out.println("Result= "+(a*b));
break;
case 4:System.out.println("Result= "+(a/b));
break;
default:System.out.println("Invalid choice");
        break;
        }
        }
        }
