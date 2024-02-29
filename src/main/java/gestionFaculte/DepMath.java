package gestionFaculte;

public class DepMath implements Departement {
	private String nom="Bienvenue au département des mathematiques";
	 public DepMath(String nom) {
	        this.nom = nom;
	    }
	
	@Override
	public void afficherDepart() {
		System.out.println(nom);
	}
}
