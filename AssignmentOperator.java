
package JavaAssignment;

import java.util.Scanner;

public class AssignmentOperator {
    
public static void main(String[] args) {
        
float a, b;
        
Scanner input = new Scanner(System.in);
        
System.out.print("Enter the value of 'A' :");
a = input.nextFloat();
        
         
System.out.print("Enter the value of 'B' :");
b = input.nextFloat();
       
a+=b; //a = 10 , b =5 , a+=b > a=15 , b =5
System.out.println("A + B = "+a);
       
a-=b; //a = 10 , b =5 , a-=b > a=10 ,
System.out.println("A - B = "+a);
       
a*=b; //a = 10 , b =5 , a*=b > a=50 , b =5
System.out.println("A * B = "+a);
       
a/=b; //a = 10 , b =5 , a/=b > a=10 , b =5
System.out.println("A / B = "+a);
       
}
 
}
