import java.util.Scanner;

public class Main {
	
	public static void main (String [] args){
		
		boolean Finished = false;
		Botsautos botsautos = new Botsautos();
		Hawaii hawaii = new Hawaii();
		Ladderklimmen ladderklimmen = new Ladderklimmen();
		Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
		Spin spin = new Spin();
		Spookhuis spookhuis = new Spookhuis();
		
	
		
		
		
	while (!Finished){
		
		double totaaleOmzet = botsautos.omzet+hawaii.omzet+ladderklimmen.omzet+spiegelpaleis.omzet+spin.omzet+spookhuis.omzet;
		int totaalVerkochteKaartjes= botsautos.verkochteKaartjes+hawaii.verkochteKaartjes+ladderklimmen.verkochteKaartjes+spiegelpaleis.verkochteKaartjes+spin.verkochteKaartjes+spookhuis.verkochteKaartjes;
		
		
	     int atracktienummer;
	     Scanner atrackieNummerScanner = new Scanner(System.in);
	     
	     System.out.println("Druk op 1 voor de Botsauto's, 2 voor de Hawaii, 3 voor het Ladderklimmen, 4 voor het Spiegelpaleis, 5 voor de Spin, 6 voor het Spookhuis.");
	     System.out.println("Druk op 7 voor de totaale omzet, 8 voor het totaal aantal verkochte kaarten");
	     System.out.println(" ");
	    
	     
	     	try {
		

			     atracktienummer = atrackieNummerScanner.nextInt();
			     
			     if (atracktienummer == 1) botsautos.draaien();
			     if (atracktienummer == 2) hawaii.draaien();
			     if (atracktienummer == 3) ladderklimmen.draaien();
			     if (atracktienummer == 4) spiegelpaleis.draaien();
			     if (atracktienummer == 5) spin.draaien();
			     if (atracktienummer == 6) spookhuis.draaien();
			     if (atracktienummer == 7) System.out.println ("De totale omzet is "+totaaleOmzet);
			     if (atracktienummer == 8) System.out.println("Het totaal verkochte aantal kaartjes is "+totaalVerkochteKaartjes);
	     		}
	     		catch (Exception invalidInput) {
	     					System.out.println("invalid input");
	     			}
	     
			}
		}
	{System.out.println();}
	}


