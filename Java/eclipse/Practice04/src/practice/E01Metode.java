package practice;

public class E01Metode {
	
	public static void main(String[] args) {
		tip1();
		
		tip1(2);
		
		int broj = 7;		
		tip1(broj);
		
		tip1(true);
		
		zbroj100Brojeva();
		
		System.out.println(zbroj100Brojeva());
		
		int i = zbroj100Brojeva();
		
		System.out.println(i+1);
		
		System.out.println(slucajniBroj(1, 100));
		
		
	}
	
	// 1. vrsta metode tipa void, ne prima parametre
	// za sada moramo 
	/* bez navođenja načina pristupa */ static void tip1() { // bez navođenja načina pristupa je package scope
		System.out.println("Hello tip 1");
		
	}
	
	// potpis metode : naziv + lista parametara koju prima
	// 2. tipa void, prima parametre
	// method overloading
	private static void tip1(int i) {
		System.out.println("Tip 2" + i);
	}
	
	// method overloading
	protected static void tip1(boolean i ) {
		System.out.println("Tip 2" + i);
	}
	
	// 3. određenog tipa, ne prima parametre
	
	public static int zbroj100Brojeva() {
		
		int s = 0;
		for(int i=1; i<=100;i++) {
			s+=i;
		}
				
		return s;
	}
	
	// 4. određenog tipa, prima parametre
	
	static int slucajniBroj(int min, int max) {				
		
		int manji = min < max ? min : max;
		int veci = min > max ? min : max;
		
		// https://www.educative.io/answers/how-to-generate-random-numbers-in-java
		return (int)Math.floor(Math.random() * (veci - manji + 1) + manji);
		
	}

}


















