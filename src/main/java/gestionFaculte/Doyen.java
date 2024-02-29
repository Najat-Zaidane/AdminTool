package gestionFaculte;

public class Doyen implements User{
	
	private int id;
	private String nom;
	private String prenom;
	private String role="Doyen";
	
    public Doyen(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

		
	@Override
	public void afficherDetails() {
		System.out.println("Administrateur - ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom +"Role : "+ role);	
	}

}
