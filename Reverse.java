/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
    public static void main(String[] args) {
        String s = args[0];
        int left = 0;
        int right = s.length() - 1;
        String new1 = "";
        int mid1 = s.length()/2;
       
            while (right >= left) {
                char r = s.charAt(right);
                new1 = new1 + r;
                right--;
                }

        System.out.println(new1);

       if(s.length()%2 == 0){
            char mid = s.charAt(mid1-1);
            System.out.println("The middle character is "+mid);
        }else{ 
            char mid = s.charAt(mid1);
            System.out.println("The middle character is "+mid);
        }
        
    }
}