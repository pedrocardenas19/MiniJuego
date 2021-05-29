public class BichosAliens extends Bichos{
    public BichosAliens(){
        super(20);
    }

    public String toString(){
        try{
            return "BA-"+this.getSalud;

        }
        catch(NullPointerException e){
            return "vacío";
        }
    }   
}
