package gestionFaculte;

public class TestComposite {

	public static void main(String[] args) {
		    Departement informatique = new DepInfo("Département Informatique");
	        Departement math = new DepMath("Département Mathématique");

	        GroupeDep groupe = new GroupeDep();
	        groupe.ajouterDepartement(informatique);
	        groupe.ajouterDepartement(math);

	        // Afficher les départements individuels
	        groupe.afficherDepart();
	}

}
