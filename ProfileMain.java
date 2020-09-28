/**
 * ProfileMain tests all the methods from the Profile class.
 * @author Andrei Daniel Vatasescu Predi
 * @version 1.0
 */
public class ProfileMain {
        public static void main(String[] args){
            String[] interests={"a","b","c"};
            String[] activity={"volley","football","basketball"};
            Profile nr1=new Profile("Toma","Cristi", 10, 4, 1997, "tomacostea@gmail.com", interests, activity);
            Profile nr2=new Profile("Spanache","Narcis", 17, 6, 2000, "spanache@gmail.com", interests,activity);
            Profile nr3=new Profile("Victor","Ciobanu", 15, 9, 2001,  "ciobanuvictor@gmail.com", interests,activity);
            Profile nr4=new Profile("Predi","Andrei", 22, 7, 1999, "prediandrei@gmail.com", interests,activity);

            System.out.println(nr2.getDateOfBirth());
            System.out.println("\n");
            System.out.println(nr1.getInterest());
            System.out.println("\n");
            nr1.addFriend(nr2);
            nr1.addFriend(nr3);
            nr1.addFriend(nr4);
            System.out.println(nr1.getFriend(2));
            System.out.println(nr1.toString());

        }
}

