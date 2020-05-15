package fsm2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        //maakt nodes aan voor de FiniteStateMachine die een tekst verwerkt
        Node s0 = new Node("s0", false);
        Node s1 = new Node("s1", false);
        Node s2 = new Node("s2", false);
        Node s3 = new Node("s3", false);
        ArrayList<String> keys0 = new ArrayList<>(Arrays.asList("A", "B"));
        ArrayList<String> keys1 = new ArrayList<>(Arrays.asList("A", "B"));
        ArrayList<String> keys2 = new ArrayList<>(Arrays.asList("B"));
        ArrayList<String> keys3 = new ArrayList<>(Arrays.asList("A", "B"));
        s0.setKeys(keys0);
        s1.setKeys(keys1);
        s2.setKeys(keys2);
        s3.setKeys(keys3);
        ArrayList<Node> options0 = new ArrayList<>(Arrays.asList(s2, s1));
        ArrayList<Node> options1 = new ArrayList<>(Arrays.asList(s1, s2));
        ArrayList<Node> options2 = new ArrayList<>(Arrays.asList(s3));
        ArrayList<Node> options3 = new ArrayList<>(Arrays.asList(s3, s0));
        s0.setOptions(options0);
        s1.setOptions(options1);
        s2.setOptions(options2);
        s3.setOptions(options3);
        FiniteStateMachine f1 = new FiniteStateMachine(new String[]{"A", "A", "A"}, s0);
        System.out.println(f1.getNodes());



        Node n0 = new Node("n0", false);
        Node n1 = new Node("n1", false);
        Node n2 = new Node("n2", false);
        Node n3 = new Node("n3", false);
        Node n4 = new Node("n4", false);
        Node n5 = new Node("n5", false);
        Node n6 = new Node("n6", false);
        Node d1 = new Node("dice1", true);
        Node d2 = new Node("dice2", true);
        Node d3 = new Node("dice3", true);
        Node d4 = new Node("dice4", true);
        Node d5 = new Node("dice5", true);
        Node d6 = new Node("dice6", true);
        ArrayList<Double> chances0 = new ArrayList<>(Arrays.asList(0.5, 0.5));
        ArrayList<Double> chances1 = new ArrayList<>(Arrays.asList(0.5, 0.5));
        ArrayList<Double> chances2 = new ArrayList<>(Arrays.asList(0.5, 0.5));
        ArrayList<Double> chances3 = new ArrayList<>(Arrays.asList(0.5, 0.5));
        ArrayList<Double> chances4 = new ArrayList<>(Arrays.asList(0.5, 0.5));
        ArrayList<Double> chances5 = new ArrayList<>(Arrays.asList(0.5, 0.5));
        ArrayList<Double> chances6 = new ArrayList<>(Arrays.asList(0.5, 0.5));
        n0.setChances(chances0);
        n1.setChances(chances1);
        n2.setChances(chances2);
        n3.setChances(chances3);
        n4.setChances(chances4);
        n5.setChances(chances5);
        n6.setChances(chances6);
        ArrayList<Node> ooption0 = new ArrayList<>(Arrays.asList(n1, n2));
        ArrayList<Node> ooption1 = new ArrayList<>(Arrays.asList(n3, n4));
        ArrayList<Node> ooption2 = new ArrayList<>(Arrays.asList(n5, n6));
        ArrayList<Node> ooption3 = new ArrayList<>(Arrays.asList(n1, d1));
        ArrayList<Node> ooption4 = new ArrayList<>(Arrays.asList(d2, d3));
        ArrayList<Node> ooption5 = new ArrayList<>(Arrays.asList(d4, d5));
        ArrayList<Node> ooption6 = new ArrayList<>(Arrays.asList(d6, n2));
        n0.setOptions(ooption0);
        n1.setOptions(ooption1);
        n2.setOptions(ooption2);
        n3.setOptions(ooption3);
        n4.setOptions(ooption4);
        n5.setOptions(ooption5);
        n6.setOptions(ooption6);


        FiniteStateMachine f2 = new FiniteStateMachine(null, n0);
        System.out.println(f2.getString());





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