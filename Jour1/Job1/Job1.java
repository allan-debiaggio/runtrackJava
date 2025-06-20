package Jour1.Job1;

import java.util.Scanner;

public class Job1 {
    public static void main(String[] args) {
        // Affichage d'un message
        System.out.println("Veuillez saisir un texte :");
        // Récupération de la saisie clavier
        try (Scanner scanner = new Scanner(System.in)) {
            String saisie = scanner.nextLine();
            // Affichage de la saisie
            System.out.println("Vous avez saisi : " + saisie);
        }
    }
}