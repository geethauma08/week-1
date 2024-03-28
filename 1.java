import java.util.Scanner;
class One{
public static void main(String[] args){
double r1,r2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a,b,c values");
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double d=(b*b)-4*a*c;
if(d==0){
System.out.println("The root are real and equal");
r1=-b/(2*a);
r2=-b/(2*a);
System.out.println("The roots are: ");
System.out.println( "r1= "+r1);
System.out.println("r2= "+r2);
}
else if(d>0){
r1=-b+(Math.sqrt(d))/2*a;
r2=-b-(Math.sqrt(d))/2*a;
System.out.println("The roots are: ");
System.out.println("r1= "+r1);
System.out.println("r2= "+r2);
}
else{
double x=-b/(2*a);
double y=(Math.sqrt(-d))/2*a;
System.out.println("The roots are: ");
System.out.println("r1="+x+"+i"+y);
System.out.println("r2= "+x+"+i"+y);
}
}
}


