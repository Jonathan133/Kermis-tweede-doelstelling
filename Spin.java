
public class Spin extends Attractie{
	String naam = "Spin";
	double prijs = 2.25;
	int verkochteKaartjes;
	double omzet = 0;
	double oppervlakte;
	
	double draaien () {
		System.out.println("De attractie "+naam+" draait en heeft "+ ++verkochteKaartjes + " kaartjes verkocht" + " en een omzet gedraait van "+(omzet = verkochteKaartjes * prijs));
		return omzet;
	}

}
