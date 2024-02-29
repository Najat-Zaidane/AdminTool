package gestionFaculte;

public class DepGeo implements Departement{
	private String nom="Bienvenue au département de geologie";
	 public DepGeo(String nom) {
	        this.nom = nom;
	    }
	@Override
	public void afficherDepart() {
		System.out.println(nom);
	}

}
