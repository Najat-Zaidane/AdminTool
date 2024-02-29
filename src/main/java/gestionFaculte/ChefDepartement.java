package gestionFaculte;

public class ChefDepartement implements Collegue {
	    private String nom;
	    private Mediateur mediateur;

	    public ChefDepartement(String nom, Mediateur mediateur) {
	        this.nom = nom;
	        this.mediateur = mediateur;
	    }
	   
	    public void envoyerMessage(String message) {
	    	 System.out.println( nom + " envoie le message : " + message);
	        mediateur.communiquer(message, this);
	    }

	    public void recevoirMessage(String message) {
	        System.out.println(nom + " a reçu le message : " + message);
	    }

		@Override
		public void recevoirMessage(String message, Collegue collegue) {
			System.out.println(nom + " a reçu le message de " + collegue.getNom() + " : " + message);			
		}

		@Override
		public String getNom() {
			return nom;
		}

}
