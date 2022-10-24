package companix;

public class Concepteur extends Salarie {
	int nbrAnnesDev;

	public Concepteur(int code, String nom, String prenom, String dateEmbauche, int nbrAnnesDev) {
		super(code, nom, prenom, dateEmbauche);
		this.nbrAnnesDev = nbrAnnesDev;
	}

	public int getNbrAnnesDev() {
		return nbrAnnesDev;
	}

	public void setNbrAnnesDev(int nbrAnnesDev) {
		this.nbrAnnesDev = nbrAnnesDev;
	}

	public String toString() {
		return "Nom et Prénom : " + this.getNom() + " " + this.getPrenom() + ", date d'embauche: "
				+ this.getDateEmbauche() + ", code : " + this.getCode() + ", nombre d'années de développement : "
				+ this.getNbrAnnesDev() + " ans";

	}
}
