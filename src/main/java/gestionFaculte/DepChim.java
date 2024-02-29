package gestionFaculte;

public class DepChim implements Departement {
	private String nom="Bienvenue au département du chimie";
	
	 public DepChim(String nom) {
	        this.nom = nom;
	    }
	@Override
	public void afficherDepart() {
		System.out.println(nom);
	}

}
