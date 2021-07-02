
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

    public void seitlichbewegen(){

    }

    public void aufkommen(){
    }

    public void zeichnen(){
        eins.zeichne();
        zwei.zeichne();
        drei.zeichne();
        vier.zeichne();
    }
}
