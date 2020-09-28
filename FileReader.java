import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *This class creates user profiles by reading each line of an input file,
 * and adds the profiles to a binary search tree.
 * @author Andrei Daniel Vatasescu Predi
 * @version 1.0
 */

public class FileReader {
    /**
     * Reads the attributes of a profile from an input file line and creates a profile.
     * @param in The first scanner used to read the contents of a profile
     * @return The profile with attributes from the input file line.
     */
    private static Profile readContents(Scanner in) {
        String lastName = in.next();
        String firstName = in.next();
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();
        String emailAddress = in.next();
        in.skip(",");

        String allInterests=in.nextLine();
        String delim=",";
        String[] tokens = allInterests.split(delim);

        Scanner inters=new Scanner(tokens[0]);
        inters.useDelimiter(";");

        Scanner activs=new Scanner(tokens[1]);
        activs.useDelimiter(";");


        Profile profile = new Profile(lastName, firstName, day, month, year, emailAddress, readInterests(inters),
                readActivities(activs));

        return profile;
    }

    /**
     * Reads user`s interests.
     * @param inters The scanner used to read the user's interests.
     * @return The user's interests array.
     */
    private static String[] readInterests(Scanner inters) {
        int n = 0;
        ArrayList<String> listI = new ArrayList<>();
        while (inters.hasNext()) {
            String interest = inters.next();
            listI.add(interest);
        }
        String[] interests = new String[listI.size()];
        interests = listI.toArray(interests);
        return interests;
    }

    /**
     * Reads user`s activities.
     * @param activs The scanner used to read the user's activities.
     * @return The user's activities array.
     */
    private static String[] readActivities(Scanner activs) {
        int n = 0;
        ArrayList<String> listA = new ArrayList<>();
        while (activs.hasNext()) {
            String activity = activs.next();
            listA.add(activity);
        }
        String[] activity = new String[listA.size()];
        activity = listA.toArray(activity);
        return activity;
    }

    /**
     * Reads the profiles and populates the BST.
     * @param in The main scanner that reads all the lines of the input file.
     * @return The BST populated with the Profiles from the input file.
     */
    private static BST readProfileSet(Scanner in) {
        BST tree = new BST();

        while (in.hasNextLine()) {
            String currentLine = in.nextLine();
            Scanner line = new Scanner(currentLine);
            line.useDelimiter(",");

            tree.insertProfile(readContents(line));

            line.close();
        }

        return tree;
    }
    /**
     * Creates a scanner to read tokens from an input file.
     * @param filename The name of the input file.
     * @return The method that reads and inserts the profiles into the tree.
     */
    public static BST readProfileSet(String filename) {

        File inputFile = new File(filename);
        Scanner in = null;

        try {
            in = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("The file does not exist" + filename);
        }

        return FileReader.readProfileSet(in);
    }
}