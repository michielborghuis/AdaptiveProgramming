package finiteStateMachine;
import java.util.ArrayList;
import java.util.Random;

public class FiniteStateMachine {
    private String[] sequence;  //de letters die de machine leest om de volgende state te kiezen
    private Node currentNode;   //de node waarin de machine zich op het moment bevind
    private ArrayList<Node> nodes = new ArrayList<>();  //lijst waaraan alle nodes worden toegevoegd die langs worden gegaan

    public FiniteStateMachine(String[] seq, Node nd) {
        sequence = seq;
        currentNode = nd;
    }

    public ArrayList<Node> getNodes() { //returnt array van states waar de machine doorheen gaat
        nodes.add(0, currentNode);  //voegt de eerste node(beginstate) toe
        Node currentNode = nodes.get(0);
        for (int i = 0; i < sequence.length; i++) { //gaat alle letters in de meegegeven lijst af
            if(currentNode.nodeReturn(sequence[i]) != null) {   //controleert of de node een volgende node heeft voor de gegeven letter
                Node newNode = currentNode.nodeReturn(sequence[i]);
                nodes.add(i + 1, newNode);
                currentNode = newNode;
            }
            else{return nodes;}
        }
        return nodes;
    }

    public String getString(){ //returnt de eindstate(kant van dobbelsteen) waar de dobbelsteen op landt
        nodes.add(0, currentNode);  //voegt de eerste node(beginstate) toe
        Node currentNode = nodes.get(0);
        Random rand = new Random();
        while (currentNode.getEndNode() != true){ //gaat naar de volgende state zolang de huidige state geen eindstate(kan van dobbelsteen) is
            int n = rand.nextInt(2); //genereert een getal 0 of 1, om een kans van 50% te geven
            String s;
            if (n==0){ s = "A"; }
            else{ s = "B"; }
            Node newNode = currentNode.nodeReturn(s);
            currentNode = newNode;
        }
        return currentNode.getStateName();
    }
}