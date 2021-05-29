import java.util.Scanner;
public class PrincipalBichos{
    public static Bichos[][] arreglo= new Bichos[2][2];
    public static void main(String[] args){
        System.out.println("Presione 1 para iniciar");
        Scanner sc= new Scanner(System.in);
        int entrada= sc.nextInt();
        if(entrada==1){
            int num1 = (int)(Math.random() * 4+1);
            System.out.println("Se crearán "+num1+" Bichos");
            int contador=0;
            int contador2=0;
            for(int m=0; m<num1; m++){
                int num2 = (int)(Math.random() * 2+1);
                
                if(contador==0){
                    if(num2==1){
                        arreglo[0][0]=new BichosNormales();
                    }
                    else if(num2==2){
                        arreglo[0][0]=new BichosAliens();
                    }
                }
                if(contador==1){
                    if(num2==1){
                        arreglo[0][1]=new BichosNormales();
                    }
                    else if(num2==2){
                        arreglo[0][1]=new BichosAliens();
                    }
                }
                if(contador==2){
                    if(num2==1){
                        arreglo[1][0]=new BichosNormales();
                    }
                    else if(num2==2){
                        arreglo[1][0]=new BichosAliens();
                    }
                }
                if(contador==3){
                    if(num2==1){
                        arreglo[1][1]=new BichosNormales();
                    }
                    else if(num2==2){
                        arreglo[1][1]=new BichosAliens();
                    }
                }
                contador++;
                num2 = (int)(Math.random() * 2+1);
            }
            System.out.println(arreglo[0][0]);
            System.out.println(arreglo[0][1]);
            System.out.println(arreglo[1][0]);
            System.out.println(arreglo[1][1]); 
            System.out.println("-------------");
            System.out.println("|"+arreglo[0][0]+"|"+arreglo[0][1]+"|");
            System.out.println("-------------");
            System.out.println("|"+arreglo[1][0]+"|"+arreglo[1][1]+"|");
            System.out.println("-------------");

        }
        
    }
}

