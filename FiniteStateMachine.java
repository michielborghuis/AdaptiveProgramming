package FiniteStateMachine2;

import java.util.ArrayList;
import java.util.Random;

public class FiniteStateMachine {
    private String[] sequence;  //de letters die de machine leest om de volgende state te kiezen
    private Node currentNode;   //de node waarin de machine zich op het moment bevind
    private ArrayList<Node> nodes = new ArrayList<>();  //lijst waaraan alle nodes worden toegevoegd die langs worden gegaan


    public FiniteStateMachine(String[] seq, Node cnd) {
        sequence = seq;
        currentNode = cnd;
    }

    public ArrayList<Node> getNodes() { //returnt array van states waar de machine doorheen gaat
        nodes.add(0, currentNode);  //voegt de eerste node(beginstate) toe
        Node currentNode = nodes.get(0);
        for (int i = 0; i < sequence.length; i++) { //gaat alle letters in de meegegeven lijst af
            if (currentNode.returnStringNode(sequence[i]) != null) {   //controleert of de node een volgende node heeft voor de gegeven letter
                Node newNode = currentNode.returnStringNode(sequence[i]);
                nodes.add(i + 1, newNode); //voegt node toe waar de machine langs gaat
                currentNode = newNode;
            } else {
                return nodes;
            }
        }
        return nodes;
    }

    public String getFinalNode() { //returnt de eindnode(kant van dobbelsteen) waar de dobbelsteen op landt
        nodes.add(currentNode); //voegt de eerste node(beginnode) toe
        Node currentNode = nodes.get(0);
        Random rand = new Random();
        while (!currentNode.getEndNode()) { //gaat naar de volgende node zolang de huidige node geen eindnode(kant van dobbelsteen) is
            ArrayList<Double> chances = currentNode.getChances();
            int n = rand.nextInt(100) + 1; //genereert een getal tussen de 1 en 100 om de kans in % te kunnen berekenen
            int previousValue = 0;
            for (int i = 0; i < chances.size(); i++) {
                double chance = chances.get(i); //kans dat de machine naar de bijbehorende node gaat
                if (n <= 100 - previousValue && n > 100 - chance * 100 - previousValue) { //berekent naar welke node de machine gaat
                    currentNode = currentNode.returnNodeChance(i);
                    previousValue += (int) (chance * 100);
                } else {
                    previousValue += (int) (chance * 100);
                }
            }
        }
        return currentNode.getStateName();
    }
}
