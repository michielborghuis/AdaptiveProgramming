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

        Node nn0 = new Node("s0", false);
        Node nn1 = new Node("s1", false);
        Node nn2 = new Node("s2", false);
        Node nn3 = new Node("s3", false);
        Node nn4 = new Node("s4", false);
        Node nn5 = new Node("s5", false);
        Node nn6 = new Node("s6", false);
        Node dd1 = new Node("dice1", true);
        Node dd2 = new Node("dice2", true);
        Node dd3 = new Node("dice3", true);
        Node dd4 = new Node("dice4", true);
        Node dd5 = new Node("dice5", true);
        Node dd6 = new Node("dice6", true);
        Node dd7 = new Node("dice7", true);
        Node dd8 = new Node("dice8", true);
        nn0.setNextStateA(nn1);
        nn0.setNextStateB(nn2);
        nn1.setNextStateA(nn3);
        nn1.setNextStateB(nn4);
        nn2.setNextStateA(nn5);
        nn2.setNextStateB(nn6);
        nn3.setNextStateA(dd1);
        nn3.setNextStateB(dd2);
        nn4.setNextStateA(dd3);
        nn4.setNextStateB(dd4);
        nn5.setNextStateA(dd5);
        nn5.setNextStateB(dd6);
        nn6.setNextStateA(dd7);
        nn6.setNextStateB(dd8);
        FiniteStateMachine f2 = new FiniteStateMachine(nn0);
        System.out.println(f2.toNode());
    }
}
