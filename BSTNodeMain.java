/**
 * BSTNodeMain tests the methods from BSTNode class
 * @author Andrei Daniel Vatasescu Predi
 * @version 1.0
 */
public class BSTNodeMain {
        public static void main(String[] args){
            String[] interests={"code","books","maths"};
            String[] activity={"voley","football","basketball"};
            Profile nr1=new Profile("Alex","Mihai", 13, 3, 1999, "alex@gmail.com", interests,activity);
            Profile nr2=new Profile("Bogdan","Lupu", 15, 8, 1987, "bogdan@gmail.com", interests,activity);
            Profile nr3=new Profile("Razvan","Popescu", 4, 1, 1998, "razvan@gmail.com", interests,activity);
            Profile nr4=new Profile("Vlad","George", 3, 11, 1995,  "vlad@gmail.com", interests,activity);
            BSTNode first=new BSTNode(nr1);
            BSTNode second=new BSTNode(nr2);
            BSTNode third=new BSTNode(nr3);
            BSTNode fourth=new BSTNode(nr4);
            first.setL(second);
            first.setR(third);
            second.setL(fourth);
            System.out.println(first.getL().getProfile());
            System.out.println(first.getR().getProfile());
            System.out.println(second.getL().getProfile());
        }
}
