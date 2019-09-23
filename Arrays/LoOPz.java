public class LoOPz{
    public static void main(){
        String firstNames[] = {"Sam","Chase","Mark","Feoden","Jeff"};
        String lastNames[] = {"Wu","Vogler","Bennett","Soriano","Chibba"};
        
        //System.out.println("First Name\t\tLast Name");
        
        int range = firstNames.length;
        int num1; 
        int num2;
        for(int i = 0; i < 7; i++){
            num1 = (int)(range * Math.random());
            num2 = (int)(range * Math.random());
            //System.out.println(firstNames[num1] + "\t\t\t" + lastNames[num2]);
            
        }
        //System.out.println("");
        int a = 1;
        while(a<=firstNames.length){
            System.out.println(firstNames[firstNames.length - a]);
            a++;
        }
    }
}