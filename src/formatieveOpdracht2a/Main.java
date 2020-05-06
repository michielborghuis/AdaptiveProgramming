package formatieveOpdracht2a;

public class Main {
    public static void main(String[] args){
        Node s0 = new Node("s0", "s2", "s1");
        Node s1 = new Node("s1", "s1", "s2");
        Node s2 = new Node("s2", "s2", "s3");
        Node s3 = new Node("s3", "s3", "s0");
        FiniteStateMachine f1 = new FiniteStateMachine(("ABBA"));

    }
}
