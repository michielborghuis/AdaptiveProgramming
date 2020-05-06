package formatieveOpdracht2a;

import java.awt.geom.NoninvertibleTransformException;

public class Node {
    private String stateName;
    private Node nextStateA;
    private Node nextStateB;

    public Node (String st) {
        stateName = st;
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
