/**
 * <h1>Filename: FileReader.java</h1>
 * <d1>
 * <dt><span class="simpleTagLabel">Function:</span></dt>
 * <dd>- This is a class that reads in a file from a folder.</dd>
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

import java.io.*;
import java.util.Scanner;

public class FileReader {

    /**
     * - Method to read in a file.
     * @param filename The name of the file that is to be read in.
     * @return The binary search tree that is represents the file of profiles.
     */
    public static BST readProfileSet(String filename) {
        filename = "./src/Data/" + filename;
        File inputFile = new File(filename);
        Scanner in = null;

        try {
            in = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + filename + " not found.");
            System.exit(0);
        }

        return FileReader.readProfileSet(in);

    }


    /**
     * - Method to read the file contents and create a binary search based on the file.
     * - It does this by taking the file contents, removing commas and semi-colons then adding a special character  to
     * the end of each line.
     * <br></br>
     * - Then saving this to a new file so the profiles can be read in more easily later in the method.
     * @param in The contents of the file.
     * @return The binary search tree that has been created.
     */
    private static BST readProfileSet(Scanner in) {

        String fileLines = "";
        BST tree = new BST();

        while (in.hasNextLine()) { //Removing all the commas and semi-colons and then replacing them spaces.
            fileLines = fileLines + in.nextLine() + " +\n";

            fileLines = fileLines.replace(",", " ");

            fileLines = fileLines.replace(";", " ");

        }

        try { // Writing the string to a file so that it is easier to create profiles later.
            PrintWriter fileWriter = new PrintWriter("ProfilesFormatted.txt");
            fileWriter.write(fileLines);
            fileWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not writable.");
            System.exit(0);
        }

        try { // Opening the file that was just created so that the program can now make profiles and the BST.
            File inputFile = new File("ProfilesFormatted.txt");
            in = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + in + " not found.");
            System.exit(0);
        }

        while (in.hasNext()) {

            String[] interests = new String[1000000];
            int i = 0;

            String lastName = in.next();
            String firstName = in.next();
            int dayOfBirth = Integer.valueOf(in.next());
            int monthOfBirth = Integer.valueOf(in.next());
            int yearOfBirth = Integer.valueOf(in.next());
            String curTown = in.next();
            String curCountry = in.next();
            String nationality = in.next();
            String email = in.next();

            String tempInput = in.next();
            while (!(tempInput.equals("+"))) {
                interests[i] = tempInput;
                i++;
                tempInput = in.next();

            }
            Profile temp = new Profile(lastName, firstName, dayOfBirth, monthOfBirth, yearOfBirth, curTown, curCountry, nationality, email, interests);

            System.out.println(temp.toString());


            tree.insertProfile(temp);


        }
        return tree;
    }
}
