package shopstyle.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerStackTest {

    @Test
    public void testIsEmptyWhenEmpty() {
        Stack<Integer> stack = new IntegerStack();
        assertTrue("stack should be empty", stack.isEmpty());
    }

    @Test
    public void testIsEmptyWhenNonEmpty() {
        Stack<Integer> stack = new IntegerStack();
        stack.push(0);
        assertFalse("should not be empty", stack.isEmpty());
    }

    @Test
    public void testPeekWhenEmpty() {
        Stack<Integer> stack = new IntegerStack();
        assertFalse("should return an empty optional", stack.peek().isPresent());
    }

    @Test
    public void testPeekWhenNonEmpty() {
        Stack<Integer> stack = new IntegerStack();
        stack.push(0);
        assertEquals("should return the most recently pushed entry", Integer.valueOf(0),
                stack.peek().get());
    }

    @Test
    public void testPeekNonMutating() {
        Stack<Integer> stack = new IntegerStack();
        stack.push(0);
        assertFalse("peek should not mutate the stack", stack.isEmpty());
    }

    @Test
    public void testPopWhenEmpty() {
        Stack<Integer> stack = new IntegerStack();
        assertFalse("should return an empty optional", stack.pop().isPresent());
    }

    @Test
    public void testPopWhenNonEmpty() {
        Stack<Integer> stack = new IntegerStack();
        stack.push(0);
        assertEquals("should return the most recently pushed entry", Integer.valueOf(0),
                stack.pop().get());
    }

    @Test
    public void testPopRemovesEntry() {
        Stack<Integer> stack = new IntegerStack();
        stack.push(0);
        stack.pop();
        assertTrue("pop should remove an entry", stack.isEmpty());
    }
}