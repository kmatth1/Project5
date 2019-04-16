package songsort;

/**
 * Creates a Student object to hold a person's data
 * 
 * @author Nicklaus Gonda nicklausjgonda@vt.edu
 * @version 2019.16.04
 */
public class Student {
// Fields
    private String region;
    private String hobby;
    private String major;
    private boolean[] heardAnswer;
    private boolean[] likedAnswer;


    /**
     * The constructor for the student object
     * 
     * @param reg
     *            The student's region of living
     * @param hob
     *            The hobby of the student
     * @param maj
     *            The major of the student
     * @param heard
     *            The amount of heard
     * @param liked
     *            The amount of likes
     */
    public Student(
        String reg,
        String hob,
        String maj,
        boolean[] heard,
        boolean[] liked) {
        region = reg;
        hobby = hob;
        major = maj;
        heardAnswer = heard;
        likedAnswer = liked;
    }


    // Gettters
    /**
     * Gets the region of the student
     * 
     * @return String
     *         The region of the student
     */
    public String getRegion() {
        return region;
    }


    /**
     * Gets the hobby
     * 
     * @return String
     *         The hobby of the student
     */
    public String getHobby() {
        return hobby;
    }


    /**
     * Gets the major of the student
     * 
     * @return String
     *         The major of the student
     */
    public String getMajor() {
        return major;
    }


    /**
     * Returns whether the index student in the list is heard or not
     * 
     * @param n
     *            The index number
     * @return boolean
     *         Whether they were not heard
     */
    public boolean getHeardAnswer(int n) {
        return heardAnswer[n];
    }


    /**
     * Returns whether the index number likes the song or not
     * 
     * @param n
     *            The index number
     * @return boolean
     *         Whether or not the song was liked
     */
    public boolean getLikedAnswer(int n) {
        return likedAnswer[n];
    }


    /**
     * Returns the string phrase in the form "[region, hobby, major]"
     * 
     * @return String
     *         The string phrase
     */
    public String toString() {
        return "[" + region + ", " + hobby + ", " + major + "]";
    }
}
