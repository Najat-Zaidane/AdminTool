package gestionFaculte;

public class Etudiant implements User {
	
	private int id;
	private String nom;
	private String prenom;
	private String situation="Enseignant";  // la situation scolaire
	
	 

	@Override
	public void afficherDetails() {
		 System.out.println("Etudiant - ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom + ", Situation: " + situation);
		
	}
	

}
