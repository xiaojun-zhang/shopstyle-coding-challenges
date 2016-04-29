package shopstyle.example;

import java.util.Optional;

interface Stack<T> {

    /**
     *  Indicates whether or not the stack is empty.
     *
     *  @return true if the stack is empty, otherwise false
     */
    boolean isEmpty();

    /**
     *  Returns the value on the top of the stack, without modifying the stack.
     *
     *  @return an optional of the value on the top of the stack
     */
    Optional<T> peek();

    /**
     *  Removes the top value from the stack and returns it.
     *
     *  @return an optional of the value at the top of the stack
     */
    Optional<T> pop();

    /**
     *  Adds a value to the top of the stack.
     *
     *  <p>This operation may require resizing the stack's storage.</p>
     *
     *  @param val the value to insert at the top of the stack
     */
    void push(T val);
}