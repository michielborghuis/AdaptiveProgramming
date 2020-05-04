package winkel;

public class Medewerker implements Persoon{
    private String naam;

    public Medewerker(String nm){
        naam = nm;
    }

    public String getNaam(){
        return naam;
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
