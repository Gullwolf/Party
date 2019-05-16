/**
 * <h1>Filename: BSTNodeMain.java</h1>
 * <d1>
 * <dt><span class="simpleTagLabel">Function:</span></dt>
 * <dd>- To test the methods of the BSTNode.java class and make sure that it is working properly.</dd>
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

public class BSTNodeMain {

    public static void main(String[] args){
        String[] interests = new String[3];

        interests[0] = "Coding";
        interests[1] = "Cars";
        interests[2] = "Comics";


        Profile one = new Profile("Cook", "George", 11, 12, 1999, "Swansea", "Wales", "English", "984336@swansea.ac.uk", interests);
        Profile two = new Profile("Howarth", "Mollie", 16,02,2001,"Ely", "England", "English", "MollieHowarth@gmail.com", interests);
        Profile three = new Profile("Cook", "Richard", 24,06,1997, "Ely", "England", "English", "richardCook907@gmail.com", interests);

        BSTNode Root = new BSTNode(two, null, null);

        BSTNode left = new BSTNode(one, null, null);
        BSTNode right = new BSTNode(three, null, null);

        Root.setL(left);
        Root.setR(right);

        System.out.println(Root.toString());
    }
}
