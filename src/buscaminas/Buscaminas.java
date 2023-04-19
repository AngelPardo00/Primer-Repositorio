package buscaminas;

import java.util.Scanner;

public class Buscaminas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] tablero = new int[8][8];
        int casos = sc.nextInt();

        System.out.println("------------------");
        System.out.println("MODIFICACION GIT 2");
        System.out.println("------------------");
        
        for (int caso = 0; caso < casos; caso++) {

            System.out.println("CASO " + (caso + 1));
            System.out.println("--------");
            for (int fila = 0; fila < tablero.length; fila++) {
                for (int col = 0; col < tablero[fila].length; col++) {
                    tablero[fila][col] = sc.nextInt();
                }
            }
            
            for (int fila = 0; fila < 8; fila++) {
                for (int col = 0; col < 8; col++) {
                 
                    if (tablero[fila][col] == -1) {
                        
                        System.out.print("-1\t");
                    } else {
                        int numBombas = 0;
                        
                        for (int f = Math.max(0, fila-1); f <= Math.min(7, fila+1); f++) {
                            for (int c = Math.max(0,col-1); c<= Math.min(7, col+1); c++) {
                                if (tablero[f][c]== -1) {
                                    numBombas++;
                                }
                            }
                        }
                        System.out.print(numBombas + "\t");
                    }
                }
                System.out.println();
                
            }
        }
    }
    
}