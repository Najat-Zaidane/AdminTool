package gestionFaculte;

import java.util.List;
//cette classe définit une section composée d'un identifiant, d'une liste d'étudiants et d'un enseignant responsable.
public class Section {
	private int id;
    private List<Etudiant> etudiants;
    private Enseignant enseignantResponsable;
    
    // Constructeur
    public Section(int id, List<Etudiant> etudiants, Enseignant enseignantResponsable) {
        this.id = id;
        this.etudiants = etudiants;
        this.enseignantResponsable = enseignantResponsable;
    }
    
 // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public Enseignant getEnseignantResponsable() {
        return enseignantResponsable;
    }

    public void setEnseignantResponsable(Enseignant enseignantResponsable) {
        this.enseignantResponsable = enseignantResponsable;
    }

}
