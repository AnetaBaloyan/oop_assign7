package assign7;
import java.util.*;

public class Driver {
    
    public static void main(String[] args) {
        
        Scanner U = new Scanner(System.in); 
        
        System.out.print("Please eneter the numerator denominator of the first number: ");
        Fraction x = new Fraction(U.nextInt(), U.nextInt());
        System.out.print("Please eneter the numerator denominator of the second number: ");
        Fraction y = new Fraction(U.nextInt(), U.nextInt());
        
        System.out.println("Please eneter the operation you want to do. \nUse 1 - summation"
                + "\n2 - subtraction\n3 - multiplication\n4 - division\n");
        int input = U.nextInt();
        
        
        switch(input) {
        
            case 1:
                System.out.println(x.sum(y).simple().toString());
                break;
            case 2:
                System.out.println(x.sub(y).simple().toString());
                break;
            case 3:
                System.out.println(x.mul(y).simple().toString());
                break;
            case 4:
                System.out.println(x.div(y).simple().toString());
                break;
            
        }

    }
}
