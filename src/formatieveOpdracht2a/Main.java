package formatieveOpdracht2a;

public class Main {
    public static void main(String[] args){
        Node n0 = new Node("s0");
        Node n1 = new Node("s1");
        Node n2 = new Node("s2");
        Node n3 = new Node("s3");
        n3.setNextStateA(n3);
        n3.setNextStateB(n0);
        n2.setNextStateA(n2);
        n2.setNextStateB(n3);
        n1.setNextStateA(n1);
        n1.setNextStateB(n2);
        n0.setNextStateA(n2);
        n0.setNextStateB(n1);
        FiniteStateMachine f1 = new FiniteStateMachine(new String[]{"B", "A", "A", "B"}, n0);
        for (Node n: f1.toNode()){
            System.out.println(n.getStateName());
        }
    }
}
