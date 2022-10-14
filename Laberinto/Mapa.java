package Laberinto;

import java.util.Scanner;

public class Mapa {

    public static void main(String[] args) {

        Escenario esce = new Escenario();
        Metodo metodo = new Metodo();

        Scanner lector = new Scanner(System.in);
        int opc;
        int mod = 0;
        do {
        	System.out.println("----LABERINTO----");
            System.out.println("1.-Jugar");
            System.out.println("0.- Salir");
            System.out.print("¿Que deseas hacer?: ");
            opc = lector.nextInt();
            if (opc != 0) {
            	System.out.println("\n ===MODOS DE JUEGO===");
                System.out.println("\n1.- Manual");
                System.out.println(" El usuario debe de encontar la manera de salir");
                System.out.println("\nCONTROLES:\n Arriba: W\n Abajo: S\n Derecha: D\n Izquierda: A\n");
                System.out.println("2.- Automatico");
                System.out.println(" la maquina debe de encontar la manera de salir");
                System.out.print("\n¿Que modalidad deseas?: ");
                mod = lector.nextInt();
            }

            switch (opc) {
                case 0:
                    System.out.println("FIN DEL PROGRAMA");
                    break;
                case 1:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioUno(), esce.filaasterico(esce.escenarioUno()), esce.columasterico(esce.escenarioUno()));
                    } else {
                        metodo.Auto(esce.escenarioUno(), esce.filaasterico(esce.escenarioUno()), esce.columasterico(esce.escenarioUno()));
                    }
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opc != 0);

    }
}
