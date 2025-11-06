package utilities;

/**
 * StackADT.java
 *
 * @author Team Sidon 
 * @version 1.0
 * 
 * <p>
 * The {@code StackADT} interface defines the basic operations for a
 * Last-In-First-Out (LIFO) stack data structure.
 * </p>
 *
 * @param <T> the type of elements held in this stack
 */
public interface StackADT<T> {

    /**
     * Adds the specified element to the top of this stack.
     *
     * <pre>
     * Precondition: The stack has been created and is not full.
     * Postcondition: The specified element is pushed onto the top of the stack.
     * </pre>
     *
     * @param element the element to push onto the stack
     * @throws IllegalStateException if the stack is full (for bounded implementations)
     */
    void push(T element);

    /**
     * Removes and returns the top element from this stack.
     *
     * <pre>
     * Precondition: The stack is not empty.
     * Postcondition: The top element is removed and returned.
     * </pre>
     *
     * @return the element removed from the top of the stack
     * @throws java.util.NoSuchElementException if the stack is empty
     */
    T pop();

    /**
     * Returns, but does not remove, the top element of this stack.
     *
     * <pre>
     * Precondition: The stack is not empty.
     * Postcondition: The stack remains unchanged.
     * </pre>
     *
     * @return the element currently on top of the stack
     * @throws java.util.NoSuchElementException if the stack is empty
     */
    T peek();

    /**
     * Determines whether this stack contains no elements.
     *
     * <pre>
     * Precondition: The stack has been initialized.
     * Postcondition: The state of the stack is unchanged.
     * </pre>
     *
     * @return {@code true} if this stack is empty; {@code false} otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of elements currently in this stack.
     *
     * <pre>
     * Precondition: The stack has been initialized.
     * Postcondition: The state of the stack is unchanged.
     * </pre>
     *
     * @return the number of elements in this stack
     */
    int size();
}
