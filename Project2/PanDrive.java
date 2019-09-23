
/**
 * Write a description of class PanDrive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PanDrive
{
    public static void main(){
        Panda express = new Panda("the Pacific Ocean", 203.44);
        
        System.out.println(express.toString());
        express.changeFat(185.69);
        System.out.println(express.toString());
        express.migration("the Atlantic Ocean");
        System.out.println(express.toString());
        System.out.println(express.getCountry());
        System.out.println(express.getWeight());
        
        double currentWeight = express.getWeight();
        currentWeight -= 25.89;
        express.changeFat(currentWeight);
        System.out.println(express.toString());
        
        Panda[] panArray = {new Panda("Japan", 181.11), new Panda("Mexico", 189.55), new Panda("France", 154.43)};
        for(int i = 0; i < panArray.length; i++){
            System.out.println(panArray[i].toString());
        }
    }
}
