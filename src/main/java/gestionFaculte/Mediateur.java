package gestionFaculte;


public interface Mediateur {
	 void communiquer(String message, ChefDepartement expediteur); //permet à un chef de département d'envoyer un message au médiateur pour le transmettre à d'autre chefs
}

