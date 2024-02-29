package gestionFaculte;

public class Amphi implements Batiment {
	 private String emplacement;
	    private String taille;
	    private String fonctionnalite;
		private String description;
	
	
	@Override
	public void afficherInformations() {
		System.out.println("Amphi : "+ description+ "Emplacement - " + emplacement + ", Taille - " + taille + ", Fonctionnalité - " + fonctionnalite);
		
	}
}

