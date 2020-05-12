package formatieveOpdracht2b;

public class Main {
    public static void main(String[] args) {
        Node n0 = new Node("s0", false);
        Node n1 = new Node("s1", false);
        Node n2 = new Node("s2", false);
        Node n3 = new Node("s3", false);
        Node n4 = new Node("s4", false);
        Node n5 = new Node("s5", false);
        Node n6 = new Node("s6", false);
        Node d1 = new Node("dice1", true);
        Node d2 = new Node("dice2", true);
        Node d3 = new Node("dice3", true);
        Node d4 = new Node("dice4", true);
        Node d5 = new Node("dice5", true);
        Node d6 = new Node("dice6", true);
        n0.setNextStateA(n1);
        n0.setNextStateB(n2);
        n1.setNextStateA(n3);
        n1.setNextStateB(n4);
        n2.setNextStateA(n5);
        n2.setNextStateB(n6);
        n3.setNextStateA(n1);
        n3.setNextStateB(d1);
        n4.setNextStateA(d2);
        n4.setNextStateB(d3);
        n5.setNextStateA(d4);
        n5.setNextStateB(d5);
        n6.setNextStateA(d6);
        n6.setNextStateB(n2);
        FiniteStateMachine f1 = new FiniteStateMachine(n0);
        System.out.println(f1.toNode());

        FiniteStateMachine f2 = new FiniteStateMachine(n0);

    }
}
