package gestionFaculte;

public class FabriqueAmphi implements FabriqueBatiment{
	@Override
    public Batiment creerBatiment() {
        return new Amphi();
    }

	@Override
	public User creerUser() {
		return new Etudiant();
	}
}
