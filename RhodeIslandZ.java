
public class RhodeIslandZ extends Bausteine
{

    public RhodeIslandZ(Spiel neuesSpiel){  
        super(neuesSpiel);
        Bausteine RhodeIslandZ;
        RhodeIslandZ = new Bausteine(neuesSpiel);
        eins.PositionSetzen(12,3);
        zwei.PositionSetzen(13,3);
        drei.PositionSetzen(13,2);
        vier.PositionSetzen(14,2);
        einsx = 12;
        einsy = 3;
        zweix =13;
        zweiy =3;
        dreix =13;
        dreiy =2;
        vierx =14;
        viery = 2;
        farbewechseln("gruen");
        Ausrichtung ='n';
        zeichnen();
    }

    @Override
    public void drehen(){
        if (Ausrichtung == 'n'){
            eins.PositionSetzen(einsx,einsy-2);
            zwei.PositionSetzen(zweix-1,zweiy-1);
            drei.PositionSetzen(dreix,dreiy);
            vier.PositionSetzen(vierx-1,viery+1);
            einsx = einsx;
            einsy = einsy-2;
            zweix =zweix-1;
            zweiy =zweiy-1;
            dreix =dreix;
            dreiy =dreiy;
            vierx =vierx-1;
            viery = viery+1;
            Ausrichtung ='o';
        }
        else if (Ausrichtung == 'o'){
            eins.PositionSetzen(einsx+2,einsy);
            zwei.PositionSetzen(zweix+1 ,zweiy-1);
            drei.PositionSetzen(dreix,dreiy);
            vier.PositionSetzen(vierx-1,viery-1);
            einsx = einsx+2;
            einsy = einsy;
            zweix =zweix+1 ;
            zweiy =zweiy-1;
            dreix =dreix;
            dreiy =dreiy;
            vierx =vierx-1;
            viery = viery-1;
            Ausrichtung ='s';
        }
        else if (Ausrichtung == 's'){
            eins.PositionSetzen(einsx,einsy+2);
            zwei.PositionSetzen(zweix+1,zweiy+1);
            drei.PositionSetzen(dreix,dreiy);
            vier.PositionSetzen(vierx+1,viery-1);
            einsx = einsx;
            einsy = einsy+2;
            zweix =zweix +1 ;
            zweiy =zweiy +1;
            dreix =dreix;
            dreiy =dreiy;
            vierx =vierx+1;
            viery = viery-1;
            Ausrichtung ='w';

        }
        else if (Ausrichtung == 'w'){
            eins.PositionSetzen(einsx-2,einsy);
            zwei.PositionSetzen(zweix-1 ,zweiy+1);
            drei.PositionSetzen(dreix,dreiy);
            vier.PositionSetzen(vierx+1,viery+1);
            einsx = einsx-2;
            einsy = einsy;
            zweix =zweix -1 ;
            zweiy =zweiy+1;
            dreix =dreix;
            dreiy =dreiy;
            vierx =vierx+1;
            viery = viery+1;

            Ausrichtung ='n';
        }   
    }

    @Override
    public void aufkommen(){

    }
}
