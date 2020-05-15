package FiniteStateMachine2;

import java.util.ArrayList;

public class Node {
    private String stateName;
    private ArrayList<Node> options; //opties voor volgende node
    private ArrayList<String> keys; //letters die volgende node bepalen (tekst FSM)
    private ArrayList<Double> chances; //kansen die volgende node bepalen (dobbelsteen FSM)
    private boolean endNode; //bepaalt of de node een het einde van de machine is

    public Node(String st, boolean end){
        stateName = st;
        endNode = end;
    }

    public void setKeys(ArrayList<String> ks){
        keys = ks;
    }
    public void setOptions(ArrayList<Node> opt){
        options = opt;
    }

    public void setChances(ArrayList<Double> cha){
        chances = cha;
    }

    public ArrayList<Double> getChances(){
        return chances;
    }

    public boolean getEndNode(){
        return endNode;
    }

    public String getStateName(){
        return stateName;
    }

    public Node returnStringNode(String cha){ //geeft de volgende node aan de hand van de huidige node en een letter
        if (keys.contains(cha)){
            int index = keys.indexOf(cha);
            return options.get(index);
        }else{
            return null;
        }
    }
    public Node returnNodeChance(int i){ //geeft de volgende node (dobbelsteen FSM)
        return options.get(i);
    } //geeft de volgende note voor de dobbelsteen FSM

    public String toString() {
        return stateName;
    }
}