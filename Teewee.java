
public class Teewee extends Bausteine
{
   
    public Teewee(){  
     super();
     Bausteine Teewee;
     Teewee = new Bausteine();
     eins.PositionSetzen(12,3);
     zwei.PositionSetzen(13,3);
     drei.PositionSetzen(13,2);
     vier.PositionSetzen(14,3);
     einsx = 12;
     einsy = 3;
     zweix =13;
     zweiy =3;
     dreix =13;
     dreiy =2;
     vierx =14;
     viery = 3;
     farbewechseln("violett");
     Ausrichtung ='n';
     zeichnen();
    }
    @Override
    public void drehen(){
        if (Ausrichtung == 'n'){
     eins.PositionSetzen(einsx+1,einsy-1);
     zwei.PositionSetzen(zweix,zweiy);
     drei.PositionSetzen(dreix+1,dreiy+1);
     vier.PositionSetzen(vierx-1,viery+1);
     einsx = einsx+1;
     einsy = einsy-1;
     zweix =zweix;
     zweiy =zweiy;
     dreix =dreix+1;
     dreiy =dreiy+1;
     vierx =vierx-1;
     viery = viery+1;
     Ausrichtung ='o';
    }
    else if (Ausrichtung == 'o'){
    eins.PositionSetzen(einsx+1,einsy+1);
     zwei.PositionSetzen(zweix ,zweiy);
     drei.PositionSetzen(dreix-1,dreiy+1);
     vier.PositionSetzen(vierx-1,viery-1);
     einsx = einsx+1;
     einsy = einsy+1;
     zweix =zweix ;
     zweiy =zweiy;
     dreix =dreix-1;
     dreiy =dreiy+1;
     vierx =vierx-1;
     viery = viery-1;
    Ausrichtung ='s';
    }
    else if (Ausrichtung == 's'){
     eins.PositionSetzen(einsx-1,einsy+1);
     zwei.PositionSetzen(zweix,zweiy);
     drei.PositionSetzen(dreix-1,dreiy-1);
     vier.PositionSetzen(vierx+1,viery-1);
     einsx = einsx-1;
     einsy = einsy+1;
     zweix =zweix ;
     zweiy =zweiy;
     dreix =dreix-1;
     dreiy =dreiy-1;
     vierx =vierx+1;
     viery = viery-1;
    Ausrichtung ='w';
    
    }
    else if (Ausrichtung == 'w'){
     eins.PositionSetzen(einsx-1,einsy-1);
     zwei.PositionSetzen(zweix ,zweiy);
     drei.PositionSetzen(dreix+1,dreiy-1);
     vier.PositionSetzen(vierx+1,viery+1);
     einsx = einsx-1;
     einsy = einsy-1;
     zweix =zweix ;
     zweiy =zweiy;
     dreix =dreix+1;
     dreiy =dreiy-1;
     vierx =vierx+1;
     viery = viery+1;
    
     Ausrichtung ='n';
    }
    }
    
    
    @Override
    public void aufkommen(){
        
    }
}
