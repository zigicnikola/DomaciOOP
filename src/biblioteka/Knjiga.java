package biblioteka;

public class Knjiga {
	private String naslov;
	private String autor;
	private int godinaIzdanja;
	private int brojStrana;
	private double cena;
	
	private static int brojKnjiga = 0;
	
	public Knjiga()
	{
		this("Nepoznato", "Nepoznato", 2000, 100, 0.0);
	}
	
	public Knjiga(String naslov, String autor)
	{
		this(naslov, autor, 2000, 100, 0.0);
	}
	
	public Knjiga(String naslov, String autor, int godinaIzdanja, int brojStrana, double cena)
	{
		setNaslov(naslov);
		setAutor(autor);
		setGodinaIzdanja(godinaIzdanja);
		setBrojStrana(brojStrana);
		setCena(cena);
		brojKnjiga++;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		if (naslov != null)
		{
			this.naslov = naslov;
		}
		else
		{
			System.out.println("Greska: naslov ne sme biti prazan.");
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor != null)
		{
			this.autor = autor;
		}
		else
		{
			System.out.println("Greska: autor ne sme biti prazan.");
		}
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		if (godinaIzdanja >= 1450 && godinaIzdanja <= 2026) 
		{
			this.godinaIzdanja = godinaIzdanja;
		}
		else
		{
			System.out.println("Greska: godina izdanja mora biti izmedju 1450 i 2026.");
		}
	}

	public int getBrojStrana() {
		return brojStrana;
	}

	public void setBrojStrana(int brojStrana) {
		if (brojStrana > 0) 
		{
			this.brojStrana = brojStrana;
		}
		else
		{
			System.out.println("Greska: broj strana mora biti veci od 0.");
		}
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		if (cena >= 0) 
		{
			this.cena = cena;
		}
		else
		{
			System.out.println("Greska: cena mora biti veci ili jednaka 0.");
		}
	}
	
	public static int getBrojKnjiga() {
		return brojKnjiga;
	}

	public static void setBrojKnjiga(int brojKnjiga) {
		Knjiga.brojKnjiga = brojKnjiga;
	}

	public void prikaziPodatke()
	{
		System.out.println(naslov + " | " + autor + " | " + godinaIzdanja + " | " + brojStrana + " | " + cena);
	}
	
	public void prikaziPodatke(boolean kratko)
	{
		if (kratko) 
		{
			System.out.println(naslov + " | " + autor);
		}
		else
		{
			prikaziPodatke();
		}
	}
	
	public double izracunajCenu()
	{
		return cena;
	}
	public double izracunajCenu(int kolicina)
	{
		return cena * kolicina;
	}
	public double izracunajCenu(int kolicina, double popust)
	{
		if (popust < 0 && popust > 50)
		{
			System.out.println("Greska: popust mora biti izmedju 0 i 50.");
		}		
		return cena * kolicina * (1 - popust / 100.0);
	}
	
	public boolean jeSkupljaOd (Knjiga druga)
	{
		return this.cena > druga.cena;
	}
	
}
