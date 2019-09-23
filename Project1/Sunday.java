/* Project 1- Extra Credit 2
 * September 6, 2019
 */
public class Sunday{
    public static void main(){
        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        int day = 2;
        int daySum;
        int sunday = 0;
        for (int i = 1901; i < 2001; i++){
            if(i%4 == 0){
                month[1] = 29;
            }
            else{
                month[1] = 28;
            }
            for(int j=0; j<12; j++){
                daySum = day + month[j];
                day = daySum % 7;
                if(day == 0){
                    sunday++;
                }
            }
        }
        System.out.println(sunday);
    }
}
