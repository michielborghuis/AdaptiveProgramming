package finiteStateMachine;
import java.util.ArrayList;
import java.util.Random;

public class FiniteStateMachine {
    private String[] sequence;
    private Node currentNode;
    private ArrayList<Node> nodes = new ArrayList<>();

    public FiniteStateMachine(String[] seq, Node nd){
        sequence = seq;
        currentNode = nd;
    }

    public ArrayList<Node> getNodes() {
        int length = sequence.length;
        nodes.add(0, currentNode);
        Node currentNode = nodes.get(0);
        for (int i = 0; i < length; i++) {
            if(currentNode.nodeReturn(sequence[i]) != null) {
                Node newNode = currentNode.nodeReturn(sequence[i]);
                nodes.add(i + 1, newNode);
                currentNode = newNode;
            }
            else{return nodes;}
        }
        return nodes;
    }

    public String getString(){
        nodes.add(0, currentNode);
        Node currentNode = nodes.get(0);
        Random rand = new Random();
        while (currentNode.getEndNode() != true){
            int n = rand.nextInt(2);
            String s;
            if (n==0){ s = "A"; }
            else{ s = "B"; }
            Node newNode = currentNode.nodeReturn(s);
            currentNode = newNode;
        }
        return currentNode.getStateName();
    }
}
