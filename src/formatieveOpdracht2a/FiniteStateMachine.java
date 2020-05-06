package formatieveOpdracht2a;
import java.util.ArrayList;

public class FiniteStateMachine {
    private String[] sequence;
    private Node currentNode;

    public FiniteStateMachine(String[] seq, Node nd){
        sequence = seq;
        currentNode = nd;
    }

    public ArrayList<Node> toNode(){
        int length = sequence.length;
        ArrayList<Node> nodes = new ArrayList<Node>();
        nodes.add(0, currentNode);
        Node currentNode = nodes.get(0);
        int i;
        for (i = 0; i < length; i++){
            Node newNode = currentNode.nodeReturn(sequence[i]);
            nodes.add(i+1, newNode);
            currentNode = newNode;
            }
        return nodes;
        }
    }