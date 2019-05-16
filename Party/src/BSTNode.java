/**
 * <h1>Filename: BSTNode.java</h1>
 * <d1>
 * <dt><span class="simpleTagLabel">Function:</span></dt>
 * <dd>- This is a class that is a template for a node that can then be inserted in to the binary search tree.</dd>
 * </d1>
 * @version 1.1
 *<br></br>
 * - Creation date: 16/04/2019
 * <br></br>
 * - Last edited: 08/05/2019
 * @author George Cook (984336)
 * <br></br>
 * - no copyright
 * <d1>
 * <dt><span class="simpleTagLabel">Version History::</span></dt>
 * <dd>Version 1.0 - The class had no comments and was not whole.</dd>
 * </d1>
 *
 */

public class BSTNode<N>{

    private Profile data;
    private BSTNode<N> l;
    private BSTNode<N> r;


    /**
     * - Constructor for a node.
     * @param node The Profile that the node will reference.
     * @param l The left child of the node.
     * @param r The right child of the node.
     */
    public BSTNode(Profile node, BSTNode<N> l, BSTNode<N> r){
        this.data = node;
        this.l = l;
        this.r = r;
    }

    /**
     * - Method to get the profile that the node represents/references.
     * @return The data of the profile that is being referenced.
     */
    public Profile getProfile(){
        return data;
    }

    /**
     * - Method to set the left child of the node so that things can be added to the tree later.
     * @param l The reference that the left child is to be set to.
     */
    public void setL(BSTNode l){
        this.l = l;
    }

    /**
     * - Method to set the right child of the node so that things can be added to the tree later.
     * @param r The reference that the right child is to be set to.
     */
    public void setR(BSTNode r){
        this.r = r;
    }

    /**
     * - Method to return the value of the left child of this node.
     * @return The value of the left child.
     */
    public BSTNode getL(){
        return l;
    }

    /**
     * - Method to return the value of the right child of this node.
     * @return The value of the right child.
     */
    public BSTNode getR(){
        return r;
    }

}
