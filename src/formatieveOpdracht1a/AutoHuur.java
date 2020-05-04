package formatieveOpdracht1a;

public class AutoHuur implements Contract {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public AutoHuur(){
    }

    public void setAantalDagen(int aD){
        this.aantalDagen = aD;
    }

    public Klant getHuurder(){
        return huurder;
    }

    public void setHuurder(Klant k){
        this.huurder = k;
    }

    public Auto getGehuurdeAuto(){
        return gehuurdeAuto;
    }

    public void setGehuurdeAuto(Auto gA){
        this.gehuurdeAuto = gA;
    }

    public double totaalPrijs(){
        if (gehuurdeAuto == null || huurder == null)
            return 0;
        else
            return aantalDagen * gehuurdeAuto.getPrijsPerDag() * (1-huurder.getKorting()/100);
    }

    @Override
    public String toString(){
        String result = "\n";
        try{
            result += "autotype: " + gehuurdeAuto.toString() + " met prijs per dag: " + gehuurdeAuto.getPrijsPerDag() + "\n";
        }catch (NullPointerException e){
            result += "er is geen huurder bekend \n";
        }
        result += "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs() + "\n";
        result += "\n";
        return result;
    }

}
