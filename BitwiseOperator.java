
package JavaAssignment;

import java.util.Scanner;


public class BitwiseOperator {
public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);
int a,b,c;
System.out.println("Enter 1st value: ");
a= input.nextInt();
     
System.out.println("Enter 2nd value: ");
b= input.nextInt();
     
c=a&b;// i love you babe
System.out.println("a&b=  "+c);

c=a|b;
System.out.println("a|b=  "+c);

c=a^b;
System.out.println("a^b= "+c);
    
c=a>>b;
System.out.println("a>>b= "+c);
    
c=a<<b;
System.out.println("a<<b= "+c);
}
    
}
