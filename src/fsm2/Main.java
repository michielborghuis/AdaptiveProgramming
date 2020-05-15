package fsm2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        //maakt nodes aan voor de FiniteStateMachine die een tekst verwerkt
        ArrayList<String> keys0 = new ArrayList<>(Arrays.asList("A", "B"));
        ArrayList<String> keys1 = new ArrayList<>(Arrays.asList("A", "B"));
        ArrayList<String> keys2 = new ArrayList<>(Arrays.asList("B"));
        ArrayList<String> keys3 = new ArrayList<>(Arrays.asList("A", "B"));
        Node s0 = new Node("s0", keys0, false);
        Node s1 = new Node("s1", keys1, false);
        Node s2 = new Node("s2", keys2, false);
        Node s3 = new Node("s3", keys3, false);
        ArrayList<Node> options0 = new ArrayList<>(Arrays.asList(s2, s1));
        ArrayList<Node> options1 = new ArrayList<>(Arrays.asList(s1, s2));
        ArrayList<Node> options2 = new ArrayList<>(Arrays.asList(s3));
        ArrayList<Node> options3 = new ArrayList<>(Arrays.asList(s3, s0));
        s0.setOptions(options0);
        s1.setOptions(options1);
        s2.setOptions(options2);
        s3.setOptions(options3);
        ArrayList<Double> chances0 = new ArrayList<>(Arrays.asList(0.5, 0.5));
        FiniteStateMachine f1 = new FiniteStateMachine(new String[]{"A", "A", "A"}, s0, chances0);
        System.out.println(f1.getNodes());


        Arr

//        s3.setOptions(ArrayList<Node>{s3, s0});
//        s2.setOptions(ArrayList<Node>{s3});
//        s1.setOptions(ArrayList<Node>{s1, s2});
//        s0.setOptions(ArrayList<Node>{s2, s1});
//        FiniteStateMachine f1 = new FiniteStateMachine(new String[]{"B", "A", "A", "B", "B", "B", "A"}, s0);
//        System.out.println(f1.getNodes());

//        Node s3 = new Node("s3", null, null, false);
//        Node s2 = new Node("s2", null, s3, false);
//        Node s1 = new Node("s1", null, s2, false);
//        Node s0 = new Node("s0", s2, s1, false);
//        s3.setNextStateA(s3);
//        s3.setNextStateB(s0);
//        s2.setNextStateB(s3);
//        s1.setNextStateA(s1);
//        FiniteStateMachine f1 = new FiniteStateMachine(new String[]{"B", "A", "A", "B", "B", "B", "A"}, s0);
//        System.out.println(f1.getNodes());

//        //maakt nodes aan voor een FiniteStateMachine die een dobbelsteen maakt met 6 zijden
//        Node d1 = new Node("dice1", null, null, true);
//        Node d2 = new Node("dice2", null, null, true);
//        Node d3 = new Node("dice3", null, null, true);
//        Node d4 = new Node("dice4", null, null, true);
//        Node d5 = new Node("dice5", null, null, true);
//        Node d6 = new Node("dice6", null, null, true);
//        Node n3 = new Node("n3", null, d1, false);
//        Node n4 = new Node("n4", d2, d3, false);
//        Node n5 = new Node("n5", d4, d5, false);
//        Node n6 = new Node("n6", d6, null, false);
//        Node n1 = new Node("n1", n3, n4, false);
//        Node n2 = new Node("n2", n5, n6, false);
//        Node n0 = new Node("n0", n1, n2, false);
//        n3.setNextStateA(n1);
//        n6.setNextStateB(n2);
//        FiniteStateMachine f2 = new FiniteStateMachine(null, n0);   //n0 is de beginstate van de Finitestatemachine
//        System.out.println(f2.getString());                             //vanaf n0 wordt de rest automatisch gegenereerd
//
//        //maakt nodes aan voor een FiniteStateMachine die een dobbelsteen maakt met 8 zijden
//        Node dd1 = new Node("dice1", null, null, true);
//        Node dd2 = new Node("dice2", null, null, true);
//        Node dd3 = new Node("dice3", null, null, true);
//        Node dd4 = new Node("dice4", null, null, true);
//        Node dd5 = new Node("dice5", null, null, true);
//        Node dd6 = new Node("dice6", null, null, true);
//        Node dd7 = new Node("dice7", null, null, true);
//        Node dd8 = new Node("dice8", null, null, true);
//        Node nn6 = new Node("s6", dd7, dd8, false);
//        Node nn5 = new Node("s5", dd5, dd6, false);
//        Node nn4 = new Node("s4", dd3, dd4, false);
//        Node nn3 = new Node("s3", dd1, dd2, false);
//        Node nn2 = new Node("s2", nn5, nn6, false);
//        Node nn1 = new Node("s1", nn3, nn4, false);
//        Node nn0 = new Node("s0", nn1, nn2, false);
//        FiniteStateMachine f3 = new FiniteStateMachine(null, nn0);  //nn0 is de beginstate van de Finitestatemachine
//        System.out.println(f3.getString());                             //vanaf nn0 wordt de rest automatisch gegenereerd
    }
}