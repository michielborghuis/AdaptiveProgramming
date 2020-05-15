package FiniteStateMachine2;

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
        FiniteStateMachine f1 = new FiniteStateMachine(new String[]{"A", "B", "B", "B", "A"}, s0);
        System.out.println(f1.getNodes());


        //finite state machine voor 6-zijdige zobbelsteen met een gelijke kans voor elke zijde
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
        ArrayList<Node> f1option0 = new ArrayList<>(Arrays.asList(n1, n2));
        ArrayList<Node> f1option1 = new ArrayList<>(Arrays.asList(n3, n4));
        ArrayList<Node> f1option2 = new ArrayList<>(Arrays.asList(n5, n6));
        ArrayList<Node> f1option3 = new ArrayList<>(Arrays.asList(n1, d1));
        ArrayList<Node> f1option4 = new ArrayList<>(Arrays.asList(d2, d3));
        ArrayList<Node> f1option5 = new ArrayList<>(Arrays.asList(d4, d5));
        ArrayList<Node> f1option6 = new ArrayList<>(Arrays.asList(d6, n2));
        n0.setOptions(f1option0);
        n1.setOptions(f1option1);
        n2.setOptions(f1option2);
        n3.setOptions(f1option3);
        n4.setOptions(f1option4);
        n5.setOptions(f1option5);
        n6.setOptions(f1option6);
        FiniteStateMachine f2 = new FiniteStateMachine(null, n0);
        System.out.println(f2.getFinalNode());


        //finite state machine voor een 8-zijdige dobbelsteen met een ongelijke kans voor de zijden
        //de dobbelsteen zal bijna altijd op de 8 landen
        Node f3n0 = new Node("s0", false);
        Node f3n1 = new Node("s1", false);
        Node f3n2 = new Node("s2", false);
        Node f3n3 = new Node("s3", false);
        Node f3n4 = new Node("s4", false);
        Node f3n5 = new Node("s5", false);
        Node f3n6 = new Node("s6", false);
        Node f3d1 = new Node("dice1", true);
        Node f3d2 = new Node("dice2", true);
        Node f3d3 = new Node("dice3", true);
        Node f3d4 = new Node("dice4", true);
        Node f3d5 = new Node("dice5", true);
        Node f3d6 = new Node("dice6", true);
        Node f3d7 = new Node("dice7", true);
        Node f3d8 = new Node("dice8", true);
        ArrayList<Double> f3chances0 = new ArrayList<>(Arrays.asList(0.01, 0.99));
        ArrayList<Double> f3chances1 = new ArrayList<>(Arrays.asList(0.01, 0.99));
        ArrayList<Double> f3chances2 = new ArrayList<>(Arrays.asList(0.01, 0.99));
        ArrayList<Double> f3chances3 = new ArrayList<>(Arrays.asList(0.01, 0.99));
        ArrayList<Double> f3chances4 = new ArrayList<>(Arrays.asList(0.01, 0.99));
        ArrayList<Double> f3chances5 = new ArrayList<>(Arrays.asList(0.01, 0.99));
        ArrayList<Double> f3chances6 = new ArrayList<>(Arrays.asList(0.01, 0.99));
        f3n0.setChances(f3chances0);
        f3n1.setChances(f3chances1);
        f3n2.setChances(f3chances2);
        f3n3.setChances(f3chances3);
        f3n4.setChances(f3chances4);
        f3n5.setChances(f3chances5);
        f3n6.setChances(f3chances6);
        ArrayList<Node> f3option0 = new ArrayList<>(Arrays.asList(f3n1, f3n2));
        ArrayList<Node> f3option1 = new ArrayList<>(Arrays.asList(f3n3, f3n4));
        ArrayList<Node> f3option2 = new ArrayList<>(Arrays.asList(f3n5, f3n6));
        ArrayList<Node> f3option3 = new ArrayList<>(Arrays.asList(f3d1, f3d2));
        ArrayList<Node> f3option4 = new ArrayList<>(Arrays.asList(f3d3, f3d4));
        ArrayList<Node> f3option5 = new ArrayList<>(Arrays.asList(f3d5, f3d6));
        ArrayList<Node> f3option6 = new ArrayList<>(Arrays.asList(f3d7, f3d8));
        f3n0.setOptions(f3option0);
        f3n1.setOptions(f3option1);
        f3n2.setOptions(f3option2);
        f3n3.setOptions(f3option3);
        f3n4.setOptions(f3option4);
        f3n5.setOptions(f3option5);
        f3n6.setOptions(f3option6);
        FiniteStateMachine f3 = new FiniteStateMachine(null, f3n0);
        System.out.println(f3.getFinalNode());


        //finite state machine voor een 9-zijdige dobbelsteen met
        Node f4n0 = new Node("s0", false);
        Node f4n1 = new Node("s1", false);
        Node f4n2 = new Node("s2", false);
        Node f4n3 = new Node("s3", false);
        Node f4d1 = new Node("dice1", true);
        Node f4d2 = new Node("dice2", true);
        Node f4d3 = new Node("dice3", true);
        Node f4d4 = new Node("dice4", true);
        Node f4d5 = new Node("dice5", true);
        Node f4d6 = new Node("dice6", true);
        Node f4d7 = new Node("dice7", true);
        Node f4d8 = new Node("dice8", true);
        Node f4d9 = new Node("dice9", true);
        ArrayList<Double> f4chances0 = new ArrayList<>(Arrays.asList(0.33, 0.33, 0.34));
        ArrayList<Double> f4chances1 = new ArrayList<>(Arrays.asList(0.33, 0.33, 0.34));
        ArrayList<Double> f4chances2 = new ArrayList<>(Arrays.asList(0.33, 0.33, 0.34));
        ArrayList<Double> f4chances3 = new ArrayList<>(Arrays.asList(0.33, 0.33, 0.34));
        f4n0.setChances(f4chances0);
        f4n1.setChances(f4chances1);
        f4n2.setChances(f4chances2);
        f4n3.setChances(f4chances3);
        ArrayList<Node> f4option0 = new ArrayList<>(Arrays.asList(f4n1, f4n2, f4n3));
        ArrayList<Node> f4option1 = new ArrayList<>(Arrays.asList(f4d1, f4d2, f4d3));
        ArrayList<Node> f4option2 = new ArrayList<>(Arrays.asList(f4d4, f4d5, f4d6));
        ArrayList<Node> f4option3 = new ArrayList<>(Arrays.asList(f4d7, f4d8, f4d9));
        f4n0.setOptions(f4option0);
        f4n1.setOptions(f4option1);
        f4n2.setOptions(f4option2);
        f4n3.setOptions(f4option3);
        FiniteStateMachine f4 = new FiniteStateMachine(null, f4n0);
        System.out.println(f4.getFinalNode());
    }
}