//a
//Affe
//Test 
//Hallo ihr Lappen

/**
 * Diese Klasse steuert das eigentliche Spiel, indem es die Funktionen der anderen Klassen z.B. zum Anzeigen der Graphik nutzt. 
 *
 * @author Martina Ottinger
 * @version (11.5.2019)
 */
public class Spiel extends SIMULATION
{
    private RANDSYMBOL rand;

    /**
     * Constructor for objects of class Spiel
     */
    public Spiel()
    {
        rand = new RANDSYMBOL(10,17);
    }

    /**
     * Info: Diese Methode wird automatisch nach jeder Zeiteinheit ausgeführt. 
     * ToDo: Was soll nach jeder Zeiteinheit passieren?
     */ @Override
    void TaktImpulsAusfuehren ()
    {
        System. out. println ();
    }

    public void starten(){
        spawnen();

    }

    /**
     * 
     * Info: Diese Methode wird automatisch aufgerufen, sobald eine Taste gedrückt wird.
     * ToDo: Leite den Tastendruck auf die Methode um, die diesen verarbeitet.
     */ @Override
    void TasteGedrueckt(char taste)
    {
        switch(taste){
            case 'S':
            case 's':
            starten();
            break;

            case 'd':
            case 'D':
            //rechtsbewegen();
            break;

            case 'a':
            case 'A':
            //linksbewegen();
            break;
            
            
           // case 'A':
            //drehen();
            //break;
        }

    }

    //ToDo: schreibe eine zentrale Startmethode, die entsprechend die anderen Methoden verwaltet. 
    //Welche der anderen Methoden kannst du dann private gestalten?
    public static void main(String[] args) {
        Spiel s = new Spiel();
    }

    private int zufallszahl() {
        int max;
        max = 6;
        return (int) (Math.random()*(max+1));
    }

    public void spawnen(){
        Bausteine x1;
        switch (zufallszahl()){
            case 0:
            x1 = new Teewee();
            break;

            case 1:
            x1 = new HERO(); 
            break;

            case 2:
            x1 = new OrangeRicky();
            break;

            case 3:
            x1 = new Smashboy();
            break;

            case 4:
            x1 = new RhodeIslandZ();
            break;

            case 5:
            x1 = new BlackRicky();
            break;

            case 6:
            x1 = new ClevelandZ();
            break;

        } 
    } 
}   

