/**
 * 
 */
package src.prj5;

import java.io.FileNotFoundException;

/**
 * @author noahh
 *
 */
public class ReaderTest 
{
    @SuppressWarnings("unused")
    public static void main (String[] args) throws 
    FileNotFoundException
    {
     // Test via looking at variables in debugger
        Reader reader = new Reader("SongList.csv", "MusicSurveyData.csv");
    }
}