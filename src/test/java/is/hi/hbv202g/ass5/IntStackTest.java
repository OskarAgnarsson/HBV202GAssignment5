package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntStackTest {
    private IntStack stack;
    @Before
    public void beforeTests() {
        IntStack stack = new IntStack();
    }
    @Test
    public void testNewStackIsNotFull() {
        assertFalse(stack.isFull());
    }
    @Test
    public void testFullStackIsFull() {
        for (int i = 0; i < stack.getCapacity(); i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }
    @Test
    public void testAlmostFullStackIsNotFull() {
        for (int i = 0; i < stack.getCapacity()-1; i++) {
            stack.push(i);
        }
        assertFalse(stack.isFull());
    }
    @Test
    public void testPopReturnsPushedValue(){
        stack.push(1);
        assertEquals(1,stack.pop());
    }
    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testPopEmptyStackException(){
        stack.pop();
    }
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPushFullStackException(){
        for (int i = 0; i < stack.getCapacity(); i++) {
            stack.push(i);
        }
        stack.push(1);
    }
    @Test
    public void testEmptyStackIsEmpty(){
        assertTrue(stack.isEmpty());
    }
    @Test
    public void testNotEmptyIsNotEmpty(){
        stack.push(1);
        assertFalse(stack.isEmpty());
    }


}
