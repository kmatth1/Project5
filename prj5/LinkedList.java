package prj5;

import list.ListInterface;

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


public class LinkedList<T> 
{
    private T head;
    private Node nextNode;
    private int numberOfEntries;

    /**
     * LinkedList constructor
     */
    public LinkedList()
    {
        numberOfEntries = 0;
    }

    @Override
    public void add(T newEntry)
    {
        Node newNode = new Node(newEntry);

        if (isEmpty())
            firstNode = newNode;
        else
        {
            Node lastNode = getNodeAt(numberOfEntries);
            lastNode.setNextNode(newNode);
        }

        numberOfEntries++;
    }

    @Override
    public void add(int newPosition, T newEntry)
    {
        if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1))
        {
            Node newNode = new Node(newEntry);

            if (newPosition == 1)
            {
                newNode.setNextNode(firstNode);
                firstNode = newNode;
            }
            else
            {
            Node nodeBefore = getNodeAt(newPosition - 1);
            Node nodeAfter = nodeBefore.getNextNode();
                newNode.setNextNode(nodeAfter);
                nodeBefore.setNextNode(newNode);
            }

            numberOfEntries++;
        }
    }

    @Override
    public void clear()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean contains(T arg0)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public T getEntry(int arg0)
    {
        // TODO Auto-generated method stub
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries))
        {
            assert !isEmpty();
            return getNodeAt(givenPosition).getData();
        }
        else
        {
            throw new IndexOutOfBoundsException("Illegal position given to getEntry operation.");
        }
        return null;
    }

    @Override
    public int getLength()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public T remove(int givenPosition)
    {
        T result = null;                           // Return value

        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries))
        {
            assert !isEmpty();

            if (givenPosition == 1)                 // Case 1: Remove first entry
            {
                result = firstNode.getData();        // Save entry to be removed
                firstNode = firstNode.getNextNode(); // Remove entry
            }
            else                                    // Case 2: Not first entry
            {
                Node nodeBefore = getNodeAt(givenPosition - 1);
                Node nodeToRemove = nodeBefore.getNextNode();
                result = nodeToRemove.getData();     // Save entry to be removed
                Node nodeAfter = nodeToRemove.getNextNode();
                nodeBefore.setNextNode(nodeAfter);   // Remove entry
            } // end if

            numberOfEntries--;                      // Update count
            return result;                          // Return removed entry
        }
        else
        {
            throw new IndexOutOfBoundsException("Illegal position "
                    + "given to remove operation.");
        }
        return null;
    }

    @Override
    public T replace(int givenPosition, T newEntry)
    {
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries))
        {
            assert !isEmpty();

            Node desiredNode = getNodeAt(givenPosition);
            T originalEntry = desiredNode.getData();
                desiredNode.setData(newEntry);
            return originalEntry;
        }
        else
        {
           throw new IndexOutOfBoundsException("Illegal position given to "
                   + "replace operation.");
        }
        return null;
    }

    @Override
    public Object[] toArray()
    {
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
}
