package gestionFaculte;

public class TestFacade {

	public static void main(String[] args) {
		 FacadeGestionFaculte facade = new FacadeGestionFaculte();

	        // Ajouter un nouveau bâtiment
	        facade.ajouterNouveauBatiment("Amphi A");

	        // Ajouter un nouvel utilisateur
	        facade.ajouterNouvelUtilisateur("Zaidane Najat");

	        // Ajouter un nouveau département
	        facade.ajouterNouveauDepartement("Informatique");

	        // Supprimer un utilisateur existant
	        facade.supprimerUtilisateurExistant("Zaidane Najat");

	        // Supprimer un bâtiment existant
	        facade.supprimerBatimentExistant("Amphi A");

	        // Supprimer un département existant
	        facade.supprimerDepartementExistant("Informatique");
	    }

	}


