package companix;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Salarie> liste = new ArrayList<Salarie>();
		Scanner sc = new Scanner(System.in);
		int choix;
		boolean i = true;
		while (i) {
			affSelecteur();

			choix = sc.nextInt();
			switch (choix) {
			case 1:
				ajouterListeConcepteur(liste);
				break;
			case 2:
				supprimerConcepteur(liste);
				break;
			case 3:
				affListe(liste);
				break;
			case 4:
				ajouterListeAnalyste(liste);
				break;
			case 5:
				supprimerAnalyste(liste);
				break;
			case 6:
				affListePartielle(liste);
				break;
			default:
				i=false;
				System.out.println("Vous êtes sortis de l'application");
				break;
			}
		}
	}

	static void affSelecteur() {
		System.out.println("1- Ajouter un concepteur" + "\n2- Supprimer un concepteur"
				+ "\n3- Lister les salariés existants" + "\n4- Ajouter un analyste" + "\n5- Supprimer un analyste"
				+ "\n6- Lister les salariés existants avec leurs fonctions");
	}

	static void ajouterListeConcepteur(ArrayList<Salarie> liste) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Saisissez dans l'ordre et séparés par un \"-\" :\nNom \nPrénom \nDate d'embauche \nNombre d'années de développement");
		String val = sc.nextLine();
		String[] tab = val.split("-");

		String nom = tab[0];
		String prenom = tab[1];
		String dateEmbauche = tab[2];
		int code = liste.size();
		int nbrAnnesDev = Integer.parseInt(tab[3]);

		Concepteur leconcepteur = new Concepteur(code, nom, prenom, dateEmbauche, nbrAnnesDev);
		liste.add(leconcepteur);
	}

	static void ajouterListeAnalyste(ArrayList<Salarie> liste) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Saisissez dans l'ordre et séparés par un \"-\" :\nNom \nPrénom \nDate d'embauche \nCode \nNombre de déplacements client");
		String val = sc.nextLine();
		String[] tab = val.split("-");

		String nom = tab[0];
		String prenom = tab[1];
		String dateEmbauche = tab[2];
		int code = liste.size();
		int nbrDeplacementClient = Integer.parseInt(tab[3]);

		Analyste leanalyste = new Analyste(code, nom, prenom, dateEmbauche, nbrDeplacementClient);
		liste.add(leanalyste);
	}

	static void supprimerConcepteur(ArrayList<Salarie> liste) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez le code");
		int code = sc.nextInt();
		if (liste.get(code) instanceof Concepteur) {
			liste.remove(code);
			System.out.println("Concepteur supprimé !");
		} else {
			System.out.println("Le code saisi ne correspond pas à un concepteur !");
		}
	}

	static void supprimerAnalyste(ArrayList<Salarie> liste) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez le code");
		int code = sc.nextInt();
		if (liste.get(code) instanceof Analyste) {
			liste.remove(code);
			System.out.println("Analyste supprimé !");
		} else {
			System.out.println("Le code saisi ne correspond pas à un analyste !");
		}
	}

	static void affListe(ArrayList<Salarie> liste) {
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
	}

	static void affListePartielle(ArrayList<Salarie> liste) {
		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i) instanceof Analyste) {
				System.out.println("Analyste -> " + liste.get(i));
			} else {
				System.out.println("Concepteur -> " + liste.get(i));
			}
		}
	}
}
