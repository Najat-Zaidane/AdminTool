package gestionFaculte;

public class Classe implements Batiment{
	
    private String emplacement;
    private String taille;
    private String fonctionnalite;
	private String description;
	
	
	@Override
	public void afficherInformations() {
		 System.out.println("Classe : "+ description+ "Emplacement - " + emplacement + ", Taille - " + taille + ", Fonctionnalité - " + fonctionnalite);
	}

}
