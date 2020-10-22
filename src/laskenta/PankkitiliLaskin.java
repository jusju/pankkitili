package laskenta;

public class PankkitiliLaskin {

	public static boolean tarkistaTilinumero(String tilinumero) {
		boolean tiliNumeroOnValidi = true;
		String ekatMerkki = tilinumero.substring(0, 2);
		if (ekatMerkki.matches("^[A-Z]{2}$")) {
		} else {
			tiliNumeroOnValidi = false;
		}
		if(tilinumero.length() == 18) {
		} else {
			tiliNumeroOnValidi = false;
		}
		return tiliNumeroOnValidi;
	}

	public int laskeTarkiste(String alku) {
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("Tarkastetaan tilinumeron validius.");
		String pankkiTili = "FI1920612000134419";
		if(tarkistaTilinumero(pankkiTili)) {
			System.out.println("Pankkitilin numero on validi.");
		} else {
			System.out.println("Pankkitilin numero on epäkelpo.");
		}
	}

}
