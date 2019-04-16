package prj5;
/**
 * Reads and holds data from two input files. One
 * file holds survey information about students and 
 * the music they listen to. Another holds information
 * about the songs in the same survey.
 *
 * @author Matthew Krivansky (kmatth1)
 * @version 04/15/2019
 * @param <T>
 */

import list.ListInterface;

public class LinkedList<T> implements ListInterface<T>
{
    private T head;
    private Node nextNode;
    
    /**
     * LinkedList constructor
     * @param <T>
     */
    public LinkedList()
    {
        
    }
<<<<<<< HEAD
<<<<<<< HEAD

    @Override
    public void add(T arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void add(int arg0, T arg1) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean contains(T arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public T getEntry(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getLength() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public T remove(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T replace(int arg0, T arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }
    
    private class Node
    {
        private T data;
        private Node next;
        
        private Node(T dataPortion)
        {
           data = dataPortion;
           next = null;   
        }
        
        private Node(T dataPortion, Node nextNode)
        {
           data = dataPortion;
           next = nextNode;   
        }
        
        private T getData()
        {
           return data;
        }
        
        private void setData(T newData)
        {
           data = newData;
        }
        
        private Node getNextNode()
        {
           return next;
        }
        
        private void setNextNode(Node nextNode)
        {
           next = nextNode;
        }
    }
    
=======
>>>>>>> 92b7f5a1342adf8455841104ad031bd2c20b0df8
=======
>>>>>>> 92b7f5a1342adf8455841104ad031bd2c20b0df8
}
