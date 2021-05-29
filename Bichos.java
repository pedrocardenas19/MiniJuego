public class Bichos{
    private int salud;
    public Bichos(int n){
        this.salud=n;
    }
    public int getSalud(){
        return this.salud;
    }
    
    public void restarSalud(int health)
    {
        this.salud = this.salud - health;
    }
    
    public void matarBicho()
    {
        this.salud = 0;
    }
    
    public void duplicarSalud()
    {
        this.salud = this.salud*2;
    }
}