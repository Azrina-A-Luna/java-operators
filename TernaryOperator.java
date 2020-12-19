
package JavaAssignment;

import java.util.Scanner;

public class TernaryOperator {
   
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int a, b, min;
        
System.out.println("Enter 1st integer number: ");
a= input.nextInt(); 
        
System.out.println("Enter 2nd integer number: ");
b= input.nextInt();
        
min=(a<b) ? a:b;
System.out.println("Minimum number is= "+min);
       
}
    
}
