package formatieveOpdracht2a;

import winkel.Kassa;

public class FiniteStateMachine {
    private String sequence;

    public FiniteStateMachine(String seq){
        sequence = seq;
    }

    @Override
    public String ToString(){
        int length = sequence.length();
        String[] states = new String[length] {"s0"};
        int i;
        for (i = 0; i < length; i++){
            if sequence.charAt(i) == "A"{
                states[i+1] = states[i].getNextState()
            }
        }
    }
    String[] states;
    int i;
    for (i = 0; i < ; i++)
}


    //transactie bij kassa 2
    Kassa kas2 = new Kassa(2);
        kas2.setKlant(k2);
                kas2.setMedewerker(m1);
                System.out.println(kas2.toString());
                Product[] lst2 = {p5, p6, p7};
                int j;
                double totaalprijs2 = 0;
                for (j = 0; j < lst2.length; j++) {
        kas2.setProduct(lst2[j]);
        totaalprijs2 += lst2[j].getPrijs();
        System.out.println("Product: " + lst2[j].getNaam() + " | Prijs: " + lst2[j].getPrijs());
        }
        System.out.println("Totaalprijs: " + round(totaalprijs2,