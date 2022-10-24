package companix;


public class Salarie {
	int code;
	String nom;
	String prenom;
	String dateEmbauche;
public Salarie() {
	this.code = 1;
	this.nom = "";
	this.prenom = "";
	this.dateEmbauche = "01-01-1970";
}
	
	public Salarie(int code, String nom, String prenom, String dateEmbauche) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.dateEmbauche = dateEmbauche;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getDateEmbauche() {
		return dateEmbauche;
	}


	public void setDateEmbauche(String dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}


	public String toString() {
		return "Le salarié a pour nom et prénom " + this.getNom() + " " + this.getPrenom() + "\n" + this.getPrenom()
				+ " a été embauché le " + this.getDateEmbauche();

	}

}
