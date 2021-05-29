import java.util.Scanner;
public class PrincipalBichos{
    public static Bichos[][] bichos = new Bichos[2][2];
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
                        bichos[0][0]=new BichosNormales();
                    }
                    else if(num2==2){
                        bichos[0][0]=new BichosAliens();
                    }
                }
                if(contador==1){
                    if(num2==1){
                        bichos[0][1]=new BichosNormales();
                    }
                    else if(num2==2){
                        bichos[0][1]=new BichosAliens();
                    }
                }
                if(contador==2){
                    if(num2==1){
                        bichos[1][0]=new BichosNormales();
                    }
                    else if(num2==2){
                        bichos[1][0]=new BichosAliens();
                    }
                }
                if(contador==3){
                    if(num2==1){
                        bichos[1][1]=new BichosNormales();
                    }
                    else if(num2==2){
                        bichos[1][1]=new BichosAliens();
                    }
                }
                contador++;
                num2 = (int)(Math.random() * 2+1);
            }
            System.out.println(bichos[0][0]);
            System.out.println(bichos[0][1]);
            System.out.println(bichos[1][0]);
            System.out.println(bichos[1][1]); 
            int vidaTemp = 0;
            int vidaTotal = 1;
            while(true)
            {
                if(vidaTotal == 0)
                {
                    System.out.println("Juego terminado, gracias por jugar (racha de asesinatos)");
                    break;
                }
                System.out.println("-------------");
                System.out.println("|"+bichos[0][0]+"|"+bichos[0][1]+"|");
                System.out.println("-------------");
                System.out.println("|"+bichos[1][0]+"|"+bichos[1][1]+"|");
                System.out.println("-------------");

                System.out.println("Elija 1 para disparar una bala \n"+
                    "Elija 2 para activar una bomba atómica \n" +
                    "Elija 3 para activar bicho mutante.");
                int elegirAtaque = sc.nextInt();
                if(elegirAtaque == 1)
                {
                    System.out.println("Elija el bicho al que quiere atacar");
                    int posicionBicho = sc.nextInt();
                    int fila = 0;
                    int columna = 0;
                    if(posicionBicho == 1)
                    {
                        fila = 0;
                        columna = 0;
                    }
                    else if(posicionBicho == 2)
                    {
                        fila = 0;
                        columna = 1;
                    }
                    else if(posicionBicho == 3)
                    {
                        fila = 1;
                        columna = 0;
                    }
                    else if(posicionBicho == 4)
                    {
                        fila = 1;
                        columna = 1;
                    }
                    bichos[fila][columna].restarSalud(5);
                }
                else if(elegirAtaque == 2)
                {
                    while(true)
                    {
                        int i = (int)(Math.random() * 1.5);
                        int j = (int)(Math.random() * 1.5);

                        if(bichos[i][j] == null)
                        {
                            continue;
                        }
                        else if(bichos[i][j].getSalud() == 0)
                        {
                            continue;
                        }
                        else
                        {
                            bichos[i][j].matarBicho();
                            break;
                        }
                        
                    }

                }
                else if(elegirAtaque == 3)
                {
                    Bichos bichoTemp;
                    int minimo = 99;
                    int fila = 0;
                    int columna = 0;
                    for(int i = 0; i < bichos.length; i++){
                        for(int j = 0; j < bichos[i].length; j++){
                            if(bichos[i][j] == null)
                            {
                                System.out.println("Ahí no hay na'");
                                break;
                            }
                            else if(bichos[i][j].getSalud() < minimo)
                            {
                                bichoTemp = bichos[i][j];
                                minimo = bichoTemp.getSalud();
                                fila = i;
                                System.out.println(bichos[i][j].getSalud() + "\n" + fila);
                                columna = j;
                                System.out.println(columna);
                            }

                        }
                    }
                    bichos[fila][columna].duplicarSalud();

                }
                vidaTemp = 0;
                for(int i = 0; i < bichos.length; i++){
                    for(int j = 0; j < bichos[i].length; j++){
                        if(bichos[i][j] == null)
                        {
                            break;
                        }
                        else
                        {
                            vidaTemp = vidaTemp + bichos[i][j].getSalud();
                            vidaTotal = vidaTemp;
                        }
                    }
                }
            }
        }

    }
}

