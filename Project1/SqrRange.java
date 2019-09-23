public class SqrRange
{
   public static void main(){
       int i2;
       String[] movies = {"Seven", "Forest Gump", "The Incredibles"};
       String[] songs = {"Boyfriend", "Call me Maybe" , "Friday"};
       for(int i = 1; i<11; i++){
           i2=(i*i);
           int rand = (int)((Math.random() * ((i2 - i) + 1)) + i);
           System.out.print(i+"\t"+i2+"\t"+rand);
           if(rand == i){
               System.out.println("\t The Random number is equal to the index\n");
            }
            else if(rand == i2){
                 System.out.println("\t The Random number is equal to the square of the index\n");
            }
            
            else{ System.out.println("\n");}
               
        }
        
        for(int i = 0; i<movies.length; i++){
            System.out.print(movies[i] + "\n");
        }
        System.out.print("\n\n");
        
        int a=0;
        while(a<songs.length){
            if(a<(songs.length-1)){
                System.out.print(songs[a]+", ");
            }
            else{
                System.out.print(songs[a]);
            }
            a++;
        }
             
       
       
    }
}
