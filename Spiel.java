//a
//Affe
//Test 
//Hallo ihr Lappen
import java.util.*;

/**
 * Diese Klasse steuert das eigentliche Spiel, indem es die Funktionen der anderen Klassen z.B. zum Anzeigen der Graphik nutzt. 
 *
 * @author Martina Ottinger
 * @version (11.5.2019)
 */
public class Spiel extends SIMULATION
{
    private RANDSYMBOL rand;
    ArrayList<Bausteine> x1 = new ArrayList<Bausteine> ();
    /**
     * Constructor for objects of class Spiel
     */
    public Spiel()
    {
        rand = new RANDSYMBOL(10,17);
    }

    /**
     * Info: Diese Methode wird automatisch nach jeder Zeiteinheit ausgeführt. 
     * ToDo: Was soll nach jeder Zeiteinheit passieren
    /**
     * 
     * Info: Diese Methode wird automatisch aufgerufen, sobald eine Taste gedrückt wird.
     * ToDo: Leite den Tastendruck auf die Methode um, die diesen verarbeitet.
     */ 
    
    
      @Override
    void TaktImpulsAusfuehren ()
    {
        x1.get(x1.size()-1).herunterfallen();
    }
    
    public void starten1(){
     Starten();   
     spawnen();
     
    }
    
    @Override
    void TasteGedrueckt(char taste)
    {
        switch(taste){
            case 'S':
            case 's':
            starten1();
            break;

            case 'd':
            case 'D':
            x1.get(x1.size()-1).rechtsbewegen();
            break;
            
            case 'a':
            case 'A':
            x1.get(x1.size()-1).linksbewegen();
            break;
            
            
           case 'q':
           case 'Q':
            x1.get(x1.size()-1).drehen();
            break;
             case 'w':
            case 'W':
            x1.get(x1.size()-1).herunterfallen();
            break;
        }

    }

    //ToDo: schreibe eine zentrale Startmethode, die entsprechend die anderen Methoden verwaltet. 
    //Welche der anderen Methoden kannst du dann private gestalten?
    public static void main(String[] args) {
        Spiel s = new Spiel();
    }
//lappen
    private int zufallszahl() {
        int max;
        max = 6;
        return (int) (Math.random()*(max+1));
    }

    public void spawnen(){
        
        switch (zufallszahl()){
            case 0:
            x1.add(new Teewee());
            break;

            case 1:
            x1.add(new HERO()); 
            break;

            case 2:
            x1.add(new OrangeRicky());
            break;

            case 3:
            x1.add(new Smashboy());
            break;

            case 4:
            x1.add(new RhodeIslandZ());
            break;

            case 5:
            x1.add(new BlackRicky());
            break;

            case 6:
            x1.add(new ClevelandZ());
            break;

        } 
    } 
}   

