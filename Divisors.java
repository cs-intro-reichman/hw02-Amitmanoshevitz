/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class OneOfEach {
    public static void main(String[] args) {
    double ran1 = Math.random();
    double ran2 = Math.random();
    String kid = "";
    int num = 1;

    if (ran1 >= 0.5) {
        kid = kid + "g";} 
    else {kid = kid + "b";} 
        
    while ((ran1 < 0.5 && ran2 < 0.5) || (ran1 >= 0.5 && ran2 >= 0.5)){
        if(ran2>=0.5){
            kid = kid + " g";}
        else{kid = kid + " b";}
            ran2 = Math.random();
            num++;}

    if(ran2>=0.5){ 
        kid = kid + " g";
        num++;}
    else{kid = kid + " b";
        num++;}

    System.out.println(kid);
    System.out.println("You made it.. and now you have "+ num +" children.");
    }
}
