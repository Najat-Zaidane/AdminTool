package gestionFaculte;

public class Administartion implements Batiment {
	
	  private String emplacement;
	    private String taille;
	    private String fonctionnalite;
		private String description;
		@Override
		public void afficherInformations() {
			 System.out.println("Administration : "+ description+ "Emplacement - " + emplacement + ", Taille - " + taille + ", Fonctionnalité - " + fonctionnalite);
		}
}


  
