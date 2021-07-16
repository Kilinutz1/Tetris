
public class Bausteine{
    QUADER eins;
    QUADER zwei;
    QUADER drei;
    QUADER vier;
    int einsx =0;
    int einsy =0;
    int zweix =0;
    int zweiy =0;
    int dreix =0;
    int dreiy =0;
    int vierx =0;
    int viery =0;
    char Ausrichtung;
    String farbe = "blau";
    private int[][] belegteZellen;
    

    public Bausteine(){
        eins = new QUADER(einsx,einsy,farbe); 
        zwei = new QUADER(zweix,zweiy,farbe);
        drei = new QUADER(dreix,dreiy,farbe);
        vier = new QUADER(vierx,viery,farbe);
    }
    
    public void drehen(){

    }

    public void herunterfallen(){
        eins.PositionSetzen(einsx, einsy+1);
        zwei.PositionSetzen(zweix, zweiy+1);
        drei.PositionSetzen(dreix, dreiy+1);
        vier.PositionSetzen(vierx, viery+1);
        zeichnen();
        einsy = einsy +1;
        zweiy = zweiy +1;
        dreiy = dreiy +1;
        viery = viery +1;
    }

    public void rechtsbewegen(){
        eins.PositionSetzen(einsx+1, einsy);
        zwei.PositionSetzen(zweix+1, zweiy);
        drei.PositionSetzen(dreix+1, dreiy);
        vier.PositionSetzen(vierx+1, viery);
        zeichnen();
        einsx = einsx +1;
        zweix = zweix +1;
        dreix = dreix +1;
        vierx = vierx +1; 
    }
    public void linksbewegen(){
        eins.PositionSetzen(einsx-1, einsy);
        zwei.PositionSetzen(zweix-1, zweiy);
        drei.PositionSetzen(dreix-1, dreiy);
        vier.PositionSetzen(vierx-1, viery);
        zeichnen();
        einsx = einsx -1;
        zweix = zweix -1;
        dreix = dreix -1;
        vierx = vierx -1;
    }
    public void aufkommen(){
    }

    public void zeichnen(){
        eins.zeichne();
        zwei.zeichne();
        drei.zeichne();
        vier.zeichne();
    }
    public void farbewechseln(String farbe){
        eins.farbeSetzen(farbe);
        zwei.farbeSetzen(farbe);
        drei.farbeSetzen(farbe);
        vier.farbeSetzen(farbe);
    }
}
