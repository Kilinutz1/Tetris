

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
   public ArrayList<Bausteine> x1 = new ArrayList<Bausteine> ();
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
        while (x1.get(x1.size()-1).cool == 1){
            spawnen();
           x1.get(x1.size()-2).cool =0;
        }
    }

    public void starten1(){
        Starten();   
        spawnen();
       
    }
    
    public boolean hatPlatznachrechts(){
        boolean hatPlatznachrechts = true;
        for(int i = 0; i< x1.size()-1; i++){
            if(!((x1.get(x1.size()-1).einsx+1 == (x1.get(i).einsx)) &&
            (x1.get(x1.size()-1).einsy == (x1.get(i).einsy))) &&
               !((x1.get(x1.size()-1).zweix+1 == (x1.get(i).einsx)) &&
               (x1.get(x1.size()-1).zweiy == (x1.get(i).einsy))) &&
               !((x1.get(x1.size()-1).dreix+1 == (x1.get(i).einsx)) &&
               (x1.get(x1.size()-1).dreiy == (x1.get(i).einsy))) &&
               !((x1.get(x1.size()-1).vierx+1 == (x1.get(i).einsx)) &&
               (x1.get(x1.size()-1).viery == (x1.get(i).einsy)))&&
              (!((x1.get(x1.size()-1).einsx+1 == (x1.get(i).zweix)) &&
            (x1.get(x1.size()-1).einsy == (x1.get(i).zweiy))) &&
               !((x1.get(x1.size()-1).zweix+1 == (x1.get(i).zweix)) &&
               (x1.get(x1.size()-1).zweiy == (x1.get(i).zweiy))) &&
               !((x1.get(x1.size()-1).dreix+1 == (x1.get(i).zweix)) &&
               (x1.get(x1.size()-1).dreiy == (x1.get(i).zweiy))) &&
               !((x1.get(x1.size()-1).vierx+1 == (x1.get(i).zweix)) &&
               (x1.get(x1.size()-1).viery == (x1.get(i).zweiy))))&&
               (!((x1.get(x1.size()-1).einsx+1 == (x1.get(i).dreix)) &&
            (x1.get(x1.size()-1).einsy == (x1.get(i).dreiy))) &&
               !((x1.get(x1.size()-1).zweix+1 == (x1.get(i).dreix)) &&
               (x1.get(x1.size()-1).zweiy == (x1.get(i).dreiy))) &&
               !((x1.get(x1.size()-1).dreix+1 == (x1.get(i).dreix)) &&
               (x1.get(x1.size()-1).dreiy == (x1.get(i).dreiy))) &&
               !((x1.get(x1.size()-1).vierx+1 == (x1.get(i).dreix)) &&
               (x1.get(x1.size()-1).viery == (x1.get(i).dreiy))))&&
               (!((x1.get(x1.size()-1).einsx+1 == (x1.get(i).vierx)) &&
            (x1.get(x1.size()-1).einsy == (x1.get(i).viery))) &&
               !((x1.get(x1.size()-1).zweix+1 == (x1.get(i).vierx)) &&
               (x1.get(x1.size()-1).zweiy == (x1.get(i).viery))) &&
               !((x1.get(x1.size()-1).dreix+1 == (x1.get(i).vierx)) &&
               (x1.get(x1.size()-1).dreiy == (x1.get(i).viery))) &&
               !((x1.get(x1.size()-1).vierx+1 == (x1.get(i).vierx)) &&
               (x1.get(x1.size()-1).viery == (x1.get(i).viery)))))
               {}
            else{
               hatPlatznachrechts = false;
            }
        }
        return hatPlatznachrechts;
    }
    
    public boolean hatPlatznachlinks(){
        boolean hatPlatznachlinks = true;
        for(int i = 0; i< x1.size()-1; i++){
            if(!((x1.get(x1.size()-1).einsx-1 == (x1.get(i).einsx)) &&
            (x1.get(x1.size()-1).einsy == (x1.get(i).einsy))) &&
               !((x1.get(x1.size()-1).zweix-1 == (x1.get(i).einsx)) &&
               (x1.get(x1.size()-1).zweiy == (x1.get(i).einsy))) &&
               !((x1.get(x1.size()-1).dreix-1 == (x1.get(i).einsx)) &&
               (x1.get(x1.size()-1).dreiy == (x1.get(i).einsy))) &&
               !((x1.get(x1.size()-1).vierx-1 == (x1.get(i).einsx)) &&
               (x1.get(x1.size()-1).viery == (x1.get(i).einsy)))&&
              (!((x1.get(x1.size()-1).einsx-1 == (x1.get(i).zweix)) &&
            (x1.get(x1.size()-1).einsy == (x1.get(i).zweiy))) &&
               !((x1.get(x1.size()-1).zweix-1 == (x1.get(i).zweix)) &&
               (x1.get(x1.size()-1).zweiy == (x1.get(i).zweiy))) &&
               !((x1.get(x1.size()-1).dreix-1 == (x1.get(i).zweix)) &&
               (x1.get(x1.size()-1).dreiy == (x1.get(i).zweiy))) &&
               !((x1.get(x1.size()-1).vierx-1 == (x1.get(i).zweix)) &&
               (x1.get(x1.size()-1).viery == (x1.get(i).zweiy))))&&
               (!((x1.get(x1.size()-1).einsx-1 == (x1.get(i).dreix)) &&
            (x1.get(x1.size()-1).einsy == (x1.get(i).dreiy))) &&
               !((x1.get(x1.size()-1).zweix-1 == (x1.get(i).dreix)) &&
               (x1.get(x1.size()-1).zweiy == (x1.get(i).dreiy))) &&
               !((x1.get(x1.size()-1).dreix-1 == (x1.get(i).dreix)) &&
               (x1.get(x1.size()-1).dreiy == (x1.get(i).dreiy))) &&
               !((x1.get(x1.size()-1).vierx-1 == (x1.get(i).dreix)) &&
               (x1.get(x1.size()-1).viery == (x1.get(i).dreiy))))&&
               (!((x1.get(x1.size()-1).einsx-1 == (x1.get(i).vierx)) &&
            (x1.get(x1.size()-1).einsy == (x1.get(i).viery))) &&
               !((x1.get(x1.size()-1).zweix-1 == (x1.get(i).vierx)) &&
               (x1.get(x1.size()-1).zweiy == (x1.get(i).viery))) &&
               !((x1.get(x1.size()-1).dreix-1 == (x1.get(i).vierx)) &&
               (x1.get(x1.size()-1).dreiy == (x1.get(i).viery))) &&
               !((x1.get(x1.size()-1).vierx-1 == (x1.get(i).vierx)) &&
               (x1.get(x1.size()-1).viery == (x1.get(i).viery)))))
               {}
            else{
               hatPlatznachlinks = false;
            }
        }
        return hatPlatznachlinks;
    }
    
    public boolean hatPlatznachunten(){
        boolean hatPlatznachunten = true;
        for(int i = 0; i< x1.size()-1; i++){
            if(!((x1.get(x1.size()-1).einsx == (x1.get(i).einsx)) &&
            (x1.get(x1.size()-1).einsy+1 == (x1.get(i).einsy))) &&
               !((x1.get(x1.size()-1).zweix == (x1.get(i).einsx)) &&
               (x1.get(x1.size()-1).zweiy+1 == (x1.get(i).einsy))) &&
               !((x1.get(x1.size()-1).dreix == (x1.get(i).einsx)) &&
               (x1.get(x1.size()-1).dreiy+1 == (x1.get(i).einsy))) &&
               !((x1.get(x1.size()-1).vierx == (x1.get(i).einsx)) &&
               (x1.get(x1.size()-1).viery+1 == (x1.get(i).einsy)))&&
              (!((x1.get(x1.size()-1).einsx == (x1.get(i).zweix)) &&
            (x1.get(x1.size()-1).einsy+1 == (x1.get(i).zweiy))) &&
               !((x1.get(x1.size()-1).zweix == (x1.get(i).zweix)) &&
               (x1.get(x1.size()-1).zweiy+1 == (x1.get(i).zweiy))) &&
               !((x1.get(x1.size()-1).dreix == (x1.get(i).zweix)) &&
               (x1.get(x1.size()-1).dreiy+1 == (x1.get(i).zweiy))) &&
               !((x1.get(x1.size()-1).vierx == (x1.get(i).zweix)) &&
               (x1.get(x1.size()-1).viery+1 == (x1.get(i).zweiy))))&&
               (!((x1.get(x1.size()-1).einsx == (x1.get(i).dreix)) &&
            (x1.get(x1.size()-1).einsy+1 == (x1.get(i).dreiy))) &&
               !((x1.get(x1.size()-1).zweix == (x1.get(i).dreix)) &&
               (x1.get(x1.size()-1).zweiy+1 == (x1.get(i).dreiy))) &&
               !((x1.get(x1.size()-1).dreix == (x1.get(i).dreix)) &&
               (x1.get(x1.size()-1).dreiy+1 == (x1.get(i).dreiy))) &&
               !((x1.get(x1.size()-1).vierx == (x1.get(i).dreix)) &&
               (x1.get(x1.size()-1).viery+1 == (x1.get(i).dreiy))))&&
               (!((x1.get(x1.size()-1).einsx == (x1.get(i).vierx)) &&
            (x1.get(x1.size()-1).einsy+1 == (x1.get(i).viery))) &&
               !((x1.get(x1.size()-1).zweix == (x1.get(i).vierx)) &&
               (x1.get(x1.size()-1).zweiy+1 == (x1.get(i).viery))) &&
               !((x1.get(x1.size()-1).dreix == (x1.get(i).vierx)) &&
               (x1.get(x1.size()-1).dreiy+1 == (x1.get(i).viery))) &&
               !((x1.get(x1.size()-1).vierx == (x1.get(i).vierx)) &&
               (x1.get(x1.size()-1).viery+1 == (x1.get(i).viery)))))
               {}
            else{
               hatPlatznachunten = false;
            }
        }
        return hatPlatznachunten;
    }

    @Override
    void TasteGedrueckt(char taste)
    {
        switch(taste){
            case 'X':
            case 'x':
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
            case 's':
            case 'S':
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
            x1.add(new Teewee(this));
            break;

            case 1:
            x1.add(new HERO(this)); 
            break;

            case 2:
            x1.add(new OrangeRicky(this));
            break;

            case 3:
            x1.add(new Smashboy(this));
            break;

            case 4:
            x1.add(new RhodeIslandZ(this));
            break;

            case 5:
            x1.add(new BlackRicky(this));
            break;

            case 6:
            x1.add(new ClevelandZ(this));
            break;
        
        } 
    } 
  
}   

