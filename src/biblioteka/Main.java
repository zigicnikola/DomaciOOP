package biblioteka;

public class Main {

	public static void main(String[] args) {
		Knjiga k1 = new Knjiga();
		Knjiga k2 = new Knjiga("Na drini cuprija", "Ivo Andric");
		Knjiga k3 = new Knjiga("Prokleta avlija", "Ivo Andric", 1954, 120, 890.0);
		
		k1.prikaziPodatke();
		k2.prikaziPodatke();
		k3.prikaziPodatke();
		
		k1.setNaslov("Dervis i smrt");
		k1.setAutor("Mesa Selimovic");
		k1.setGodinaIzdanja(1966);
		k1.setBrojStrana(480);
		k1.setCena(1250.0);
		
		k2.setCena(-300);
		k2.setGodinaIzdanja(3000);
		k2.prikaziPodatke();
		
		System.out.println("Naslov: " + k3.getNaslov() + ", cena: " + k3.getCena());
		
		k3.izracunajCenu();
		k3.izracunajCenu(5);
		k3.izracunajCenu(5, 10);
		
		//k3.cena = 100;
		
		System.out.println("Broj knjiga" + Knjiga.getBrojKnjiga());
		
		k1.prikaziPodatke(true);
		
		System.out.println("Da li je knjiga " + k1.getNaslov() + " skuplja od knjige " + k2.getNaslov() + " ? " + k1.jeSkupljaOd(k3));
	}

}
