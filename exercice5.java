package Partie2;

import java.util.Scanner;

public class exercice5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int n = sc.nextInt();

        int[] tab = new int[n];

        // Remplissage du tableau
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + " : ");
            tab[i] = sc.nextInt();
        }

        // Affichage du tableau
        System.out.println("Les éléments du tableau sont :");
        for (int i = 0; i < n; i++) {
            System.out.println(tab[i]);
        }

        sc.close();
    }
}