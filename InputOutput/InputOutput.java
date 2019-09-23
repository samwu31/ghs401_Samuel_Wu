import javax.swing.JOptionPane;

public class InputOutput
{
    public static void main(){
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Why hello there, " + name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
                
        if(age >= 16){
            System.out.println("You are allowed to operate a vehicular transport machine, " + name + "!");
        }
        else{
            System.out.println("Stay home, " + name);
        }
        
        //String quest = JOptionPane.showInputDialog("What is your quest?");
        //System.out.println(quest);
    }
}
