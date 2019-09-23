/*Project 1A
 *August 20 - 21, 2019
*/

import javax.swing.JOptionPane;

public class Quadratic{
    public static void main(){
        double a = Double.parseDouble(JOptionPane.showInputDialog("Choose a"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Choose b"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Choose c"));
        System.out.println("The equation is " + a + "x2 + " + b + "x + " + c);
        System.out.println("");
        double b2 = b * b;
        System.out.println("The value of b squared is " + b2);
        
        double ac = 4 * a * c;
        System.out.println("The value of 4ac is " + ac);
        double a2 = 2 * a;
        
        if((b2 - ac) >= 0){
        System.out.println("The value of sqrt(b^2 -4ac) is " + Math.sqrt(b2 - ac));
        
        System.out.println("The first root of the equation is " + (-b + Math.sqrt(b2 - ac))/a2);
        System.out.println("The second root of the equation is " + (-b - Math.sqrt(b2 - ac))/a2);
    }
    else{
        double imaginary = (Math.sqrt(-b2 + ac)) / a2;
        double root = -b / a2;
        System.out.println("The first imaginary root of this equation is " + root + " + " + imaginary + "i");
        System.out.println("The second imaginary root of this equation is " + root + " - " + imaginary + "i");
        
    }
    }
}
