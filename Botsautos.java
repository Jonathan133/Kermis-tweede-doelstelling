
public class Botsautos extends Attractie {
	String naam = "Botsautos";
	double prijs = 2.50;
	double omzet = 0;
	int verkochteKaartjes;
	double oppervlakte;
	
	
	void draaien () {
		System.out.println("De attractie "+naam+" draait en heeft "+ ++verkochteKaartjes + " kaartjes verkocht" + " en een omzet gedraait van "+(omzet = verkochteKaartjes * prijs));
	}

}
