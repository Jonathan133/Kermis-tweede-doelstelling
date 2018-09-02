
public class Spookhuis extends Attractie {
	String naam = "Spookhuis";
	double prijs = 3.20;
	int verkochteKaartjes = 0 ;
	double omzet = 0;
	double oppervlakte;
	
	void draaien () {
		System.out.println("De attractie "+naam+" draait en heeft "+ ++verkochteKaartjes + " kaartjes verkocht" + " en een omzet gedraait van "+(omzet = verkochteKaartjes * prijs));
		
		} 
	

}
