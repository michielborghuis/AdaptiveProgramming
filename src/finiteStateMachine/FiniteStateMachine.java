package finiteStateMachine;
import java.util.ArrayList;
import java.util.Random;

public class FiniteStateMachine {
    private Node currentNode;
    private ArrayList<Node> nodes = new ArrayList<>();

    public FiniteStateMachine(Node nd){
        currentNode = nd;
    }
}
