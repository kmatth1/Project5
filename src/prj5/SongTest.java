package prj5;

import student.TestCase;

/**
 * Tests the song class
 * 
 * @author Nicklaus Gonda nicklausjgonda@vt.edu
 * @version 2019.16.04
 */
public class SongTest extends TestCase {
// Fields
    private Song burr;


    /**
     * Sets up the fields for the methods
     */
    public void setUp() {
        burr = new Song("Hannibal Burress", "rap", 2018, "Morpheus Rap");
    }


    /**
     * Tests the getter methods
     */
    public void testGetters() {
        assertEquals("Hannibal Burress", burr.getArtistName());
        assertEquals("rap", burr.getGenre());
        assertEquals(2018, burr.getDate());
        assertEquals("Morpheus Rap", burr.getTitle());
    }


    /**
     * Tests the toString method
     */
    public void testToString() {
        assertEquals("[Hannibal Burress, rap, 2018, Morpheus Rap]", burr
            .toString());
    }
}
