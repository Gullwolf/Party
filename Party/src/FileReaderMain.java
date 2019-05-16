/**
 * <h1>Filename: FileReaderMain.java</h1>
 * <d1>
 * <dt><span class="simpleTagLabel">Function:</span></dt>
 * <dd>- To test the functionality of the FileReader.java class.</dd>
 * </d1>
 *
 * @version 1.1
 * <br></br>
 * - Creation date: 28/04/2019
 * <br></br>
 * - Last edited: 08/05/2019
 * @author George Cook (984336)
 * <br></br>
 * - no copyright
 * <d1>
 * <dt><span class="simpleTagLabel">Version History::</span></dt>
 * <dd>Version 1.0 - The class had no comments and was not whole.</dd>
 * </d1>
 */

import java.util.Scanner;

public class FileReaderMain {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the name of the file to be opened(include.txt): "); // Asking the user for the input file
        String file = in.next();

        FileReader.readProfileSet(file);




    }
}
