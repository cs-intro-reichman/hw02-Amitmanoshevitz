/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
    public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int j = 1;

        while (j<=a){
        if(a%j == 0){
        System.out.println(j);
        j++;}
        else {j++;}
         }  
    }
}

