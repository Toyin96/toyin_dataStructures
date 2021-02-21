package Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ToyinQueueTest {

    ToyinQueue toyinQueue;

    @BeforeEach
    void setUp() {

        toyinQueue = new ToyinQueue(3);
    }


    @Test
    void queue_isInitiallySetToEmpty(){
        ToyinQueue toyinQueue = new ToyinQueue(5);
        assertTrue(toyinQueue.isEmpty());
    }

    @Test
    void enqueue_OneElementAndPeek(){
        toyinQueue.enqueue(5);
        assertEquals(5, toyinQueue.peek());
    }

    @Test
    void enqueue_twoElementsAndViewFrontOfQueue(){
        toyinQueue.enqueue(12);
        toyinQueue.enqueue(9);
        assertEquals(12, toyinQueue.viewFront());
        System.out.println(toyinQueue.viewFront());
    }

//    @Test
//    void enqueue_twoElementsAndDequeueOneElement(){
//        toyinQueue.enqueue(14);
//        toyinQueue.enqueue(3);
//        toyinQueue.dequeue();
//        assertEquals(3, toyinQueue.peek());
//    }


}
