package formatieveOpdracht2b;

public class Node {
    private String stateName;
    private Node nextStateA;
    private Node nextStateB;
    private boolean endNode;

    public Node (String st, boolean b){
        stateName = st;
        endNode = b;
    }
    public void setNextStateA(Node n){
        nextStateA = n;
    }
    public void setNextStateB(Node n){
        nextStateB = n;
    }
    public boolean getEndNode(){
        return endNode;
    }
    public String getStateName(){
        return stateName;
    }
    public Node nodeReturn(int i){
        if (i == 0){
            return nextStateA;
        }
        if(i == 1){
            return nextStateB;
        }
        else{
            return null;
        }
    }
}