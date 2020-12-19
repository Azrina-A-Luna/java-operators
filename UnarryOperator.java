
package JavaAssignment;

import java.util.Scanner;

public class UnarryOperator {

public static void main(String[] args) {
        
Scanner input= new Scanner(System.in);
        
int x, result;
        
System.out.println("enter a value: ");
         
x=input.nextInt();
         
result = +x;
System.out.println("Result = "+result);
         
result = -x;
System.out.println("Result = "+result);
         
result = ++x;
System.out.println("Result = "+result);
        
result = x++;
System.out.println("Result = "+result);
        
result = --x;
System.out.println("Result = "+result);
        
result = x--;
System.out.println("Result = "+result);
                
}
    
}
