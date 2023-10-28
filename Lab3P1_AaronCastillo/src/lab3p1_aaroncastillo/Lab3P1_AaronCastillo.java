
package lab3p1_aaroncastillo;

import java.util.Scanner;


public class Lab3P1_AaronCastillo {


    public static void main(String[] args) {
        int opcion;
        Scanner leer=new Scanner(System.in);
        System.out.println("1. Sucesiones y más sucesiones!");
        System.out.println("2. Pocket Monsters");
        System.out.println("3. Asterisco en casa!");
        System.out.print("Ingrese su opcion: ");
        opcion=leer.nextInt();
        while (opcion>0&&opcion<4){
            switch (opcion){
            case 1:
                int dif, inicial, cantidad;
                System.out.print("Ingrese la diferencia: ");
                dif=leer.nextInt();
                System.out.print("Inngrese la inicial: ");
                inicial=leer.nextInt();
                System.out.print("Ingrese la cantidad: ");
                cantidad=leer.nextInt();
                for (int i=1;i<=cantidad;i++){
                    System.out.print(inicial);
                    inicial=inicial+dif;
                    if (i<cantidad){
                        System.out.print(", ");
                    }
                    dif=dif+1;
                }
                System.out.println("");
                System.out.print("Que numero desea ver mas adelante en la secuensia? ");
                int sec=leer.nextInt();
                for (int j=cantidad;j<sec-1;j++){
                    inicial +=dif;
                    dif=dif+1;
                }
                System.out.println(inicial);
                break;
            case 2:
                int opcion2;
                System.out.println("Ingrese que modo de pelea pokemon desea: ");
                System.out.println("1.- Hasta la muerte");
                System.out.println("2.- Por rondas");
                opcion2=leer.nextInt();
                System.out.println("Estadisticas de los pokemones");
                System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                System.out.println("Gyarados Vida:300 Ataque:50 Defensa:10%");
                System.out.println("Giratina Vida:300 Ataque:70 Defensa:25%");
                System.out.println("Dragonite Vida:250 Ataque:75 Defensa:20%");
                System.out.println("");
                System.out.println("Ingrese una pelea determinada");
                System.out.println("1.- Sylveon vrs Dragonite");
                System.out.println("2.- Gyarados vrs Giratina");
                System.out.println("3.- Dragonite yrs Giratina");
                System.out.println("4.- Giratina vra Sylveon");
                int pelea=leer.nextInt();
                switch (opcion2){
                    case 1:
                        switch (pelea){
                            case 1:
                                double vida1=280, vida2=250;
                                int ronda=1;
                                while (vida1>0&&vida2>0){
                                    System.out.println("---------- Ronda "+ronda+" ----------");
                                    System.out.println("Vida de pokemon 1: "+vida1);
                                    System.out.println("Vida de pokemon 2: "+vida2);
                                    System.out.println("");
                                    System.out.println("Pokemon 1 Ha atacado!");
                                    System.out.println("Pokemon 2 Ha atacado!");
                                    vida1=vida1-75*0.85;
                                    vida2=vida2-80*0.8;
                                    if (vida1<0){
                                        vida1=vida1-vida1;
                                    }
                                    if(vida2<0){
                                        vida2=vida2-vida2;
                                    }
                                    System.out.println("Vida de pokemon 1: "+vida1);
                                    System.out.println("Vida de pokemon 2: "+vida2);
                                    ronda=ronda+1;
                                }//fin while
                                System.out.println("");
                                System.out.println("***** Fin de la Batalla *****");
                                if (vida1>0){
                                    System.out.println("Pokemon 1 Ha sido el ganador!");
                                }else if(vida2>0){
                                    System.out.println("Pokemon 2 Ha sido el ganador!");
                                }else{
                                    System.out.println("Fue un empate!");
                                }
                                break;
                            case 2:
                                vida1=300;
                                vida2=300;
                                ronda=1;
                                while (vida1>0&&vida2>0){
                                    System.out.println("---------- Ronda "+ronda+" ----------");
                                    System.out.println("Vida de pokemon 1: "+vida1);
                                    System.out.println("Vida de pokemon 2: "+vida2);
                                    System.out.println("");
                                    System.out.println("Pokemon 1 Ha atacado!");
                                    System.out.println("Pokemon 2 Ha atacado!");
                                    vida1=vida1-70*0.9;
                                    vida2=vida2-50*0.75;
                                    if (vida1<0){
                                        vida1=vida1-vida1;
                                    }
                                    if(vida2<0){
                                        vida2=vida2-vida2;
                                    }
                                    System.out.println("Vida de pokemon 1: "+vida1);
                                    System.out.println("Vida de pokemon 2: "+vida2);
                                    ronda=ronda+1;
                                }//fin while
                                System.out.println("");
                                System.out.println("***** Fin de la Batalla *****");
                                if (vida1>0){
                                    System.out.println("Pokemon 1 Ha sido el ganador!");
                                }else if(vida2>0){
                                    System.out.println("Pokemon 2 Ha sido el ganador!");
                                }else{
                                    System.out.println("Fue un empate!");
                                }
                                break;
                            case 3:
                                vida1=250;
                                vida2=300;
                                ronda=1;
                                while (vida1>0&&vida2>0){
                                    System.out.println("---------- Ronda "+ronda+" ----------");
                                    System.out.println("Vida de pokemon 1: "+vida1);
                                    System.out.println("Vida de pokemon 2: "+vida2);
                                    System.out.println("");
                                    System.out.println("Pokemon 1 Ha atacado!");
                                    System.out.println("Pokemon 2 Ha atacado!");
                                    vida1=vida1-70*0.8;
                                    vida2=vida2-75*0.75;
                                    if (vida1<0){
                                        vida1=vida1-vida1;
                                    }
                                    if(vida2<0){
                                        vida2=vida2-vida2;
                                    }
                                    System.out.println("Vida de pokemon 1: "+vida1);
                                    System.out.println("Vida de pokemon 2: "+vida2);
                                    ronda=ronda+1;
                                }//fin while
                                System.out.println("");
                                System.out.println("***** Fin de la Batalla *****");
                                if (vida1>0){
                                    System.out.println("Pokemon 1 Ha sido el ganador!");
                                }else if(vida2>0){
                                    System.out.println("Pokemon 2 Ha sido el ganador!");
                                }else{
                                    System.out.println("Fue un empate!");
                                }
                                break;
                            case 4:
                                vida1=300;
                                vida2=280;
                                ronda=1;
                                while (vida1>0&&vida2>0){
                                    System.out.println("---------- Ronda "+ronda+" ----------");
                                    System.out.println("Vida de pokemon 1: "+vida1);
                                    System.out.println("Vida de pokemon 2: "+vida2);
                                    System.out.println("");
                                    System.out.println("Pokemon 1 Ha atacado!");
                                    System.out.println("Pokemon 2 Ha atacado!");
                                    vida1=vida1-80*0.8;
                                    vida2=vida2-70*0.85;
                                    if (vida1<0){
                                        vida1=vida1-vida1;
                                    }
                                    if(vida2<0){
                                        vida2=vida2-vida2;
                                    }
                                    System.out.println("Vida de pokemon 1: "+vida1);
                                    System.out.println("Vida de pokemon 2: "+vida2);
                                    ronda=ronda+1;
                                }//fin while
                                System.out.println("");
                                System.out.println("***** Fin de la Batalla *****");
                                if (vida1>0){
                                    System.out.println("Pokemon 1 Ha sido el ganador!");
                                }else if(vida2>0){
                                    System.out.println("Pokemon 2 Ha sido el ganador!");
                                }else{
                                    System.out.println("Fue un empate!");
                                }
                                break;
                                
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese cuanto rondas desea [maximo 10]: ");
                        int ronda=leer.nextInt();
                        if (ronda<10&&ronda>0){
                            switch (pelea){
                            case 1:
                                double vida1=280, vida2=250;
                                    for (int i=1;i<=ronda;i++){
                                        if (i<=4){
                                            System.out.println("---------- Ronda "+i+" ----------");
                                            System.out.println("Vida de pokemon 1: "+vida1);
                                            System.out.println("Vida de pokemon 2: "+vida2);
                                            System.out.println("");
                                            System.out.println("Pokemon 1 Ha atacado!");
                                            System.out.println("Pokemon 2 Ha atacado!");
                                            vida1=vida1-75*0.85;
                                            vida2=vida2-80*0.8;
                                            if (vida1<0){
                                                vida1=vida1-vida1;
                                            }
                                            if(vida2<0){
                                                vida2=vida2-vida2;
                                            }
                                            System.out.println("Vida de pokemon 1: "+vida1);
                                            System.out.println("Vida de pokemon 2: "+vida2);
                                            }
                                    }
                                System.out.println("");
                                System.out.println("***** Fin de la Batalla *****");
                                if (ronda>4){
                                    System.out.println("Los pokemones duraron hasta la ronda: 4");
                                }
                                if (vida1>vida2){
                                    System.out.println("Pokemon 1 Ha sido el ganador!");
                                }else if(vida2>vida1){
                                    System.out.println("Pokemon 2 Ha sido el ganador!");
                                }else{
                                    System.out.println("Fue un empate!");
                                }
                                break;
                            case 2:
                                vida1=300;
                                vida2=300;
                                for (int i=1;i<=ronda;i++){
                                    if (i<=5){
                                        System.out.println("---------- Ronda "+i+" ----------");
                                        System.out.println("Vida de pokemon 1: "+vida1);
                                        System.out.println("Vida de pokemon 2: "+vida2);
                                        System.out.println("");
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida1=vida1-70*0.9;
                                        vida2=vida2-50*0.75;
                                        if (vida1<0){
                                            vida1=vida1-vida1;
                                        }
                                        if(vida2<0){
                                            vida2=vida2-vida2;
                                        }
                                        System.out.println("Vida de pokemon 1: "+vida1);
                                        System.out.println("Vida de pokemon 2: "+vida2);
                                    }
                                }
                                System.out.println("");
                                System.out.println("***** Fin de la Batalla *****");
                                if (ronda>5){
                                    System.out.println("Los pokemones duraron hasta la ronda 5.");
                                }
                                if (vida1>vida2){
                                    System.out.println("Pokemon 1 Ha sido el ganador!");
                                }else if(vida2>vida1){
                                    System.out.println("Pokemon 2 Ha sido el ganador!");
                                }else{
                                    System.out.println("Fue un empate!");
                                }
                                break;
                            case 3:
                                vida1=250;
                                vida2=300;
                                for (int i=1;i<=ronda;i++){
                                    if (i<=5){
                                        System.out.println("---------- Ronda "+i+" ----------");
                                        System.out.println("Vida de pokemon 1: "+vida1);
                                        System.out.println("Vida de pokemon 2: "+vida2);
                                        System.out.println("");
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida1=vida1-70*0.8;
                                        vida2=vida2-75*0.75;
                                        if (vida1<0){
                                            vida1=vida1-vida1;
                                        }
                                        if(vida2<0){
                                            vida2=vida2-vida2;
                                        }
                                        System.out.println("Vida de pokemon 1: "+vida1);
                                        System.out.println("Vida de pokemon 2: "+vida2);
                                    }
                                }
                                System.out.println("");
                                System.out.println("***** Fin de la Batalla *****");
                                if (ronda>5){
                                    System.out.println("Los pokemones duraron hasta la ronda 5.");
                                }
                                if (vida1>vida2){
                                    System.out.println("Pokemon 1 Ha sido el ganador!");
                                }else if(vida2>vida1){
                                    System.out.println("Pokemon 2 Ha sido el ganador!");
                                }else{
                                    System.out.println("Fue un empate!");
                                }
                                break;
                            case 4:
                                vida1=300;
                                vida2=280;
                                for (int i=1;i<=ronda;i++){
                                    if (i<=5){
                                        System.out.println("---------- Ronda "+i+" ----------");
                                        System.out.println("Vida de pokemon 1: "+vida1);
                                        System.out.println("Vida de pokemon 2: "+vida2);
                                        System.out.println("");
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida1=vida1-80*0.8;
                                        vida2=vida2-70*0.85;
                                        if (vida1<0){
                                            vida1=vida1-vida1;
                                        }
                                        if(vida2<0){
                                            vida2=vida2-vida2;
                                        }
                                        System.out.println("Vida de pokemon 1: "+vida1);
                                        System.out.println("Vida de pokemon 2: "+vida2);
                                    }
                                }
                                System.out.println("");
                                System.out.println("***** Fin de la Batalla *****");
                                if (ronda>5){
                                    System.out.println("Los pokemones duraron hasta la ronda 5.");
                                }
                                if (vida1>vida2){
                                    System.out.println("Pokemon 1 Ha sido el ganador!");
                                }else if(vida2>vida1){
                                    System.out.println("Pokemon 2 Ha sido el ganador!");
                                }else{
                                    System.out.println("Fue un empate!");
                                }
                                break;
                                
                        }
                            
                        }else{
                            System.out.println("La ronda que ingreso deber ser mayor que 0 o menor que 10.");
                        }// fin if opcion 2
                        break;
                }
                break;
            case 3:
                System.out.println("Ingrese un numero impar y mayor o igual que 7 [0 para salir]: ");
                int numero=leer.nextInt();
                while (numero!=0){
                    int imp=0;
                    if (numero>=7){
                        imp=numero%2;
                        if (imp==1){
                            for (int i=1;i<=numero;i++){
                                for (int j=1;j<=numero;j++){
                                    if (i==1||i==numero||j==1||j==numero){
                                        System.out.print(" * ");
                                    }else if(j==numero/2+1){
                                        System.out.print(" | ");
                                    }else if(i+j==numero+1){
                                        System.out.print(" > ");
                                    }else if(i==j){
                                        System.out.print(" > ");
                                    }else{
                                        System.out.print("   ");
                                    }
                                }
                                System.out.println();
                            }
                        }
                    }
                    System.out.println("Ingrese un numero impar y mayor o igual que 7 [0 para salir]: ");
                    numero=leer.nextInt();
                }
                break;
        }//fin opcion 2
            System.out.println("");
            System.out.println("1. Sucesiones y más sucesiones!");
            System.out.println("2. Pocket Monsters");
            System.out.println("3. Asterisco en casa!");
            System.out.print("Ingrese su opcion: ");
            opcion=leer.nextInt();
        }//fin while 
        
    }
    
}
