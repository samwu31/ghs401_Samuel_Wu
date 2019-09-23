/* Project 1B
 * August 22 - 23, 2019
 */
import javax.swing.JOptionPane;

public class Why
{
    public static void main(){
        int min = Integer.parseInt(JOptionPane.showInputDialog("Escoges el número minimo:: "));
        int maxp = Integer.parseInt(JOptionPane.showInputDialog("Escoges el número máximo;; "));
        int loNg = Integer.parseInt(JOptionPane.showInputDialog("choose length of aray, in centimeters:; "));
        int evenn = 0;
        int oddd = 0;
        if(min >= maxp){
            System.out.println("The max number is supposed to be bigger you biG buFFo0n.");
        }
        else{
             int[] aray = new int[loNg];
            for(int i=0; i< aray.length; i++){
                int range = 1 + maxp - min;
                aray[i] = (int)(range * Math.random()) + min;
                System.out.println("RANDOM NUMBER:;; ' :::: "+aray[i]+" INDEX\\:::::: "+(i+1));
                int ramen = aray[i] % 2;
                if(ramen == 0){
                    System.out.println(aray[i]+" is evenn.");
                    evenn++;
                }
                else{
                    System.out.println(aray[i]+" is oddd.");
                    oddd++;
                }
                if(aray[i]==7){
                System.out.println("WOHOHOOHOHO TODAY IS YOUR LUCKY DAY: PLEASE CLICK ON THIS LINK TO RECEIVE A CHANCE TO WIN AN E P I C MACBOOK PRO OR A V A C A T I O N TO HAWAII ANTS ISLAJDS::::");
            }
            else if(aray[i]==666){
                System.out.println("CLICK HERE TO VIEW A PERSONAL MESSAGE FROM S A T A N HIMSELF!!!!!!1111!!!");
            }
            else if(aray[i]==0){
                System.out.println("Zero is a number that can represent many things in our lives, including your bank balance, the number of people who will love you, and your current GPA. Zero is also symbolic of the emptiness of your soul.");
            }
            else if(aray[i]==13){
                String friday = JOptionPane.showInputDialog("is today friday!: ");
                if(friday.equals("yes")){
                System.out.println("Today is probably not Friday the 13rd.");
            }
            }
            else if(aray[i]==42){
                System.out.println("42 is the # that succeeds 41 and precedes 43. It is also half of 84. This has been your AP Number Fact of the Day.");
            }
            else if(aray[i]==5){
                System.out.println("Hello, this is Fodin Sorano. I would like to sell you my 5 Steps to a 5 book.");
            }
            else if(aray[i]==10){
                System.out.println("HI THIS IS PHIL SWIFT FROM FLEXTAPE!! TO SHOW THE POWER OF FLEXTAPE, WE SAWED THIS 1 0 IN HALF, AND USED FLEXTAPE TO PUT IT BACK TOGETHER!!11!!");
            }
            else if(aray[i]==6){
                System.out.println("6 ants on    my  arm  a   a  a aa a    a    a a              a            a                 a aa a ");
            }
            else if(aray[i]==14){
                System.out.println("your number was 14 your number was 14 your number was 14 your number was 14 your number was 14 your number was 14 your number was 14 ");
            }
            else if(aray[i]==8){
                System.out.println("Mr. Mattern demands that you run 8 miles immediately.");
                            }
            else if(aray[i]==-1){
                System.out.println("Negative numbers are less than 0. They are also depressed.");
            }
        }
        System.out.println("there Were "+oddd+" Odd Number's");             
        System.out.println("There were "+evenn+" evene Number's");
        if(aray.length <= 5){
            System.out.println("@@@@@@wow thats not alot of numbers jimothy%%%%%");  
    }
    else{
            System.out.println("@@@@@@wow thats alot of numbers jimothy%%%%%");  
    }
    
    }
    
}
}