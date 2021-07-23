
public class Bausteine{
    int cool;
    int Außersterlinkspunkt;
    int Außersterrechtspunkt;
    int untersterpunkt;
    int Außersterlinkspunkt2;
    int Außersterrechtspunkt2;
    int untersterpunkt2;
    QUADER eins;
    QUADER zwei;
    Spiel s;
    QUADER drei;
    QUADER vier;
    boolean wert;
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
    boolean kannsichdrehn;
    public Bausteine(Spiel neuesSpiel){
        s= neuesSpiel;
        eins = new QUADER(einsx,einsy,farbe); 
        zwei = new QUADER(zweix,zweiy,farbe);
        drei = new QUADER(dreix,dreiy,farbe);
        vier = new QUADER(vierx,viery,farbe);
    }

    public void drehen(){

    }

    public void herunterfallen(){

        vergleichenseite(); 
        if(untersterpunkt<17 && s.hatPlatznachunten()){
            eins.PositionSetzen(einsx, einsy+1);
            zwei.PositionSetzen(zweix, zweiy+1);
            drei.PositionSetzen(dreix, dreiy+1);
            vier.PositionSetzen(vierx, viery+1);
            einsy = einsy +1;
            zweiy = zweiy +1;
            dreiy = dreiy +1;
            viery = viery +1;
            zeichnen();

        }
        else{
            cool =1;

        }
    }

    public void vergleichenseite(){
        int gx=einsx;
        int mx= einsx;
        int gy = einsy;
        if (gx >= zweix){}
        else{
            gx =zweix;    
        }
        if (gx >= dreix){}
        else{
            gx =dreix;    
        }
        if (gx >= vierx){}
        else{
            gx =vierx;    
        }

        if (mx <= zweix){}
        else{
            mx =zweix;
        }
        if (mx <= dreix){}
        else{
            mx =dreix;
        }
        if (mx <= vierx){}
        else{
            mx =vierx;
        }

        if (gy >= zweiy){}
        else{
            gy =zweiy;
        }
        if (gy >= dreiy){}
        else{
            gy =dreiy;
        }
        if (gy >= viery){}
        else{
            gy =viery;
        }
        Außersterlinkspunkt=mx;
        Außersterrechtspunkt=gx;
        untersterpunkt =gy;
    }

    public void vergleichenseite2(int vx1, int vy1,int vx2, int vy2,int vx3, int vy3,int vx4, int vy4){
        int gx2=einsx+vx1;
        int mx2= einsx+vx1;
        int gy2 = einsy+vy1;
        if (gx2 >= zweix+vx2){}
        else{
            gx2 =zweix+vx2;    
        }
        if (gx2 >= dreix+vx3){}
        else{
            gx2 =dreix+vx3;    
        }
        if (gx2 >= vierx+vx4){}
        else{
            gx2 =vierx+vx4;    
        }

        if (mx2 <= zweix+vx2){}
        else{
            mx2 =zweix+vx2;
        }
        if (mx2 <= dreix+vx3){}
        else{
            mx2 =dreix+vx3;
        }
        if (mx2 <= vierx+vx4){}
        else{
            mx2 =vierx+vx4;
        }

        if (gy2 >= zweiy+vy2){}
        else{
            gy2 =zweiy+vy2;
        }
        if (gy2 >= dreiy+vy3){}
        else{
            gy2 =dreiy+vy3;
        }
        if (gy2 >= viery+vy4){}
        else{
            gy2 =viery+vy4;
        }
        Außersterlinkspunkt2=mx2;
        Außersterrechtspunkt2=gx2;
        untersterpunkt2 =gy2;
    }

