package fr.baptiste;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        // String prenom="TOM";
        // System.out.println("Bonjour " + prenom + " !");
        Scanner clavier = new Scanner(System.in);

        // 1. Récupérer le salaire horaire
        System.out.println("entrer le salaire horaire : ");
        int salairehoraire = clavier.nextInt() ;
        
        // 2. Récupérer le nombre d'heure de travailler
        System.out.println("entrer le nombre d'heure travailler : ");
        int nbheuretravaille = clavier.nextInt() ;

        // 3. Multiplier
        int salairebrut = salairehoraire * nbheuretravaille;

        // 4. Afficher
        System.out.println("Le salaire brut est de " + salairebrut);

    }
    
}
