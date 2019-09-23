/* Project 1- Extra Credit 1
 * August 29, 2019
 */
public class Why
{
    public static void main(){
        double a;
        double a2;
        double f;
        double c;
        double b = 0;
        double z = 0;
        double length = 250000;
        double count = 0;
        System.out.println("");
        for(double i=1;i<length;i++){
        for(a=1;a<length;a++){
            a2 = a * a;
            f = (2*i)*a+(i*i);
            double d = Math.sqrt(f);
            double e = Math.floor(d);
            count++;
            if((d*d) == (e*e)){
                c = Math.sqrt(a2+f);
                if(a<e){
                int gcd = 1;
                for(int k = 1; k < a && k < e; k++){
                if(a%k==0 && e%k==0 && c%k==0){
                    gcd=k;
                }             
                }
                if(gcd==1){
                System.out.println("Sum: " + (int)(a+e+c) + " A: " + (int)a + " B: " + (int)e + " C: " + (int)c + " Progress: " + ((100*count)/(length*length) + "%"));
                z++;
            }else{
                gcd = 1;                
            }  
            b++;
            }
                
                if((a+e+c)==1000 && a<e){
                System.out.println("A: " + a);
                System.out.println("B: " + e);
                System.out.println("C: " + (int)c);
                System.out.println("Sum: " + (int)(a+e+c));
                System.out.println("The value of abc is " + (int)(a*e*c));
            }
            }
            
        }
    }
    System.out.println((int)b + " triples were found");
    System.out.println((int)z + " unique triples were found");
    }
}


