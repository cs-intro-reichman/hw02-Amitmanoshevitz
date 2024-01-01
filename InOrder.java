/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
    public static void main(String[] args) {
    int f = (int)(Math.random()*9);
    System.out.print(f);
    int i = (int)(Math.random()*9)+1;
    while (f<=i) { 
        System.out.print(" "+i);
        f = i;
        i = (int)(Math.random()*9)+1;
        }       

    }
}


