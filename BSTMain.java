/**
 * BSTMain tests the methods from the BST class.
 * @author Andrei Daniel Vatasescu Predi
 * @version 1.0
 */

public class BSTMain {
    public static void main(String[] args) {
        String[] interests = {"code", "books", "maths"};
        String[] activities = {"volley", "football", "basketball"};
        Profile nr1 = new Profile("Predi", "Andrei", 22, 7, 1999, "prediandrei@gmail.com", interests, activities);
        Profile nr2 = new Profile("Spanache", "Narcis", 17, 6, 2000, "spanache@gmail.com", interests, activities);
        Profile nr3 = new Profile("Ciobanu", "Victor", 15, 9, 2001, "victorciobanu@gmail.com", interests, activities);
        Profile nr4 = new Profile("Mutilica", "Vlad", 24, 3, 1999, "mutilica@gmail.com", interests, activities);
        Profile nr5 = new Profile("Szucs", "Gergo", 11, 8, 1998, "gergoszucs@gmail.com", interests, activities);
        Profile nr6 = new Profile("Blejdea", "Marian", 10, 3, 1994, "marian@gmail.com", interests, activities);
        Profile nr7 = new Profile("Toma", "Costea", 10, 4, 1997, "tomacostea@gmail.com", interests, activities);


        BST tree = new BST();
        //BINARY TREE
        tree.insertProfile(nr4);
        tree.insertProfile(nr2);
        tree.insertProfile(nr6);
        tree.insertProfile(nr1);
        tree.insertProfile(nr3);
        tree.insertProfile(nr5);
        tree.insertProfile(nr7);
        tree.printAlphabetical();
    }
}