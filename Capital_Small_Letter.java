
package JavaAssignment;

import java.util.Scanner;

public class Capital_Small_Letter {
    
public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);
char x;
System.out.println("Enter a letter: ");
x=input.next().charAt(0);

if(x>='A' && x<='Z'){

System.out.println("Capital Letter");
}

else if(x>='a' && x<='z'){
System.out.println("Small Letter");
}

else{
    
System.out.println("Error");
}
    
}
}
