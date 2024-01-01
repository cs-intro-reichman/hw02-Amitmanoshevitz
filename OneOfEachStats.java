import java.util.Random;
public class OneOfEachState1 {
    public static void main(String[] args) {
    int T = Integer.parseInt(args[0]);
    String kid = "";
    int num = 1;
    int x = 0;
    int fam2 = 0;
    int fam3 = 0;
    int fam4 = 0;
    int y = 0;

    
        int seed = Integer.parseInt(args[1]);
        // Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  






while (x<T){
    x++;
    double ran1 = generator.nextDouble();
    double ran2 = generator.nextDouble();
    

    /////////////////////////////
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

 ///////////////////////////////////       
    if (num == 2) {
        fam2++;
    }
    if (num == 3) {
        fam3++;
    }
    if (num >= 4) {
        fam4++;
    }
    
    y = y + num;
    num = 1;
}
double p = y;
double av = p/T;

    System.out.println("Avrage: "+ av +" children to get at least one of each gender.");
    System.out.println("Number of families with 2 children: "+fam2);
    System.out.println("Number of families with 3 children: "+fam3);
    System.out.println("Number of families with 4 or more children: "+fam4);
    
    if (fam2>fam3 && fam2>fam4){
        System.out.println("The most common number of children is "+2+ ".");}
    else if (fam3>fam2 && fam3>fam4){
        System.out.println("The most common number of children is "+3+ ".");}
    else{
        System.out.println("The most common number of children is "+4+ " or more.");}
    
}
}