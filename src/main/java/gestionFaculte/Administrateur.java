package gestionFaculte;

public class Administrateur implements User{
	 
	private int id;
	private String nom;
	private String prenom;
	private String role="Administrateur";
	
	/* Constructeur
    public Administrateur(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }*/
	
	@Override
	public void afficherDetails() {
		System.out.println("Administrateur - ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom +"Role : "+ role);	
	}
	
	/*
	 // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
	  */

}
