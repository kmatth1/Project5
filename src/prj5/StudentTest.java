package src.prj5;

import student.TestCase;

/**
 * Tests the student class
 * 
 * @author Nicklaus Gonda nicklausjgonda@vt.edu
 * @version 2019.16.04
 */
public class StudentTest extends TestCase {
// Fields
    private Student chad;
    private boolean[] hear;
    private boolean[] like;


    /**
     * Sets up the fields for the methods
     */
    public void setUp() {
        hear = new boolean[5];
        like = new boolean[5];
        hear[1] = false;
        like[1] = false;
        hear[3] = true;
        like[3] = true;
        chad = new Student("Northern", "Weight-Lifting", "Business", hear,
            like);
    }


    /**
     * Tests the getters of the class
     */
    public void testGetters() {
        assertEquals("Northern", chad.getRegion());
        assertEquals("Weight-Lifting", chad.getHobby());
        assertEquals("Business", chad.getMajor());
        assertTrue(chad.getHeardAnswer(3));
        assertTrue(chad.getLikedAnswer(3));
        assertFalse(chad.getHeardAnswer(1));
        assertFalse(chad.getLikedAnswer(1));
    }


    /**
     * Tests the toString method
     */
    public void testToString() {
        assertEquals("[Northern, Weight-Lifting, Business]", chad.toString());
    }
}
