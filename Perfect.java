/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
    public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int j = 1;
    int sum = 0;
    String print=1+"";


        while (sum<a){
            if(a%j == 0){ 
                sum = sum + j;}
            if (a%j == 0 && j>1){
                print = print +" + "+ j;}
            j++;}  

        if (sum == a){
        System.out.print(a + " is a perfect number since "+a+ " = " + print);
    }

        if (sum > a) {System.out.print(a + " is not a perfect number");
        }
    }
}
