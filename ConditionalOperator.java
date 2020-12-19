
package JavaAssignment;

import java.util.Scanner;

public class ConditionalOperator {
    
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
 
float number1, number2, largenumber;

System.out.println("Enter number:  ");

number1=input.nextFloat();

number2=input.nextFloat();

largenumber = (number1>number2) ? number1 : number2 ;
System.out.println("Large Number is: "+largenumber);
}
}
