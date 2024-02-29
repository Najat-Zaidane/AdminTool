package gestionFaculte;

public class FabriqueClasse implements FabriqueBatiment{
	 @Override
	    public Batiment creerBatiment() {
	        return new Classe();
	    }

	@Override
	public User creerUser() {
		return new Etudiant();
	}
}
