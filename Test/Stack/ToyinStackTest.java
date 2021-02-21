package Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ToyinStackTest {

    ToyinStack toyinStack;

    @BeforeEach
      void setUp() {
        toyinStack = new ToyinStack(5);
    }


    @Test
    void toyinStack_IsEmpty(){
        toyinStack = new ToyinStack(3);
        assertTrue(toyinStack.is_Empty());
    }

    @Test
    void anItem_CanBePushedToToyinStack(){
        toyinStack.push(5);
        assertEquals(5, toyinStack.peek());
    }

    @Test
    void PushUntoAStackTwice_andPopOnce(){
        toyinStack.push(7);
        toyinStack.push(13);
        assertEquals(13, toyinStack.pop());
        assertEquals(7, toyinStack.peek());
    }

    @Test
    void pushedMaxElements_StackShouldBeFull(){
        toyinStack = new ToyinStack(2);
        toyinStack.push(7);
        toyinStack.push(13);
        assertTrue(toyinStack.isFull());
    }

    @Test
    void throwStackOverFlowException_ifUserTriesToPushMoreItemAfterStackIsFull(){
        toyinStack = new ToyinStack(2);
        toyinStack.push(7);
        toyinStack.push(13);
        assertTrue(toyinStack.isFull());
        assertThrows(ToyinStack.StackOverflowException.class, ()-> toyinStack.push(25));
    }

    @Test
    void throwStackUnderflowException_ifUserTriesToPopAnItemWhenStackIsEmpty(){
        toyinStack = new ToyinStack(2);
        toyinStack.push(7);
        toyinStack.push(1);
        toyinStack.pop();
        toyinStack.pop();
        assertTrue(toyinStack.is_Empty());
        assertThrows(ToyinStack.StackUnderflowException.class, ()-> toyinStack.pop());
    }

    @Test
    void throwStackUnderflowException_ifUserTriesToPeekWhenStackIsEmpty(){
        assertThrows(ToyinStack.StackUnderflowException.class, ()-> toyinStack.peek());
    }

}
