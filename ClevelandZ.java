
public class ClevelandZ extends Bausteine
{
   
    public ClevelandZ(Spiel neuesSpiel){  
     super(neuesSpiel);
     Bausteine ClevelandZ;
     ClevelandZ = new Bausteine(neuesSpiel);
     eins.PositionSetzen(12,2);
     zwei.PositionSetzen(13,2);
     drei.PositionSetzen(13,3);
     vier.PositionSetzen(14,3);
     einsx = 12;
     einsy = 2;
     zweix =13;
     zweiy =2;
     dreix =13;
     dreiy =3;
     vierx =14;
     viery = 3;
     farbewechseln("rot");
     Ausrichtung ='n';
     zeichnen();
    }
    @Override
    public void drehen(){
    if (Ausrichtung == 'n'){
     eins.PositionSetzen(einsx+1,einsy-1);
     zwei.PositionSetzen(zweix ,zweiy);
     drei.PositionSetzen(dreix-1,dreiy-1);
     vier.PositionSetzen(vierx-2,viery);
     einsx = einsx+1;
     einsy = einsy-1;
     zweix =zweix;
     zweiy =zweiy;
     dreix =dreix-1;
     dreiy =dreiy-1;
     vierx =vierx-2;
     viery = viery;
     Ausrichtung ='o';
    }
    else if (Ausrichtung == 'o'){
    eins.PositionSetzen(einsx+1,einsy+1);
     zwei.PositionSetzen(zweix ,zweiy);
     drei.PositionSetzen(dreix+1,dreiy-1);
     vier.PositionSetzen(vierx,viery-2);
     einsx = einsx+1;
     einsy = einsy+1;
     zweix =zweix ;
     zweiy =zweiy;
     dreix =dreix+1;
     dreiy =dreiy-1;
     vierx =vierx;
     viery = viery-2;
    Ausrichtung ='s';
    }
    else if (Ausrichtung == 's'){
     eins.PositionSetzen(einsx-1,einsy+1);
     zwei.PositionSetzen(zweix,zweiy);
     drei.PositionSetzen(dreix+1,dreiy+1);
     vier.PositionSetzen(vierx+2,viery);
     einsx = einsx-1;
     einsy = einsy+1;
     zweix =zweix ;
     zweiy =zweiy;
     dreix =dreix+1;
     dreiy =dreiy+1;
     vierx =vierx+2;
     viery = viery;
    Ausrichtung ='w';
    
    }
    else if (Ausrichtung == 'w'){
    eins.PositionSetzen(einsx-1,einsy-1);
     zwei.PositionSetzen(zweix ,zweiy);
     drei.PositionSetzen(dreix-1,dreiy+1);
     vier.PositionSetzen(vierx,viery+2);
     einsx = einsx-1;
     einsy = einsy-1;
     zweix =zweix ;
     zweiy =zweiy;
     dreix =dreix-1;
     dreiy =dreiy+1;
     vierx =vierx;
     viery = viery+2;
    
    Ausrichtung ='n';
}
    }
    
    
    @Override
    public void aufkommen(){
        
    }
}
