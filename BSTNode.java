/**
 * BSTNode class creates a couple of nodes and has setter and getter methods for them
 * @author Andrei Daniel Vatasescu Predi
 * @version 1.0
 */
public class BSTNode {
    private Profile data;
    private BSTNode l;
    private BSTNode r;
    /**
     * Creates a node.
     * @param data The profile data found in the node
     */
    public BSTNode(Profile data){
        this.data=data;
    }
    /**
     *
     * @return The profile data found in the node.
     */
    public Profile getProfile(){
        return data;
    }
    /**
     *
     * @param l The left child of the current parent node.
     */
    public void setL(BSTNode l){
        this.l=l;
    }
    /**
     * @param r The right child of the current parent node.
     */
    public void setR(BSTNode r){
        this.r=r;
    }
    /**
     * @return The left child of the current parent node
     */
    public BSTNode getL(){
        return l;
    }

    /**
     *
     * @return The right child of the current parent node.
     */
    public BSTNode getR(){
        return r;
    }
}
