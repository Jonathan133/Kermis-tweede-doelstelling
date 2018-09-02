
public class Ladderklimmen extends Attractie{
	String naam = "Ladderklimmen";
	double prijs = 5.00;
	int verkochteKaartjes;
	double omzet = 0;
	double oppervlakte;
	
	void draaien () {
		System.out.println("De attractie "+naam+" draait en heeft "+ ++verkochteKaartjes + " kaartjes verkocht" + " en een omzet gedraait van "+(omzet = verkochteKaartjes * prijs));
	}

}
