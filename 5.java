import java.util.Scanner;
class Five{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a,b,c,d,e;
int small,large;
System.out.println("Enter 5 integers separated by spaces");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();
small=a;
if(b<small){
small=b;
}
if(c<small){
small=c;
}
if(d<small){
small=d;
}
if(e<small){
small=e;
}
large=a;
if(b>large){
large=b;
}
if(c>large){
large=c;
}
if(d>large){
large=d;
}
if(e>large){
large=e;
}
System.out.println("smallest= "+small);
System.out.println("largest= "+large);
}
}



