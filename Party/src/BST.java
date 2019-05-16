/**
 * <h1>Filename: BST.java</h1>
 * <d1>
 * <dt><span class="simpleTagLabel">Function:</span></dt>
 * <dd>- This is a class that is a template for a binary search tree.</dd>
 * </d1>
 * @version 1.1
 *<br></br>
 * - Creation date: 21/04/2019
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

public class BST<N> {

    private BSTNode<N> root = null;

    /**
     * - Constructor for a binary search tree
     */
    public BST() {
    }

    /**
     * - Method to insert a profile in to the binary search tree.
     * @param p The profile that is to be inserted.
     */
    public void insertProfile(Profile p) {

        if (root == null) {
            BSTNode<N> temp = new BSTNode(p, null, null);

            this.root = temp;
        } else {
            BST.insertProfile(p, root);
        }

    }

    /**
     * - Method to insert a profile in the correct place in the binary search tree.
     * <br></br>
     * - When the root is already set.
     * @param p The profile that is to be inserted.
     * @param node The node that the profile is to be compared against.
     */
    private static void insertProfile(Profile p, BSTNode node) {
        int comp;
        BSTNode newP = new BSTNode(p, null, null);
        Profile compNode = (node.getProfile());

        if (node.getL() == null || node.getR() == null) {
            comp = (compNode.getFirstName().compareTo(p.getFirstName()));
            if (comp >= 0) {
                node.setL(newP);
            } else if (comp < 0) {
                node.setR(newP);
            }
        } else if (node.getL() != null || node.getR() != null) {
            comp = (compNode.getFirstName().compareTo(p.getFirstName()));

            if (comp >= 0) {
                insertProfile(p, node.getL());
            } else if (comp < 0) {
                insertProfile(p, node.getR());
            }

        }

    }

    /**
     * - Method to print the binary search tree in alphabetical order.
     */
    public void printAlphabetical(){
        printAlphabetical(root);
    }

    /**
     * - Method to print the binary search tree in alphabetical order.
     * @param node The node that is currently been looked at.
     */
    private void printAlphabetical(BSTNode<N> node){

        if(node == null){
            return;
        }

        printAlphabetical(node.getL());
        System.out.println(node.getProfile().getName());
        printAlphabetical(node.getR());

    }

    public String toString(){
        String outputString;

        outputString = this.root.getProfile() + "\n";
        outputString = outputString + this.root.getL().getProfile() + "\n";
        outputString = outputString + this.root.getR().getProfile() + "";

        return outputString;
    }
}
