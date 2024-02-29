package gestionFaculte;

public class DepPhys implements Departement{
	private String nom="Bienvenue au département de physique";
	 public DepPhys(String nom) {
	        this.nom = nom;
	    }
	@Override
	public void afficherDepart() {
		System.out.println(nom);
	}

}
