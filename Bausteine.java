
public class Bausteine{
    QUADER eins;
    QUADER zwei;
    QUADER drei;
    QUADER vier;
    int einsx;
    int einsy;
    int zweix;
    int zweiy;
    int dreix;
    int dreiy;
    int vierx;
    int viery;
    char Ausrichtung;
    String farbe;

    public Bausteine(){
        eins = new QUADER(einsx,einsy,farbe); 
        zwei = new QUADER(zweix,zweiy,farbe);
        drei = new QUADER(dreix,dreiy,farbe);
        vier = new QUADER(vierx,viery,farbe);
    }

    public void drehen(){

    }

    public void herunterfallen(){

    }

    public void seitlichbewegen(){

    }

    public void aufkommen(){
    }

}
