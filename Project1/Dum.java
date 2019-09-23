

public class Dum
{
    public static void main(){
        int a;
        int b;
        int c;
        int d=0;
        int e=0;
        boolean solve = false;
        while(solve == false){
            
            a = (int)(Math.random()*505+.5);
            b = (int)(Math.random()*999+.5);
            c = (int)(Math.random()*1000+.5);
            d++;
            if(a < b && a < c && b < c){
                
                if(((a*a) + (b*b)) == (c*c)){
                    System.out.println(" A = " + a + " B = " + b + " C = " + c + "\t" + (a + b + c));
                    e++;
                    if((a + b + c) == 1000){
                        solve = true;
                        System.out.println("A = " + a + "B = " + b + "C = " + c+ "\t" + (a + b + c));
                        System.out.println(d + " attempts were required.");
                        System.out.println(e + " triples were found.");
                    }
                }
            }
        }
    }
        
}
   

