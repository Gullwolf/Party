/**
 * <h1>Filename: Profile.java</h1>
 * <d1>
 * <dt><span class="simpleTagLabel">Function:</span></dt>
 * <dd>- This is a class that is a template for a profile object.</dd>
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

import java.util.ArrayList;

public class Profile {

    private String lastName;
    private String firstName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String curTown;
    private String curCountry;
    private String nationality;
    private String emailAddress;
    private String[] interests;
    private ArrayList<Profile> friends = new ArrayList<>();

    /**
     * - Constructor for the Profile object.
     * @param lastName The last name of the person whose profile it is.
     * @param firstName The first name of the person who's profile it is.
     * @param dayOfBirth The day that they where born on.
     * @param monthOfBirth The month that the person was born in.
     * @param yearOfBirth The year that the person was born in.
     * @param curTown There current Town/City that they live in.
     * @param curCountry The current Country that the person lives in.
     * @param nationality The persons Nationality.
     * @param emailAddress The email address that is linked with the profile.
     * @param interests The person whose profile it is interests.
     */
    public Profile(String lastName, String firstName, int dayOfBirth, int monthOfBirth, int yearOfBirth, String curTown, String curCountry, String nationality, String emailAddress, String[] interests){
        this.lastName = lastName;
        this.firstName = firstName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.curTown = curTown;
        this.curCountry = curCountry;
        this.nationality = nationality;
        this.emailAddress = emailAddress;
        this.interests = interests;
    }

    /**
     * - Gets the first name of the persons profile.
     * @return The value of firstName.
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * - Sets the curTown variable
     * <br></br>
     * - This is here so that it can be changed without having to create a new profile.
     * @param curTown The value that is curTown is to be changed to.
     */
    public void setCurTown(String curTown){
        this.curTown = curTown;
    }

    /**
     * - Sets the curCountry variable
     * <br></br>
     * - This is here so that it can be changed without having to create a new profile.
     * @param curCountry The value that is curCountry is to be changed to.
     */
    public void setCurCountry(String curCountry){
        this.curCountry = curCountry;
    }

    /**
     * - Sets the nationality variable
     * <br></br>
     * - This is here so that it can be changed without having to create a new profile, if it has been entered wrong.
     * @param nationality The value that is nationality is to be changed to.
     */
    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    /**
     * - Sets the interests array.
     * <br></br>
     * - This is here so that it can be changed without having to create a new profile.
     * @param interests The array that is interests is to be changed to.
     */
    public void setIntrests(String[] interests){
        this.interests = interests;
    }

    /**
     * - Method to get the name of the person whose profile it is.
     * @return A String of the firstName and lastName concatenated with a space.
     */
    public String getName(){
        return firstName + " " + lastName;
    }

    /**
     * - Method to get the date of birth of the person whose profile it is.
     * @return A String of the dayOfBirth, monthOfBirth and yearOfBirth concatenated with a forward slashes.
     */
    public String getDateOfBirth(){
        return dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth;
    }

    /**
     * - Method to add a friend, which would be someone else's profile to the friends list array.
      * @param p The profile that is to be added to the friends list.
     */
    public void addFriend(Profile p){
        friends.add(p);
    }

    /**
     * - Method to get the profile of a friend at index i.
     * @param i The index number of the friend profile that you want to return.
     * @return The profile of the corresponding element.
     */
    public Profile getFriend(int i){
        return friends.get(i);
    }

    /**
     * - Method to the the user how many elements are is the friends ArrayList.
     * @return The value that is the size of the ArrayList
     */
    public int numOfFriends(){
        return friends.size();
    }

    /**
     * - A toString method that prints out all the information of the profile.
     * @return String that holds all the information of the profile.
     */
    public String toString() {
        String returnString;

        returnString = "This is the profile of: \n" + firstName + " " + lastName + "\n";
        returnString = returnString + "Born on the: " + dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth + "\n";
        returnString = returnString + "Living in: " + curTown + ", " + curCountry + "\n";
        returnString = returnString + "Nationality: " + nationality + "\n";
        returnString = returnString + "Email Address: " + emailAddress + "\n";
        returnString = returnString + "Interests: " + "\n";

        for (String i : interests) {
            if(!(i == null)){
                returnString = returnString + i + "\n";
            }else{
                break;
            }
        }

        return returnString;
    }
}


