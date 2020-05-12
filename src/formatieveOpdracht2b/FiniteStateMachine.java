package formatieveOpdracht2b;
import java.util.ArrayList;
import java.util.Random;

public class FiniteStateMachine {
    private Node currentNode;
    private ArrayList<Node> nodes = new ArrayList<>();

    public FiniteStateMachine(Node nd){
        currentNode = nd;
    }

    public String toNode(){
        nodes.add(0, currentNode);
        Node currentNode = nodes.get(0);
        Random rand = new Random();
        while (currentNode.getEndNode() != true){
            int n = rand.nextInt(2);
            Node newNode = currentNode.nodeReturn(n);
            currentNode = newNode;
        }
        return currentNode.getStateName();
    }
}

