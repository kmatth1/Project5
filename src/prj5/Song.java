package songsort;

/**
 * Creates the song object to hold the data on the songs
 * 
 * @author Nicklaus Gonda nicklausjgonda@vt.edu
 * @version 2019.16.04
 */
public class Song {
// Fields
    private String artistName;
    private String genre;
    private int date;
    private String title;


    /**
     * Creates the song object constructor
     * 
     * @param art
     *            The name of the artist
     * @param gen
     *            The genre of the song
     * @param dat
     *            The date that the song was made
     * @param ti
     *            The title of the song
     */
    public Song(String art, String gen, int dat, String ti) {
        artistName = art;
        genre = gen;
        date = dat;
        title = ti;
    }


    // Getters
    /**
     * Returns the artistName
     * 
     * @return String
     *         The artist name
     */
    public String getArtistName() {
        return artistName;
    }


    /**
     * Returns the genre
     * 
     * @return String
     *         The genre
     */
    public String getGenre() {
        return genre;
    }


    /**
     * Returns the date of the song's creation
     * 
     * @return int
     *         The date
     */
    public int getDate() {
        return date;
    }


    /**
     * Returns the title of the song
     * 
     * @return String
     *         The title
     */
    public String getTitle() {
        return title;
    }


    /**
     * The string phrase of the song, returned as "[artistName, genre, date,
     * title]"
     * 
     * @return String
     *         The string phrase
     */
    public String toString() {
        return "[" + artistName + ", " + genre + ", " + date + ", " + title
            + "]";
    }
}
