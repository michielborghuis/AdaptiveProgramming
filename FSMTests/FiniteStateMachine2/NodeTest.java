package FiniteStateMachine2;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class NodeTest {
    Node nodeTest1 = new Node("test1", false);
    Node nodeTest2 = new Node("test2", false);

    Node n1 = new Node("s1", false);
    Node n2 = new Node("s2", false);
    Node n3 = new Node("s3", false);

    Node d7 = new Node("dice7", true);


    ArrayList<String> keyTest = new ArrayList<>(Arrays.asList("A", "B", "C"));
    ArrayList<Node> nodesTest = new ArrayList<>(Arrays.asList(n1, n2, n3));
    ArrayList<Double> chancesTest = new ArrayList<>(Arrays.asList(0.4, 0.4, 0.2));


    @Test
    public void setKeys() {
        nodeTest1.setKeys(keyTest);
    }

    @Test
    public void setOptions() {
        nodeTest1.setOptions(nodesTest);
    }

    @Test
    public void setChances() {
        nodeTest1.setChances(chancesTest);
    }

    @Test
    public void getChances() {
        nodeTest1.setChances(chancesTest);
        assertEquals(chancesTest, nodeTest1.getChances());
    }

    @Test
    public void getEndNode() {
        assertFalse(n1.getEndNode());
        assertTrue(d7.getEndNode());
    }

    @Test
    public void getStateName() {
        assertEquals("test1", nodeTest1.getStateName());
    }

    @Test
    public void returnStringNode() {
        nodeTest1.setKeys(keyTest);
        nodeTest1.setOptions(nodesTest);
        assertEquals(n2, nodeTest1.returnStringNode("B"));

        assertNull(nodeTest1.returnStringNode("D"));
    }

    @Test
    public void returnNodeChance() {
        nodeTest2.setChances(chancesTest);
        nodeTest2.setOptions(nodesTest);
        assertEquals(n3, nodeTest2.returnNodeChance(2));
    }
}