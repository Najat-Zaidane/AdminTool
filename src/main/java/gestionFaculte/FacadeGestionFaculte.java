package gestionFaculte;

public class FacadeGestionFaculte {
	    private GestionBatiments gestionBatiments;
	    private GestionUtilisateurs gestionUser;
	    private GestionDepartements gestionDepartements;
	    
	    public FacadeGestionFaculte() {
	        gestionBatiments = new GestionBatiments();
	        gestionUser = new GestionUtilisateurs();
	        gestionDepartements = new GestionDepartements();
	    }
	    // Opérations simplifiées pour les bâtiments
	    public void ajouterNouveauBatiment(String nom) {
	        gestionBatiments.ajouterBatiment(nom);
	    }

	    public void supprimerBatimentExistant(String nom) {
	        gestionBatiments.supprimerBatiment(nom);
	    }
	    
	 // Opérations simplifiées pour les utilisateurs
	    public void ajouterNouvelUtilisateur(String nom) {
	        gestionUser.ajouterUtilisateur(nom);
	    }
	    public void supprimerUtilisateurExistant(String nom) {
	        gestionUser.supprimerUtilisateur(nom);
	    }
	    public void authentifierUtilisateurExistant() {
	    	gestionUser.authentifierUtilisateur();
	    }
	    public void deconnecterUtilisateurConnecte() {
	    	gestionUser.deconnecterUtilisateur();
	    }
	    
	    // Opérations simplifiées pour les départements
	    public void ajouterNouveauDepartement(String nom) {
	    	gestionDepartements.ajouterDepartement(nom);
	    }

	    public void supprimerDepartementExistant(String nom) {
	    	gestionDepartements.supprimerDepartement(nom);
	    }
	    


	  

}
