package companix;

public class Analyste extends Salarie {
	int nbrDeplacementClient;

	public Analyste(int code, String nom, String prenom, String dateEmbauche, int nbrDeplacementClient) {
		super(code, nom, prenom, dateEmbauche);
		this.nbrDeplacementClient = nbrDeplacementClient;
	}

	public int getNbrDeplacementClient() {
		return nbrDeplacementClient;
	}

	public void setNbrDeplacementClient(int nbrDeplacementClient) {
		this.nbrDeplacementClient = nbrDeplacementClient;
	}

	public String toString() {
		return "Nom et Prénom : " + this.getNom() + " " + this.getPrenom() + ", date d'embauche: "
				+ this.getDateEmbauche() + ", code : " + this.getCode() + ", nombre de déplacements client : "
				+ this.getNbrDeplacementClient();

	}
}
