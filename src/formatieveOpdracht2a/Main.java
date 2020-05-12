package formatieveOpdracht2a;

public class Main {
    public static void main(String[] args){
        Node s3 = new Node("s3", null, null, false);
        Node s2 = new Node("s2", null, s3, false);
        Node s1 = new Node("s1", null, s2, false);
        Node s0 = new Node("s0", s2, s1, false);

        s3.setNextStateA(s3);
        s3.setNextStateB(s0);
        s2.setNextStateB(s3);
        s1.setNextStateA(s1);
        FiniteStateMachine f1 = new FiniteStateMachine(new String[]{"B", "A", "A", "B", "B", "B", "A"}, s0);
        for (Node n: f1.toNode()){
            System.out.println(n.getStateName());
        }
    }
}
