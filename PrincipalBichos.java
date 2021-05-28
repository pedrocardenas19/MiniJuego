public class PrincipalBichos{
    public static Bichos[][] arreglo= new Bichos[2][2];
    public static void main(String[] args){
        int num1 = (int)(Math.random() * 4+1);
        System.out.println(num1);
       for(int i=0; i<num1; i++){
        int num2 = (int)(Math.random() * 2+1);
        if(num2==1){
        arreglo[0][0]= new BichosNormales();
        }
        else if(num2==2){
        arreglo[0][1]= new BichosAliens();
        }
        System.out.println(num2);
        }
    }

}

