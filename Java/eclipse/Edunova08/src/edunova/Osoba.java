package edunova;

import java.util.Objects;

// Naslješivanje je OOP princip kojim klasa može naslijediti javna i zaštićena svojstva i metoda od jedne nadklase
// Htjela to ili ne svaka klasa naslijeđuje java.lang.Object
public class Osoba extends Object { // extends je kao u C# dvotočka
	
	private int sifra;
	private String ime;
	private String prezime;
	
	
	
	public Osoba() {
		super();
	}
	public Osoba(int sifra, String ime, String prezime) {
		super();
		this.sifra = sifra;
		this.ime = ime;
		this.prezime = prezime;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
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
	
	
	// redefiniranje metode toString
	@Override // anotacija
		public String toString() {			
			return ime + " " + prezime;
		}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(ime, prezime, sifra);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		return Objects.equals(ime, other.ime) && Objects.equals(prezime, other.prezime) && sifra == other.sifra;
	}
	
	
	

}
