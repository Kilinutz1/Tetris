
public class OrangeRicky extends Bausteine
{
   
    public OrangeRicky(Spiel neuesSpiel){  
     super(neuesSpiel);
     Bausteine OrangeRicky;
     OrangeRicky = new Bausteine(neuesSpiel);
     eins.PositionSetzen(12,3);
     zwei.PositionSetzen(13,3);
     drei.PositionSetzen(14,3);
     vier.PositionSetzen(14,2);
     einsx = 12;
     einsy = 3;
     zweix =13;
     zweiy =3;
     dreix =14;
     dreiy =3;
     vierx =14;
     viery = 2;
     farbewechseln("orange");
     Ausrichtung ='n';
     zeichnen();
    }
    @Override
    public void drehen(){
      if (Ausrichtung == 'n'){
            kannsichdrehen(2,-2,1,-1,0,0,1,1);
            if(kannsichdrehn){
            eins.PositionSetzen(einsx+2,einsy-2);
            zwei.PositionSetzen(zweix+1,zweiy-1);
            drei.PositionSetzen(dreix,dreiy);
            vier.PositionSetzen(vierx+1,viery+1);
            einsx = einsx+2;
            einsy = einsy-2;
            zweix =zweix+1;
            zweiy =zweiy-1;
            dreix =dreix;
            dreiy =dreiy;
            vierx =vierx+1;
            viery = viery+1;
            Ausrichtung ='o';
        }
        }
        else if (Ausrichtung == 'o'){
            kannsichdrehen(2,2,1,1,0,0,-1,1);
            if(kannsichdrehn){
            eins.PositionSetzen(einsx+2,einsy+2);
            zwei.PositionSetzen(zweix+1 ,zweiy+1);
            drei.PositionSetzen(dreix,dreiy);
            vier.PositionSetzen(vierx-1,viery+1);
            einsx = einsx+2;
            einsy = einsy+2;
            zweix =zweix+1;
            zweiy =zweiy+1;
            dreix =dreix;
            dreiy =dreiy;
            vierx =vierx-1;
            viery = viery+1;
            Ausrichtung ='s';
        }
        }
        else if (Ausrichtung == 's'){
            kannsichdrehen(-2,2,-1,1,0,0,-1,-1);
            if(kannsichdrehn){
            eins.PositionSetzen(einsx-2,einsy+2);
            zwei.PositionSetzen(zweix-1,zweiy+1);
            drei.PositionSetzen(dreix,dreiy);
            vier.PositionSetzen(vierx-1,viery-1);
            einsx = einsx-2;
            einsy = einsy+2;
            zweix =zweix -1 ;
            zweiy =zweiy +1;
            dreix =dreix;
            dreiy =dreiy;
            vierx =vierx-1;
            viery = viery-1;
            Ausrichtung ='w';
        }
        }
        else if (Ausrichtung == 'w'){
            kannsichdrehen(-2,-2,-1,-1,0,0,1,-1);
            if(kannsichdrehn){
            eins.PositionSetzen(einsx-2,einsy-2);
            zwei.PositionSetzen(zweix-1 ,zweiy-1);
            drei.PositionSetzen(dreix,dreiy);
            vier.PositionSetzen(vierx+1,viery-1);
            einsx = einsx-2;
            einsy = einsy-2;
            zweix =zweix -1 ;
            zweiy =zweiy-1;
            dreix =dreix;
            dreiy =dreiy;
            vierx =vierx+1;
            viery = viery-1;

            Ausrichtung ='n';
        }
      }        
    }
    
    
    @Override
    public void aufkommen(){
        
    }
}
