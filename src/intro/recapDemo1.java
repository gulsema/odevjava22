package intro;

public class recapDemo1 {

	public static void main(String[] args) {
		int sayı1 = 3;
		int sayı2 = 7;
		int sayı3 = 9;
		int enbuyuksayı = sayı1;
		
		if (enbuyuksayı<sayı2) {
			enbuyuksayı = sayı2;
		}
		if(enbuyuksayı<sayı3) {
			enbuyuksayı = sayı3;
		}

		System.out.println("En büyük = " + enbuyuksayı);
		
	}

}
