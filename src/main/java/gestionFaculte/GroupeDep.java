package gestionFaculte;

import java.util.ArrayList;
import java.util.List;

//classe composite  pour gérer un groupe de plusieurs départements
public class GroupeDep implements Departement{
	private List<Departement> departements = new ArrayList<>();
    //private String nom;

   /*public GroupeDep(String nom) {
        this.nom = nom;
    }*/

    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public void afficherDepart() {
        System.out.println("Groupe de départements : " );
       for (Departement departement : departements) {
            departement.afficherDepart();
        }
    }

}
