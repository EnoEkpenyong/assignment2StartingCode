package utilities;

/**
 * QueueADT.java
 *
 * @author Team Sidon
 * @version 1.0
 * 
 * <p>
 * The {@code QueueADT} interface defines the basic operations for a
 * First-In-First-Out (FIFO) queue data structure.
 * </p>
 *
 * @param <T> the type of elements held in this queue
 */
public interface QueueADT<T> {

    /**
     * Inserts the specified element at the rear of this queue.
     *
     * <pre>
     * Precondition: The queue has been created and is not full.
     * Postcondition: The specified element is added to the rear of the queue.
     * </pre>
     *
     * @param element the element to be enqueued
     * @throws IllegalStateException if the queue is full (for bounded implementations)
     */
    void enqueue(T element);

    /**
     * Removes and returns the element at the front of this queue.
     *
     * <pre>
     * Precondition: The queue is not empty.
     * Postcondition: The front element is removed and returned.
     * </pre>
     *
     * @return the element removed from the front of the queue
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    T dequeue();

    /**
     * Returns, but does not remove, the element at the front of this queue.
     *
     * <pre>
     * Precondition: The queue is not empty.
     * Postcondition: The queue remains unchanged.
     * </pre>
     *
     * @return the element at the front of the queue
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    T peek();

    /**
     * Determines whether this queue contains no elements.
     *
     * <pre>
     * Precondition: The queue has been initialized.
     * Postcondition: The state of the queue is unchanged.
     * </pre>
     *
     * @return {@code true} if this queue is empty; {@code false} otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of elements currently in this queue.
     *
     * <pre>
     * Precondition: The queue has been initialized.
     * Postcondition: The state of the queue is unchanged.
     * </pre>
     *
     * @return the number of elements in this queue
     */
    int size();
}