    public void rechtsbewegen(){
        vergleichenseite();
        if(Außersterrechtspunkt<17 && s.hatPlatznachrechts()){
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

    }

    public void linksbewegen(){
        vergleichenseite();
        if(Außersterlinkspunkt>8 && s.hatPlatznachlinks()){
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

    public boolean kannsichdrehen(int vx1, int vy1,int vx2, int vy2, int vx3, int vy3, int vx4, int vy4){
        kannsichdrehn = true;
        vergleichenseite2(vx1,vy1,vx2,vy2,vx3, vy3, vx4,vy4);
        if(Außersterlinkspunkt2>7 && Außersterrechtspunkt2<18 && untersterpunkt2<17){
            for(int i = 0; i< s.x1.size()-1; i++){
                if(
                !((s.x1.get(s.x1.size()-1).einsx+vx1 == (s.x1.get(i).einsx)) &&
                    (s.x1.get(s.x1.size()-1).einsy+vy1 == (s.x1.get(i).einsy))) &&
                !((s.x1.get(s.x1.size()-1).zweix+vx2 == (s.x1.get(i).einsx)) &&
                    (s.x1.get(s.x1.size()-1).zweiy+vy2 == (s.x1.get(i).einsy))) &&
                !((s.x1.get(s.x1.size()-1).dreix+vx3 == (s.x1.get(i).einsx)) &&
                    (s.x1.get(s.x1.size()-1).dreiy+vy3 == (s.x1.get(i).einsy))) &&
                !((s.x1.get(s.x1.size()-1).vierx+vx4 == (s.x1.get(i).einsx)) &&
                    (s.x1.get(s.x1.size()-1).viery+vy4 == (s.x1.get(i).einsy))) &&

                !((s.x1.get(s.x1.size()-1).einsx+vx1 == (s.x1.get(i).zweix)) &&
                    (s.x1.get(s.x1.size()-1).einsy+vy1 == (s.x1.get(i).zweiy))) &&
                !((s.x1.get(s.x1.size()-1).zweix+vx2 == (s.x1.get(i).zweix)) &&
                    (s.x1.get(s.x1.size()-1).zweiy+vy2 == (s.x1.get(i).zweiy))) &&
                !((s.x1.get(s.x1.size()-1).dreix+vx3 == (s.x1.get(i).zweix)) &&
                    (s.x1.get(s.x1.size()-1).dreiy+vy3 == (s.x1.get(i).zweiy))) &&
                !((s.x1.get(s.x1.size()-1).vierx+vx4 == (s.x1.get(i).zweix)) &&
                    (s.x1.get(s.x1.size()-1).viery+vy4 == (s.x1.get(i).zweiy))) &&

                !((s.x1.get(s.x1.size()-1).einsx+vx1 == (s.x1.get(i).dreix)) &&
                    (s.x1.get(s.x1.size()-1).einsy+vy1 == (s.x1.get(i).dreiy))) &&
                !((s.x1.get(s.x1.size()-1).zweix+vx2 == (s.x1.get(i).dreix)) &&
                    (s.x1.get(s.x1.size()-1).zweiy+vy2 == (s.x1.get(i).dreiy))) &&
                !((s.x1.get(s.x1.size()-1).dreix+vx3 == (s.x1.get(i).dreix)) &&
                    (s.x1.get(s.x1.size()-1).dreiy+vy3 == (s.x1.get(i).dreiy))) &&
                !((s.x1.get(s.x1.size()-1).vierx+vx4 == (s.x1.get(i).dreix)) &&
                    (s.x1.get(s.x1.size()-1).viery+vy4 == (s.x1.get(i).dreiy))) &&

                !((s.x1.get(s.x1.size()-1).einsx+vx1 == (s.x1.get(i).vierx)) &&
                    (s.x1.get(s.x1.size()-1).einsy+vy1 == (s.x1.get(i).viery))) &&
                !((s.x1.get(s.x1.size()-1).zweix+vx2 == (s.x1.get(i).vierx)) &&
                    (s.x1.get(s.x1.size()-1).zweiy+vy2 == (s.x1.get(i).viery))) &&
                !((s.x1.get(s.x1.size()-1).dreix+vx3 == (s.x1.get(i).vierx)) &&
                    (s.x1.get(s.x1.size()-1).dreiy+vy3 == (s.x1.get(i).viery))) &&
                !((s.x1.get(s.x1.size()-1).vierx+vx4 == (s.x1.get(i).vierx)) &&
                    (s.x1.get(s.x1.size()-1).viery+vy4 == (s.x1.get(i).viery))) 

                )
                {}
                else{
                    kannsichdrehn = false;
                }
            }
        }
        else{
        kannsichdrehn =false;
        }
        return kannsichdrehn;
    }
}
