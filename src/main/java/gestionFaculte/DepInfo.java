package gestionFaculte;

public class DepInfo implements Departement {
    private String nom="Bienvenue au département d'informatique";
    public DepInfo(String nom) {
        this.nom = nom;
    }
	@Override
	public void afficherDepart() {
		System.out.println(nom);
	}

}
