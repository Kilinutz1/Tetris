
public class Smashboy extends Bausteine
{
   
    public Smashboy(){  
     super();
     Bausteine Smashboy;
     Smashboy = new Bausteine();
     eins.PositionSetzen(12,2);
     zwei.PositionSetzen(13,2);
     drei.PositionSetzen(12,3);
     vier.PositionSetzen(13,3);
     einsx = 12;
     einsy = 2;
     zweix =13;
     zweiy =2;
     dreix =12;
     dreiy =3;
     vierx =13;
     viery = 3;
     farbewechseln("gelb");
     Ausrichtung ='n';
     zeichnen();
    }
    @Override
    public void drehen(){
        
    }
    
    @Override
    public void seitlichbewegen(){
        
    }
    @Override
    public void aufkommen(){
        
    }
}
