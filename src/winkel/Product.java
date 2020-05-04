package winkel;

public class Product {
    private String naam;
    private double prijs;
    private Categorie categorie;

    public Product(String nm, double prs){
        naam = nm;
        prijs = prs;
    }

    public String getNaam(){
        return naam;
    }

    public double getPrijs(){
        return prijs;
    }

    public Categorie getCategorie(){
        return categorie;
    }

    public void setCategorie(Categorie cat){
        categorie = cat;
    }



    @Override
    public String toString(){
        String result = "\n";
        try{
            result += "Het product: '" + naam + "' kost " + prijs + " en is van de categorie " + categorie.getNaam() + ".\n";
        }catch (NullPointerException e){
            result += "er is geen product bekend.\n";
        }
        return result;
    }
}
