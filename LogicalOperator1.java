
package JavaAssignment;

import java.util.Scanner;


public class LogicalOperator1 {
public static void main(String[] args) {
        
Scanner input = new Scanner (System.in);
System.out.print("Enter a letter :");
char ch = input.next().charAt(0);
        
if (ch == 'a' || ch =='A' || ch == 'e' || ch =='E' || ch == 'i' || ch =='I' || ch == 'o' || ch =='O'|| ch == 'u' || ch =='U')
{
System.out.println("Vowel");
}
else{
System.out.println("Consonant");
}
}
        
}
 
    
    

