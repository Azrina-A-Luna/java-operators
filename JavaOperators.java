
package JavaAssignment;

import java.util.Scanner;

public class JavaOperators {
    
public static void main(String[] args) {
        
int number1, number2, result;
          
Scanner input =new Scanner(System.in);
        
System.out.println("Enter first value: ");
number1=input.nextInt();
        
System.out.println("Enter 2nd value: ");
number2=input.nextInt();
         
result=number1+number2;
System.out.println("summation of the values: "+result);
        
result=number1-number2;
System.out.println("subtraction od the values: "+result);
          
result=number1*number2;
System.out.println("miltiplication of the values: "+result);
        
result=number1/number2;
System.out.println("divition of the values: "+result);
         
}
}

