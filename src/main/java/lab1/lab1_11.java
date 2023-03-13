package lab1;
import java.util.Scanner;

public class lab1_11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string:");
        String[] line= in.nextLine().split("\\s+");
        for(int i=0; i< line.length; i++) {
            for(int j=0; j< line[i].length(); j++) {
                System.out.println("Letter: " + line[i].charAt(j) + " ASCII: " + (int)line[i].charAt(j) + " Unicode: "+ Integer.toHexString(line[i].charAt(j)));
            }
        }
    }
}
