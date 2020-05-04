package winkel;

public class Main {
    public static double round(double value, int places){ //rond double af op 2 decimalen
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp/factor;
    }

    public static void main(String[] args){

        //medewerkers
        Medewerker m1 = new Medewerker("Jaap");

        //categoriën
        Categorie c1 = new Categorie("Lego");
        Categorie c2 = new Categorie("Buiten");
        Categorie c3 = new Categorie("Boeken");
        Categorie c4 = new Categorie("Bordspellen");
        Categorie c5 = new Categorie("Kaartspellen");

        //klant 1 met bijbehorende producten en categoriën
        Klant k1 = new Klant("Michiel", 17, "12345678");

        Product p1 = new Product("Lego brandweerwagen", 24.99);
        p1.setCategorie(c1);
        Product p2 = new Product("Lego huis", 21.99);
        p2.setCategorie(c1);
        Product p3 = new Product("Step", 50.00);
        p3.setCategorie(c2);
        Product p4 = new Product("Mens erger je niet", 14.99);
        p4.setCategorie(c4);

        //klant 2 met bijbehorende producten en categoriën
        Klant k2 = new Klant("Henk", 50, "4637347836");

        Product p5 = new Product("Skeelers", 25.00);
        p5.setCategorie(c2);
        Product p6 = new Product("Springtouw", 4.99);
        p6.setCategorie(c2);
        Product p7 = new Product("Uno", 12.99);
        p7.setCategorie(c5);

        //transactie bij kassa 1
        Kassa kas1 = new Kassa(1);
        kas1.setKlant(k1);
        kas1.setMedewerker(m1);
        System.out.println(kas1.toString());
        Product[] lst1 = {p1, p2, p3, p4}; //producten die horen bij klant 1
        int i;
        double totaalprijs1 = 0;
        for (i = 0; i < lst1.length; i++) {
            kas1.setProduct(lst1[i]);
            totaalprijs1 += lst1[i].getPrijs();
            System.out.println("Product: " + lst1[i].getNaam() + " | Prijs: " + lst1[i].getPrijs());
        }
        System.out.println("Totaalprijs: " + round(totaalprijs1, 2));


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
        System.out.println("Totaalprijs: " + round(totaalprijs2, 2));

    }
}