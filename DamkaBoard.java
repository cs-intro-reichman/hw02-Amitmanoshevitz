/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
    public static void main(String[] args) {
    int rn = Integer.parseInt(args[0]);
    String s = "* ";
    String s1 = " *";
    for(int j=0; j<rn; j++){
        for(int i=0; i<rn; i++){
            if(j%2==0){
            System.out.print(s);}
            else {
                System.out.print(s1);}
            }
        System.out.println();
        }
    }
}


