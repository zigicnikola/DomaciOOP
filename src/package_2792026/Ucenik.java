package package_2792026;

public class Ucenik {
	private String ime;
	private String prezime;
	private int razred;
	private int ocena;
	
	public Ucenik(String ime, String prezime, int razred, int ocena)
	{
		this.ime = ime;
		this.prezime = prezime;
		this.razred = razred;
		this.ocena = ocena;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getRazred() {
		return razred;
	}

	public void setRazred(int razred) {
		this.razred = razred;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
}
