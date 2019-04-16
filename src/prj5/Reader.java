/*
 * Virginia Tech Honor Code Pledge:
 *
 * As a Hokie, I will conduct myself with honor
 * and integrity at all times.
 * I will not lie, cheat, or steal, nor will I
 * accept the actions of those who do.
 * -- CS Student (cstudent)
 */
package prj5;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Reads and holds data from two input files. One
 * file holds survey information about students and 
 * the music they listen to. Another holds information
 * about the songs in the same survey.
 *
 * @author Noah Hefner (nhefner)
 * @version 04/15/2019
 */
public class Reader 
{
    /**
     * Number of songs in the survey.
     */
    public static final int NUM_SONGS = 72;
    
    // Need song and student classes
    private LinkedList<Student> students;
    private LinkedList<Song> songs;
    
    /**
     * Creates a new Reader object.
     * 
     * @param songFileName Name of the file with student
     * survey information.
     * @param studentFileName Name of the file with song
     * information.
     */
    public Reader(String songFileName, String studentFileName)
    {
        // initialize private attributes with method calls
        this.songs = this.readSong(songFileName);
        this.students = this.readStudent(studentFileName);
    } // end constructor
    
    /**
     * Transfers the information from the student file into
     * a LinkedList.
     * 
     * @param studentFileName Name of file with student
     * survey information.
     * @return A linked list of Student objects.
     */
    private LinkedList<Student> readStudent(String studentFileName)
    {
        LinkedList<Student> studentList = new LinkedList<Student>();
        
        File studentFile = new File(studentFileName);
        Scanner studentScanner = new Scanner(studentFile);
        
        // Move over first line because its just column labels
        studentScanner.nextLine();
        
        while (studentScanner.hasNextLine())
        {
            String temp = studentScanner.nextLine();
            String[] info = temp.split(", *");
            
            String major = info[2];
            String region = info[3];
            String hobby = info[4];
            
            boolean[] heardAnswers = new boolean[Reader.NUM_SONGS];
            boolean[] likedAnswers = new boolean[Reader.NUM_SONGS];
            
            int heardCount = 0;
            int likedCount = 0;
            
            // Build heard and liked lists
            for (int i = 5; i < (Reader.NUM_SONGS * 2) + 5; i++)
            {
                boolean answer;
                
                if (info[i].equals("Yes"))
                {
                    answer = true;
                }
                else
                {
                    answer = false;
                }
                
                if (i % 2 == 0)
                {
                    likedAnswers[likedCount] = answer;
                    likedCount += 1;
                }
                else
                {
                    heardAnswers[heardCount] = answer;
                    heardCount += 1;
                } // end if
            } // end for
            
            // Create new student and add to return list
            Student newStudent = new Student(region, hobby, major, 
                    heardAnswers, likedAnswers);
            studentList.add(newStudent);
        } // end while
        return studentList;
    } // end readStudent
    
    /**
     * Reads the information from the song file and
     * puts it in a LinkedList.
     * 
     * @param songFileName Name of the file with student
     * survey information.
     * @return A LinkedList of song objects.
     */
    private LinkedList<Song> readSong(String songFileName)
    {
        LinkedList<Song> songList = new LinkedList<Song>();
        
        File songFile = new File(songFileName);
        Scanner songScanner = new Scanner(songFile);
        
        // Move over first line because its just column labels
        songScanner.nextLine();
        
        int count = 0;
        
        while (songScanner.hasNextLine() && count < Reader.NUM_SONGS)
        {
            String temp = songScanner.nextLine();
            String[] info = temp.split(", *");
            
            String title = info[0];
            String artist = info[1];
            String year = info[2];
            String genre = info[3];
            
            // Create new song and add to return list
            Song newSong = new Song(title, artist, Integer.parseInt(year), genre);
            songList.add(newSong);
            count += 1;
        } // end while
        return songList;
    } // end readSong
} // end Reader