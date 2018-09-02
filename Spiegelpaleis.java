
public class Spiegelpaleis extends Attractie{
	String naam = "Spiegelpaleis";
	double prijs = 2.75;
	double omzet = 0;
	int verkochteKaartjes;
	double oppervlakte;
	
	void draaien () {
		System.out.println("De attractie "+naam+" draait en heeft "+ ++verkochteKaartjes + " kaartjes verkocht" + " en een omzet gedraait van "+(omzet = verkochteKaartjes * prijs));
	}

}
