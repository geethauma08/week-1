/*import java.util.Scanner;
class Six{
public static void main(String[] args){
int n,temp,i=2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
n=sc.nextInt();
temp=n;
System.out.println("Prime factor of a number:");
while(temp>1){
if(temp%i==0){
System.out.println(i);
temp=temp/i;
}
else{
i++;
}
}
}
}*/
import java.util.Scanner;
class six{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n,temp,i=2;
System.out.println("Enter a number");
n=sc.nextInt();
temp=n;
System.out.println("prime factors of a number");
while(temp>1){
if(temp%i==0){
System.out.println(i);
temp=temp/i;
}
else{
i++;
}
}
}
}
