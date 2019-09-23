import javax.swing.JOptionPane;

public class QuizReview{
    public static void main(){
        double sleep = -1;
        while(sleep < 0){
        sleep = Double.parseDouble(JOptionPane.showInputDialog("How many hours of sleep did you get last night?"));
    }
        System.out.println("You got " + sleep + " hours of sleep last night.");
    }
}