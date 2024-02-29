package gestionFaculte;

public class TestAdaptateur {

	public static void main(String[] args) {
		Batiment salleDeCours = new SalleCours();
        Adaptateur adaptateurSalleDeFete = new AdaptateurSalleDeFete();
        adaptateurSalleDeFete.adapter(salleDeCours);

        Batiment amphiDeCours = new Amphi();
        Adaptateur adaptateurAmphiSoutenance = new AdaptateurAmphiSoutenance();
        adaptateurAmphiSoutenance.adapter(amphiDeCours);
	}

}
