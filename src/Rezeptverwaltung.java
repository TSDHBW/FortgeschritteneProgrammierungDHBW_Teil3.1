/**
 * Klasse zur Generierung eines Objekts für die Rezeptverwaltung. Jede Rezeptverwaltung besitzt je ein Array für Rezepte für Pastagerichte, Fleischgerichte,
 * COcktais und Limonaden
 * @author Timo
 * @version 1
 */
public class Rezeptverwaltung {

    private BasisRezept[] rezepte;

    public Rezeptverwaltung (){

        rezepte = new BasisRezept[1000];

    }

    public void nehmeRezeptAuf (BasisRezept rezept){

        boolean rezeptAufgenommen = false;
        boolean rezeptEnthalten = false;
        for (int i = 0; i < rezepte.length; i++) {

            if (rezepte[i] == null){


                rezepte[i] = rezept;
                System.out.println("Rezept aufgenommen");
                rezeptAufgenommen = true;
                break;

            } else {
                if (rezepte[i].getTyp().equals(rezept.getTyp()) && rezepte[i].getName().equals(rezept.getName())){
                    System.out.println("Rezept bereits enthalten");
                    rezeptAufgenommen = true;
                    break;
                }
            }
        }
        if (rezeptAufgenommen == false){
            System.out.println("Rezeptverwaltung voll");
        }
    }

    public void zeigeAlleRezepteAn () {

        for (int i = 0; i < rezepte.length; i++){

            if (rezepte[i] != null){

                System.out.println(rezepte[i].getName());

            }
        }

    }

    public void loescheRezept (String rezeptname, String rezeptart){

        for (int i = 0; i < rezepte.length; i++){

            if (rezepte[i] != null){

                if (rezepte[i].getName().equals(rezeptname) && rezepte[i].getTyp().equals(rezeptart)){

                    rezepte[i] = null;

                }
            }
        }

    }

    public int ermittleAnzahlRezepte (String rezeptart){

        int anzahl = 0;

        for (int i = 0; i < rezepte.length; i++){

            if (rezepte[i] != null){

                if (rezepte[i].getTyp().equals(rezeptart)){

                    anzahl++;

                }
            }
        }
        return anzahl;

    }

    public int ermittleAnzahlRezepte (){

        int anzahl = 0;

        for (int i = 0; i < rezepte.length; i++){

            if (rezepte[i] != null){

                anzahl++;

            }
        }
        return anzahl;

    }

    public BasisRezept[] getRezepte() {
        return rezepte;
    }

    public void setRezepte(BasisRezept[] rezepte) {
        this.rezepte = rezepte;
    }
}
