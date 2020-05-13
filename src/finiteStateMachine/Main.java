package finiteStateMachine;

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
        System.out.println(f1.getNodes());


        Node d1 = new Node("dice1", null, null, true);
        Node d2 = new Node("dice2", null, null,true);
        Node d3 = new Node("dice3", null, null, true);
        Node d4 = new Node("dice4", null, null, true);
        Node d5 = new Node("dice5", null, null, true);
        Node d6 = new Node("dice6", null, null, true);
        Node n3 = new Node("n3", null, d1, false);
        Node n4 = new Node("n4", d2, d3, false);
        Node n5 = new Node("n5", d4, d5, false);
        Node n6 = new Node("n6", d6, null, false);
        Node n1 = new Node("n1", n3, n4, false);
        Node n2 = new Node("n2", n5, n6, false);
        Node n0 = new Node("n0", n1, n2, false);
        n3.setNextStateA(n1);
        n6.setNextStateB(n2);
        FiniteStateMachine f2 = new FiniteStateMachine(null, n0);
        System.out.println(f2.getString());


        Node dd1 = new Node("dice1", null, null, true);
        Node dd2 = new Node("dice2", null, null, true);
        Node dd3 = new Node("dice3", null, null, true);
        Node dd4 = new Node("dice4", null, null, true);
        Node dd5 = new Node("dice5", null, null, true);
        Node dd6 = new Node("dice6", null, null, true);
        Node dd7 = new Node("dice7", null, null, true);
        Node dd8 = new Node("dice8", null, null, true);
        Node nn6 = new Node("s6", dd7, dd8, false);
        Node nn5 = new Node("s5", dd5, dd6, false);
        Node nn4 = new Node("s4", dd3, dd4, false);
        Node nn3 = new Node("s3", dd1, dd2, false);
        Node nn2 = new Node("s2", nn5, nn6, false);
        Node nn1 = new Node("s1", nn3, nn4, false);
        Node nn0 = new Node("s0", nn1, nn2, false);
        FiniteStateMachine f3 = new FiniteStateMachine(null, nn0);
        System.out.println(f3.getString());
    }
}
