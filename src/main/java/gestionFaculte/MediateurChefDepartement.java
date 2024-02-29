package gestionFaculte;

import java.util.ArrayList;
import java.util.List;

public class MediateurChefDepartement implements Mediateur {
	private List<ChefDepartement> chefs = new ArrayList<>();
	
	 public void ajouterChefDepartement(ChefDepartement chef) {
	        chefs.add(chef);
	    }
	 @Override
	    public void communiquer(String message, ChefDepartement expediteur) {
	        for (ChefDepartement chef : chefs) {
	            if (chef != expediteur) {
	                chef.recevoirMessage(message);
	            }
	        }
	    }

}
