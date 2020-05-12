package formatieveOpdracht2a;


public class Node {
    private String stateName;
    private Node nextStateA;
    private Node nextStateB;
    private boolean endState;

    public Node (String st, Node nsA, Node nsB, boolean b) {
        stateName = st;
        nextStateA = nsA;
        nextStateB = nsB;
        endState = b;
    }
    public void setNextStateA(Node n){
        nextStateA = n;
    }

    public void setNextStateB(Node n) {
        nextStateB = n;
    }
    public String getStateName(){
        return stateName;
    }

    public Node nodeReturn(String s){
        if (s.equals("A")){
            return nextStateA;
        }
        if (s.equals("B")) {
            return nextStateB;
        }
        else{
            return null;
        }
    }
}
