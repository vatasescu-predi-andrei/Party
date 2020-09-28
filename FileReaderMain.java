import java.util.Scanner;
/**
 * @author Andrei Daniel Vatasescu Predi
 * @version 1.0
 */

public class FileReaderMain {
    public static void main(String[] args){
        BST tree = new BST();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the file name:");
        String input=in.next();
        tree=FileReader.readProfileSet(input);
        tree.printAlphabetical();
    }
}