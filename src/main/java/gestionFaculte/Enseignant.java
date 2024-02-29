package gestionFaculte;

public class Enseignant implements User{
	
	private int id;
	private String nom;
	private String prenom;
	private String role="Enseignant";
	
	public Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

	@Override
	public void afficherDetails() {
		System.out.println("Administrateur - ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom + "Role : "+ role);	
	}

}
