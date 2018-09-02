
public class Hawaii extends Attractie{
	String naam= "Hawaii";
	double prijs = 2.90;
	int verkochteKaartjes;
	double omzet = 0;
	double oppervlakte;
	
	void draaien () {
		System.out.println("De attractie "+naam+" draait en heeft "+ ++verkochteKaartjes + " kaartjes verkocht" + " en een omzet gedraait van "+(omzet = verkochteKaartjes * prijs));
	}

}
