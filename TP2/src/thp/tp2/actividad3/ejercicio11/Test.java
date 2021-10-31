package thp.tp2.actividad3.ejercicio11;

public class Test {

	public static void main(String[] args) {
		Superheroe superheroe1 = new Superheroe("Batman", 90, 70, 0);
		Superheroe superheroe2 = new Superheroe("Superman", 95, 60, 70);
		Superheroe superheroe3 = new Superheroe("Shazam", 90, 65, 70);
		
		superheroe1.competir(superheroe2);
		
		superheroe2.competir(superheroe1);
		
		superheroe2.competir(superheroe3);
		
		superheroe3.competir(superheroe2);
	}

}
