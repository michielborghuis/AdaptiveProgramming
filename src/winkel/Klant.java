package winkel;

public class Klant implements Persoon {
    private String naam;
    private int leeftijd;
    private String rekeningnummer;

    public Klant(String nm, int lftd, String rekNr){
        naam = nm;
        leeftijd = lftd;
        rekeningnummer = rekNr;
    }


    public String getNaam(){
        return naam;
    }

    public int getLeeftijd(){
        return leeftijd;
    }

    public String getRekeningnummer(){
        return rekeningnummer;
    }

    @Override
    public boolean loopt(){
        return false;
    }

    @Override
    public boolean praat(){
        return true;
    }

    @Override
    public String toString(){
        return naam;
    }


}
