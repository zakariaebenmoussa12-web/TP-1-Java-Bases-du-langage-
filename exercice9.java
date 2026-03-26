package Partie3;
import java.util.Scanner;

public class exercice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrice = new int[3][3];
        int somme = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element : ");
                matrice[i][j] = sc.nextInt();
                somme += matrice[i][j];
            }
        }

        System.out.println("La somme = " + somme);
    }
}