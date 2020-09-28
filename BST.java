/**
 * BST class creates a binary search tree that has inserting profile and printing in alphabetical order methods
 * @author Andrei Daniel Vatasescu Predi
 * @version 1.0
 * */

public class BST {
    private BSTNode root;
    /**
     * Creating a Binary Search Tree
     */
    public BST(){
        root=null;
    }

    /**
     * Inserts a profile into the Binary Search Tree
     * @param p The profile to be inserted into the Binary Search Tree
     */
    public void insertProfile(Profile p){
        BSTNode profile=new BSTNode(p);
        if(root==null){
            root=profile;
        }
        //If the root is not null, a recursive method is called that introduces the profile
        //into the right place
        else{
            recursive(root,profile);
        }
    }

    /**
     * @param current The current node in the recursive method.
     * @param toBeInserted The node to be inserted.
     */
    private void recursive(BSTNode current, BSTNode toBeInserted){
        //If the name of the profile to be inserted comes after the current profile
        //we place it as a right child
        if(toBeInserted.getProfile().getName().compareTo(current.getProfile().getName())>0){
            //Base case one when the getR method returns null
            if(current.getR()==null){
                current.setR(toBeInserted);
            }
            //if not, the recursive method is called once again
            else{
                recursive(current.getR(),toBeInserted);
            }
        }
        //If the name of the profile to be inserted comes before the current profile
        //we place it as a left child
        else{
            //Base case one when the getR method returns null
            if(current.getL()==null){
                current.setL(toBeInserted);
            }
            //if not, the recursive method is called once again
            else{
                recursive(current.getL(), toBeInserted);
            }
        }
    }

    /**
     * This method prints the Binary Search Tree in alphabetical order by calling another recursive method
     */
    public void printAlphabetical() throws NullPointerException{
        printAlphabetical(root);
    }

    /**
     * Recursive method that prints the names in alphabetical order
     * @param n The current node.
     */
    private void printAlphabetical(BSTNode n){
        if(n.getL()!=null){
            printAlphabetical(n.getL());
        }
        System.out.println(n.getProfile().getName());
        if(n.getR()!=null){
            printAlphabetical(n.getR());
        }
    }

  }
