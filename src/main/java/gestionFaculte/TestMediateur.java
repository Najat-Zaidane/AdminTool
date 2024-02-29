package gestionFaculte;

public class TestMediateur {

	public static void main(String[] args) {
		MediateurChefDepartement mediateur = new MediateurChefDepartement();

        ChefDepartement chef1 = new ChefDepartement("Chef Département Informatique", mediateur);
        ChefDepartement chef2 = new ChefDepartement("Chef Département Mathéamtique", mediateur);

        mediateur.ajouterChefDepartement(chef1);
        mediateur.ajouterChefDepartement(chef2);

        chef1.envoyerMessage("Bonjour, réunion importante demain à 9h ?");
        chef2.envoyerMessage("Bonjour, besoin de la localisation !");

	}

}
