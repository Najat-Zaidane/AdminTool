package gestionFaculte;

public class FabriqueAdministration implements FabriqueBatiment{
	@Override
    public Batiment creerBatiment() {
        return new Administartion();
    }
	@Override
	public User creerUser() {
		return new Administrateur();
	}

}
