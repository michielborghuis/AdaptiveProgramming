package fsm2;
import java.util.ArrayList;

public class Node {
    private String stateName;
    private ArrayList<Node> options;
    private ArrayList<String> keys;
    private boolean endNode;

    public Node(String st, ArrayList<String> ks, boolean end){
        stateName = st;
        keys = ks;
        chances = cha;
        endNode = end;
    }

    public void setOptions(ArrayList<Node> opt){
        options = opt;
    }

    public boolean getEndNode(){
        return endNode;
    }

    public String getStateName(){
        return stateName;
    }

    public Node returnStringNode(String let){
        if (keys.contains(let)){
            int index = keys.indexOf(let);
            return options.get(index);
        }else{
            return null;
        }
    }
    public String toString() {
        return stateName;
    }
}