/* Project 1E
 * September 3, 2019
 */
import javax.swing.JOptionPane;

public class Greatest{
    public static void main(){
        int length = Integer.parseInt(JOptionPane.showInputDialog("Give a length for an array"));
        int randNum;
        int range;
        int max = 170;
        int min = 11;
        while(length < 10 || length > 100000){
            length = Integer.parseInt(JOptionPane.showInputDialog("Give a length for an array"));
        }
        
        int[] numArray = new int[length];;        
        for(int i=0; i<numArray.length; i++){
            range = max - min + 1;
            randNum = (int)(range * Math.random()) + min;
            numArray[i] = randNum;
            System.out.print(numArray[i] + "  ");
        }
        System.out.println("\n");
        int large = min;
        for(int i=0; i<numArray.length; i++){
            if(numArray[i] > large){
                large = numArray[i];
            }
        }
        System.out.println("The largest number in the array is " + large + "\n");
        int small = max;
        for(int i=0; i<numArray.length; i++){
            if(numArray[i] < small){
                small = numArray[i];
            }
        }
        System.out.println("The smallest number in the array is " + small);
    }
}