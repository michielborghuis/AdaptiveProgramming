package finiteStateMachine;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {
    Node d2 = new Node("dice2", null, null, true);
    Node d3 = new Node("dice3", null, null, true);
    Node n4 = new Node("n4", d2, d3, false);

    @Test
    public void getEndNode() {
        assertTrue(d2.getEndNode());
        assertFalse(n4.getEndNode());

    }

    @Test
    public void getStateName() {
        assertEquals("dice3", d3.getStateName());
    }

    @Test
    public void nodeReturn() {
        assertEquals(d2, n4.nodeReturn("A"));
    }
}