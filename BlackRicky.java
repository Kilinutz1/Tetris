
public class BlackRicky extends Bausteine
{
   
    public BlackRicky(Spiel neuesSpiel){  
     super(neuesSpiel);
     Bausteine BlackRicky;
     BlackRicky = new Bausteine(neuesSpiel);
     eins.PositionSetzen(12,2);
     zwei.PositionSetzen(12,3);
     drei.PositionSetzen(13,3);
     vier.PositionSetzen(14,3);
     einsx = 12;
     einsy = 2;
     zweix =12;
     zweiy =3;
     dreix =13;
     dreiy =3;
     vierx =14;
     viery = 3;
     farbewechseln("schwarz");
     Ausrichtung ='n';
     zeichnen();
    }
    @Override
    public void drehen(){
     if (Ausrichtung == 'n'){
            kannsichdrehen(2,0,1,-1,0,0,-1,1);
            if(kannsichdrehn){
            eins.PositionSetzen(einsx+2,einsy);
            zwei.PositionSetzen(zweix+1,zweiy-1);
            drei.PositionSetzen(dreix,dreiy);
            vier.PositionSetzen(vierx-1,viery+1);
            einsx = einsx+2;
            einsy = einsy;
            zweix =zweix+1;
            zweiy =zweiy-1;
            dreix =dreix;
            dreiy =dreiy;
            vierx =vierx-1;
            viery = viery+1;
            Ausrichtung ='o';
        }
        }
        else if (Ausrichtung == 'o'){
            kannsichdrehen(0,2,1,1,0,0,-1,-1);
            if(kannsichdrehn){
            eins.PositionSetzen(einsx,einsy+2);
            zwei.PositionSetzen(zweix+1 ,zweiy+1);
            drei.PositionSetzen(dreix,dreiy);
            vier.PositionSetzen(vierx-1,viery-1);
            einsx = einsx;
            einsy = einsy+2;
            zweix =zweix+1 ;
            zweiy =zweiy+1;
            dreix =dreix;
            dreiy =dreiy;
            vierx =vierx-1;
            viery = viery-1;
            Ausrichtung ='s';
        }
        }
        else if (Ausrichtung == 's'){
            kannsichdrehen(-2,0,-1,1,0,0,1,-1);
            if(kannsichdrehn){
            eins.PositionSetzen(einsx-2,einsy);
            zwei.PositionSetzen(zweix-1,zweiy+1);
            drei.PositionSetzen(dreix,dreiy);
            vier.PositionSetzen(vierx+1,viery-1);
            einsx = einsx-2;
            einsy = einsy;
            zweix =zweix -1 ;
            zweiy =zweiy +1;
            dreix =dreix;
            dreiy =dreiy;
            vierx =vierx+1;
            viery = viery-1;
            Ausrichtung ='w';
        }
        }
        else if (Ausrichtung == 'w'){
            kannsichdrehen(0,-2,-1,-1,0,0,1,1);
            if(kannsichdrehn){
            eins.PositionSetzen(einsx,einsy-2);
            zwei.PositionSetzen(zweix-1 ,zweiy-1);
            drei.PositionSetzen(dreix,dreiy);
            vier.PositionSetzen(vierx+1,viery+1);
            einsx = einsx;
            einsy = einsy-2;
            zweix =zweix -1 ;
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
