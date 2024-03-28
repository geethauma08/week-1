/*import java.util.*;
class Four{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,r,sum=0,temp;
System.out.println("Enter the number");
n=sc.nextInt();
temp=n;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
System.out.println("palindrome number");
else
System.out.println("not a palindrome");
}
}
*/


import java.util.Scanner;
class four{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n,r,sum=0,temp;
System.out.println("Enter a number");
n=sc.nextInt();
temp=n;
while(n>0){
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum){
System.out.println("It is a palindrome number");
}
else{
System.out.println("Not a palindrome number");
}
}
}




