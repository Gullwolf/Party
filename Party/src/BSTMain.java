/**
 * <h1>Filename: BSTMain.java</h1>
 * <d1>
 * <dt><span class="simpleTagLabel">Function:</span></dt>
 * <dd>- To test the methods of the BST.java class.</dd>
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

public class BSTMain {

    public static void main(String[] args) {

        String[] interests = new String[3];

        interests[0] = "Coding";
        interests[1] = "Cars";
        interests[2] = "Comics";


        Profile one = new Profile("D", "D", 11, 12, 1999, "Swansea", "Wales", "English", "984336@swansea.ac.uk", interests);

        BST tree = new BST();

        tree.insertProfile(one);

        //BSTNode oneNode = new BSTNode(one, null, null);

        Profile two = new Profile("C", "C", 16, 02, 2001, "Ely", "England", "English", "839201033@gmail.com", interests);
        Profile three = new Profile("E", "E", 24, 06, 1997, "Ely", "England", "English", "richardCook907@gmail.com", interests);
        Profile four = new Profile("A", "A", 4, 12, 1597, "London", "England", "English", "6335652@gmail.com", interests);


        tree.insertProfile(two); // Inserting the profiles in to the binary search tree.

        tree.insertProfile(three);

        tree.insertProfile(four);

        System.out.println(tree.toString()); // Printing out the root with its left and right children.

    }
}