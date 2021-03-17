
import java.util.Arrays;
import java.util.AbstractList;

/**
 * This class implements some of the methods of the Java
 *  ArrayList class.
 *  @author Jay An
 */
public class KWArrayList<E> extends AbstractList<E>    
{
    // Data Fields	
    
    /** The default initial capacity */
    private static final int INITIAL_CAPACITY = 10;
    /** The underlying data array */
    private E[] theData;
    /** The current size */
    private int size = 0;
    /** The current capacity */
    private int capacity = 0;

    /**
     * Construct an empty KWArrayList with the default
     * initial capacity
     */
    public KWArrayList() {
        capacity = INITIAL_CAPACITY;
        theData = (E[]) new Object[capacity];
    }

  
     /* Construct an empty KWArrayList with a specified initial capacity
     * @param capacity The initial capacity  
     */
    public KWArrayList(int capacity) {
    	this.capacity = capacity;
    	E[] theData = (E[]) new Object[capacity];
    }	

     /* Appends the specified element to the end of this list.
	 * @param string 
     * 
     * @param theEntry - The value to be inserted
     * @throws ArrayIndexOUtOfBoundsException if index is
     *         less than zero or greater than size
     */ 
    public boolean add(String string, String string2) {
    	if (size == capacity) {
    		reallocate();
    	}
    	theData[size] = (E) (string + " " + string2);
    	size++;
    	return true;
    }
    
    public boolean add(E anEntry) {
    	if (size == capacity) {
    		reallocate();
    	}
    	theData[size] = anEntry;
    	size++;
    	return true;
    }
    
	 
    /**
     * Get a value in the array based on its index.
     * @param index - The index of the item desired
     * @return The contents of the array at that index
     * @throws ArrayIndexOutOfBoundsException - if the index
     *         is negative or if it is greater than or equal to the
     *         current size
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        
        return theData[index];
    }

 
     /* Set the value in the array based on its index.
     * @param index - The index of the item desired
     * @param newValue - The new value to store at this position
     * @return The old value at this position
     * @throws ArrayIndexOutOfBoundsException - if the index
     *         is negative or if it is greater than or equal to the
     *         current size
     */
    public E set(int index, E newValue) {
    	if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    	
    	E oldValue = theData[index];
    	theData[index] = newValue;
    	return  oldValue;
    }

    /* Add an entry based on its index
     * @param index - The index of the entry to be added
     * @return The value added
     * @throws ArrayIndexOutOfBoundsException - if the index
     *         is negative or if it is greater than or equal to the
     *         current size
     */
    public void add(int index, E newValue) {
    	if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    	size++;
    	if(size == capacity) {
    		reallocate();
    	}
    	for(int i = size; i > index; i--) {
    		theData[i] = theData[i-1];
    	}
    	theData[index] = newValue;
    } 
    
    
     /* Remove an entry based on its index
     * @param index - The index of the entry to be removed
     * @return The value removed
     * @throws ArrayIndexOutOfBoundsException - if the index
     *         is negative or if it is greater than or equal to the
     *         current size
     */
    public E remove(int index) {
    	if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

    	E returnValue = theData[index];
    	
    	for(int i = index + 1; i < size; i++) {
    		theData[i - 1] = theData[i];
    	}
    	size--;
    	return returnValue;
    }
	
	
	
	
	/*	Removes middle object and re-inserts it at the end 
	*	@return E object removed and re-inserted
	*/
	public E removeMiddleInsertEnd() {
		int midPosition = size/2;
		E middle = remove(midPosition);
		add(middle);
		return middle;
	} 


    /**
     * Allocate a new array to hold the directory
     */
    private void reallocate() {
        capacity = 2 * capacity;
        theData = Arrays.copyOf(theData, capacity);
    }

    /**
     * Get the current size of the array
     * @return The current size of the array
     */
    public int size() {
        return size;
    }
    
     /* Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element
     * @param item The object to search for
     * @returns The index of the first occurrence of the specified item
     *          or -1 if this list does not contain the element
     */
    public int indexOf(Object item) {

		
		if(index < size) {
			for(int i = 0; i < size; i++) { // Searches the array for specified item
				if(item == theData[i]) { 
					index = i;	 
					return index; 
				} 
			}		
		} 
		return index;
		
    }
 
}
