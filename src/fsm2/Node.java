package fsm2;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Node {
    private String stateName;
    private ArrayList<Node> options;
    private ArrayList<String> keys;
    private ArrayList<Double> chances;
    private boolean endNode;

    public Node(String st, boolean end){
        stateName = st;
        endNode = end;
    }

    public void setKeys(ArrayList<String> ks){
        keys = ks;
    }
    public void setOptions(ArrayList<Node> opt){
        options = opt;
    }

    public void setChances(ArrayList<Double> cha){
        chances = cha;
    }

    public ArrayList<Double> getChances(){
        return chances;
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
    public Node returnNodeChance(int i){
        return options.get(i);
    }

    public String toString() {
        return stateName;
    }
}