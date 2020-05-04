package winkel;

public class Kassa {
    private int kassanummer;
    private Klant klant;
    private Medewerker medewerker;
    private Product product;

    public Kassa(int kasNr){
        kassanummer = kasNr;
    }

    public void setKlant(Klant k){
        klant = k;
    }

    public void setMedewerker(Medewerker m){
        medewerker = m;
    }

    public void setProduct(Product p){
        product = p;
    }


    @Override
    public String toString(){
        String result = "\n";
        try {
            result += "Bij kassa " + this.kassanummer + " heeft " + klant.getNaam() + " bij medewerker " + medewerker.getNaam() +
                    " de volgende producten gekocht en op rekeningnummer " + klant.getRekeningnummer() + " betaald:";
        }catch (NullPointerException e){
            result += "Er is niet voldoende informatie aanwezig";
        }
        result += "\n";
        return result;
    }

}
