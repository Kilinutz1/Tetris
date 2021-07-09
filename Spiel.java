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
        System. out. println ("Tick");
    }
    /**
     * 
     * Info: Diese Methode wird automatisch aufgerufen, sobald eine Taste gedrückt wird.
     * ToDo: Leite den Tastendruck auf die Methode um, die diesen verarbeitet.
     */ @Override
    void TasteGedrueckt(char taste)
    {
        System. out. println ("Taste gedrückt: " + taste);
    }
    
    
    //ToDo: schreibe eine zentrale Startmethode, die entsprechend die anderen Methoden verwaltet. 
    //Welche der anderen Methoden kannst du dann private gestalten?
    public static void main(String[] args) {
        Spiel s = new Spiel();
    }
    public int zufallszahl(int max) {
        return (int) (Math.random()*(max+1));
       }
}
