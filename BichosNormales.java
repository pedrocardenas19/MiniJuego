public class BichosNormales extends Bichos{
    public BichosNormales(){
        super(10);
    }
    public String toString(){
       try{
            return "BN-"+this.getSalud;

        }
        catch(NullPointerException e){
            return "vacío";
        }
    
    }
}
