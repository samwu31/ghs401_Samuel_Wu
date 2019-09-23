import javax.swing.JOptionPane;
//JOptionPane.showInputDialog("");
public class StringStuff
{
   public static void main(){
       /*String name = "sam";
       String name2 = "sam";
       
       int a = 10;
       int b = 10;
       
       if(name.equals(name2)){
           System.out.println("They are twins!");
        }
       else{
           System.out.println("They are NOT twins!");
        }
       */
       String[] classmates = {"Sam","Mark","Fodin","Cheese",null,"Jeff Chibba"};
       
       for(int i=0; i < classmates.length; i++){
           if(classmates[i] != null){
           System.out.println(classmates[i].length());
        }
        
        }
    }
}