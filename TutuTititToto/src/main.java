
import java.util.Scanner;

class main {
    public static String parserChaine(int nombre) {

        StringBuilder res = new StringBuilder(); // objet qui permet la construction d'une chaine de caractéres 

        if (nombre % 3 == 0) { // utilisation de l'operateur modulo %
            res.append("Toto");
            System.out.println("il est divisible par 3");
            System.out.println("----------------------");
        }
        if (nombre % 5 == 0) {
            res.append("Tutu");
            System.out.println("il est divisible par 5");
            System.out.println("----------------------");
        }
        if (nombre % 7 == 0) {
            res.append("Titi");
            System.out.println("il est divisible par 7");
            System.out.println("----------------------");
        }

        for (int i = 0; i < String.valueOf(nombre).length(); i++) { // boucle qui permet de lire le nombre de caracteres dans une chaine
            if (String.valueOf(nombre).charAt(i) == '3') res.append("Toto");
        }

        for (int i = 0; i < String.valueOf(nombre).length(); i++) {
            if (String.valueOf(nombre).charAt(i) == '5') res.append("Tutu");
        }

        for (int i = 0; i < String.valueOf(nombre).length(); i++) {
            if (String.valueOf(nombre).charAt(i) == '7') res.append("Titi");
        }

        for (int i = 0; i < String.valueOf(nombre).length(); i++) {
            if (String.valueOf(nombre).charAt(i) == '0') res.append("*");
        }

        return res.toString();
    }

    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in); // Class qui permet de recuperer les informations tapé par l'utilisateurs 
        System.out.println("Bienvenue sur le programme");
        System.out.println("----------------------------------------");
        System.out.println("veuillez entrer un nombre");
        int nb = input.nextInt();
        System.out.println(parserChaine(nb));
    }
} 