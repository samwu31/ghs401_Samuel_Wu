/* Project 1C
 * August 26-27, 2019
 */
import javax.swing.JOptionPane;

public class Waldo{
    public static void main(){
       String mySchool = JOptionPane.showInputDialog("What school do you attend?");
               
       if(!mySchool.equals("Granada")){
            System.out.println("That is the wrong school and thou art a big fool");
        }
       else{
            String myMascot = JOptionPane.showInputDialog("What is your school's mascot?");
            
            if(!myMascot.equals("Matadors")){
                System.out.println("That is the incorrect mascot you blithering idiot");
            }
            else{
                String[] characters = {"Darth Vader","Voldemort",null,"Waldo","Jeff Chibba"};
                
                for(int i = 0; i < characters.length; i++){
                    if(characters[i] == null){                        
                        System.out.println("Element " + (i + 1) + " is empty. Sorry, please come again!");
                    }
                    else if(characters[i].equals("Waldo")){
                        System.out.println("You found Waldo in element " + (i + 1) + "!");
                    }
                    else{
                        System.out.println("Waldo is not in element " + (i + 1) + ". " + characters[i] + " is in that spot.");
                    }
                }
                String movie = JOptionPane.showInputDialog("Who is your favorite movie character?");
                                
                if(movie.equals(characters[0])){
                    System.out.println("We have the same favorite movie character!");
                }
                else{
                    System.out.println("You have bad taste in movies.");
                }
                String artist = JOptionPane.showInputDialog("Who is your favorite artist?");
                if(artist.equals(characters[1])){
                    System.out.println("We have the same favorite artist!");
                }
                else{
                    System.out.println("Your opinion is incorrect");
                }
            }
        }
    }
}