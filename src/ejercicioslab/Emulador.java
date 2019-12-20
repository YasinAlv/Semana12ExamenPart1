/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioslab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Emulador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Crea 4 animales aleatorios por iteracion de cualquier de los 4 tipos disponibles
        //*Perro
        //*Vaca
        //*Gato
        //*Pato
        //imprime el numero de animal y su sonido
        //Hace una espera de 1seg despues de cada iteracion
        creacionAnimales();
    }

    //********************************************************************
    public static void creacionAnimales() {

        int tipo = 0, cantidad = 1;
        int contPe = 1, contVa = 1, contPa = 1, contGa = 1, pos = 0, iteracion = 1;
        Scanner Teclado = new Scanner(System.in);
        List<Animal> Corral = new ArrayList<>();
        int[] Contadores = new int[4];
        System.out.println("Iteración #:" + iteracion + "*****************\n");
        iteracion++;
        Contadores = crearAnimales(tipo, cantidad, contPe, contVa, contPa, contGa, Corral, Contadores);
        pos = printIteracion(Corral, pos);
        System.out.println("");
        try {
            do {
                System.out.println("Iteración #:" + iteracion + "*****************");
                iteracion++;
                Contadores = crearAnimales(tipo, cantidad, Contadores[0], Contadores[1], Contadores[2], Contadores[3], Corral, Contadores);
                pos = printIteracion(Corral, pos);
                System.out.println("");
                Thread.sleep(2000);
            } while (true);
        } catch (Exception e) {
            // Mensaje en caso de que falle
        }
    }

    //***********************************************************************************
    public static int[] crearAnimales(int tipo, int cantidad, int contPe, int contVa, int contPa, int contGa, List<Animal> Corral, int[] Contadores) {
        do {
            tipo = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);
            Animal perrito = new Perro();
            Animal vaquita = new Vaca();
            Animal patito = new Pato();
            Animal gatito = new Gato();
            Contadores[0] = contPe;
            Contadores[1] = contVa;
            Contadores[2] = contPa;
            Contadores[3] = contGa;
            switch (tipo) {
                case 1:
                    perrito.setNumero(contPe);
                    contPe++;
                    Contadores[0] = contPe;
                    perrito.SetTipo("Perro");
                    Corral.add(perrito);
                    System.out.println("Creado un Perro");
                    break;
                case 2:
                    vaquita.setNumero(contVa);
                    contVa++;
                    Contadores[1] = contVa;
                    vaquita.SetTipo("Vaca");
                    Corral.add(vaquita);
                    System.out.println("Creado una Vaca");
                    break;
                case 3:
                    patito.setNumero(contPa);
                    contPa++;
                    Contadores[2] = contPa;
                    patito.SetTipo("Pato");
                    Corral.add(patito);
                    System.out.println("Creado un Pato");
                    break;
                case 4:
                    gatito.setNumero(contGa);
                    contGa++;
                    Contadores[3] = contGa;
                    gatito.SetTipo("Gato");
                    Corral.add(gatito);
                    System.out.println("Creado un Gato");
                    break;
            }
            cantidad++;
        } while (cantidad <= 4);
        return Contadores;
    }

    //************************************************************************************
    private static void printCorral(List<Animal> Corral) {
        for (Animal animalito : Corral) {
            if (null == animalito.getTipo())
            {
                System.out.println("Gato " + animalito.getNumero() + " dice " + ((Gato) animalito).Hablar());
            } else
            {
                switch (animalito.getTipo()) {
                    case "Perro":
                        System.out.println("Perro " + animalito.getNumero() + " dice " + ((Perro) animalito).Hablar());
                        break;
                    case "Vaca":
                        System.out.println("Vaca " + animalito.getNumero() + " dice " + ((Vaca) animalito).Hablar());
                        break;
                    case "Pato":
                        System.out.println("Pato " + animalito.getNumero() + " dice " + ((Pato) animalito).Hablar());
                        break;
                    default:
                        System.out.println("Gato " + animalito.getNumero() + " dice " + ((Gato) animalito).Hablar());
                        break;
                }
            }
        }
    }
//****************************************************************************************  

    private static int printIteracion(List<Animal> Corral, int pos) {
        int i = pos;
        while (i < pos + 4) {
            if (null == Corral.get(i).getTipo()) {
                System.out.println("Gato " + Corral.get(i).getNumero() + " dice " + ((Gato) Corral.get(i)).Hablar());
            } else {
                switch (Corral.get(i).getTipo()) {
                    case "Perro":
                        System.out.println("Perro " + Corral.get(i).getNumero() + " dice " + ((Perro) Corral.get(i)).Hablar());
                        break;
                    case "Vaca":
                        System.out.println("Vaca " + Corral.get(i).getNumero() + " dice " + ((Vaca) Corral.get(i)).Hablar());
                        break;
                    case "Pato":
                        System.out.println("Pato " + Corral.get(i).getNumero() + " dice " + ((Pato) Corral.get(i)).Hablar());
                        break;
                    default:
                        System.out.println("Gato " + Corral.get(i).getNumero() + " dice " + ((Gato) Corral.get(i)).Hablar());
                        break;
                }
            }
            i++;
        }
        return i;
    }
}
//END