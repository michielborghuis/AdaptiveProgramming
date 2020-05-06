package formatieveOpdracht2a;

public class Node {
    private String stateName;
    private String nextStateA;
    private String nextStateB;

    public Node (String st, String nsA, String nsB) {
        stateName = st;
        nextStateA = nsA;
        nextStateB = nsB;
    }

    public String getState(){
        return stateName;
    }
    public String getNextStateA(){
        return nextStateA;
    }
    public String getNextStateB(){
        return nextStateB;
    }

    @Override
    public String ToString(){
        return
    }
}
