package edunova;

public class Polaznik extends Osoba {
	
	// polaznik je dobio get i set
	
	private String brojUgovora;
	
	
	
	
	
	

	public Polaznik() {
		super();
	}

	public Polaznik(int sifra, String ime, String prezime, String brojUgovora) {
		super(sifra, ime, prezime);
		this.brojUgovora = brojUgovora;
	}

	public String getBrojUgovora() {
		return brojUgovora;
	}

	public void setBrojUgovora(String brojUgovora) {
		this.brojUgovora = brojUgovora;
	}
	
	@Override
	public String toString() {		
		return super.toString() + " " + brojUgovora;
	}
	
	
	

}
