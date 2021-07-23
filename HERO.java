
public class HERO extends Bausteine
{

    public HERO(Spiel neuesSpiel){  
        super(neuesSpiel);
        Bausteine HERO;
        HERO = new Bausteine(neuesSpiel);
        eins.PositionSetzen(12,2);
        zwei.PositionSetzen(13,2);
        drei.PositionSetzen(14,2);
        vier.PositionSetzen(15,2);
        einsx = 12;
        einsy = 2;
        zweix =13;
        zweiy =2;
        dreix =14;
        dreiy =2;
        vierx =15;
        viery = 2;
        farbewechseln("blau");
        Ausrichtung ='n';
        zeichnen();
    }

    @Override
    public void drehen(){
        if (Ausrichtung == 'n'){
            kannsichdrehen(2,-2,1,-1,0,0,-1,+1);
            if(kannsichdrehn){   
                eins.PositionSetzen(einsx+2,einsy-2);
                zwei.PositionSetzen(zweix +1,zweiy-1);
                drei.PositionSetzen(dreix,dreiy);
                vier.PositionSetzen(vierx-1,viery+1);
                einsx = einsx+2;
                einsy = einsy-2;
                zweix =zweix +1;
                zweiy =zweiy-1;
                dreix =dreix;
                dreiy =dreiy;
                vierx =vierx-1;
                viery = viery+1;
                Ausrichtung ='o';
            }
        }
        else if (Ausrichtung == 'o'){
            kannsichdrehen(2,2,1,1,0,0,-1,-1);
            if(kannsichdrehn){
                eins.PositionSetzen(einsx+2,einsy+2);
                zwei.PositionSetzen(zweix +1,zweiy+1);
                drei.PositionSetzen(dreix,dreiy);
                vier.PositionSetzen(vierx-1,viery-1);
                einsx = einsx+2;
                einsy = einsy+2;
                zweix =zweix +1;
                zweiy =zweiy+1;
                dreix =dreix;
                dreiy =dreiy;
                vierx =vierx-1;
                viery = viery-1;
                Ausrichtung ='s';
            }
        }
        else if (Ausrichtung == 's'){
            kannsichdrehen(-2,2,-1,1,0,0,1,-1);
            if(kannsichdrehn){
                eins.PositionSetzen(einsx-2,einsy+2);
                zwei.PositionSetzen(zweix-1,zweiy+1);
                drei.PositionSetzen(dreix,dreiy);
                vier.PositionSetzen(vierx+1,viery-1);
                einsx = einsx-2;
                einsy = einsy+2;
                zweix =zweix-1 ;
                zweiy =zweiy+1;
                dreix =dreix;
                dreiy =dreiy;
                vierx =vierx+1;
                viery = viery-1;
                Ausrichtung ='w';
            }
        }
        else if (Ausrichtung == 'w'){
            kannsichdrehen(-2,-2,-1,-1,0,0,1,1);
            if(kannsichdrehn){
                eins.PositionSetzen(einsx-2,einsy-2);
                zwei.PositionSetzen(zweix -1,zweiy-1);
                drei.PositionSetzen(dreix,dreiy);
                vier.PositionSetzen(vierx+1,viery+1);
                einsx = einsx-2;
                einsy = einsy-2;
                zweix =zweix -1;
                zweiy =zweiy-1;
                dreix =dreix;
                dreiy =dreiy;
                vierx =vierx+1;
                viery = viery+1;

                Ausrichtung ='n';
            }
        }
    }

    @Override
    public void aufkommen(){

    }
}
