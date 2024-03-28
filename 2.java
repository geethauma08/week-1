import java.util.Scanner;
//import java.lang.Math;
class Two{
public static void main(String[] args){
    double r1,r2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a b and c values");
    double a= sc.nextDouble();
    double b= sc.nextDouble();
    double c= sc.nextDouble();
     double d =(b*b)-(4*a*c);
    if(d==0)
    {
        System.out.println("Real and Equal roots");  
        r1=-b/(2*a);
    	r2=-b/(2*a);      
        System.out.println("R1= " +r1);
        System.out.println("R2= " +r2);
    }
    else if(d>0)
    {
        System.out.println("Real and distinct roots");  
        r1=(-b+Math.sqrt(d))/(2*a);
    	r2=(-b-Math.sqrt(d))/(2*a);       
        System.out.println("R1= " +r1);
        System.out.println("R2= " +r2);
    }
    else
    {
        System.out.println("Imaginary roots");    
        double x=-b/(2*a);
        double y=Math.sqrt(-d)/2*a;
    	
        System.out.println("R1= " +x + "+i" + y);
        System.out.println("R2= " +x + "-i" + y);
    }
    }
}
    
