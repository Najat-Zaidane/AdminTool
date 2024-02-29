package gestionFaculte;

public class DepBio implements Departement{
	private String nom="Bienvenue au département de biologie";
	 public DepBio(String nom) {
	        this.nom = nom;
	    }
	@Override
	public void afficherDepart() {
		System.out.println(nom);
	}

}
