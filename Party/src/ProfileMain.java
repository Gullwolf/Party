/**
 * <h1>Filename: ProfileMain.java</h1>
 * <d1>
 * <dt><span class="simpleTagLabel">Function:</span></dt>
 * <dd>- To test the methods of the Profile.java class.</dd>
 * </d1>
 * @version 1.1
 *<br></br>
 * - Creation date: 14/04/2019
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

public class ProfileMain {

    public static void main(String[] args) {


        String[] interests = new String[3];

        interests[0] = "Coding";
        interests[1] = "Cars";
        interests[2] = "Comics";


        Profile one = new Profile("Cook", "George", 11, 12, 1999, "Swansea", "Wales", "English", "984336@swansea.ac.uk", interests);

        one.setCurTown("York Factory");
        one.setCurCountry("Canada");

        System.out.println(one.toString());
    }
}
