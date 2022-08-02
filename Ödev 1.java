import java.util.Scanner;
public class Odev{
private static void printPattern3(int satir) {
	
	for (int i = 1; i <= satir; i++) {
		// sayilarin önündeki beyaz bosluklar
		int BoslukSayisi = satir - i;

		//bastaki bosluklari yazdir
		printString(" ", BoslukSayisi);

		//karakter yazdir
		printString("* ", i);

		//yeni baslik
		System.out.println("");
	}
	for (int i = satir; i >= 1; i--) {
		
		int BoslukSayisi = satir - i;

		
		printString(" ", BoslukSayisi);

	
		printString("* ", i);

		
		System.out.println("");
	}
}

	
		private static void printString(String s, int sayi) {
			for (int j = 0; j < sayi; j++) {
				System.out.print(s);
			}
		}

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Satir Sayisini Giriniz :");
			int satir = scanner.nextInt();
		
			scanner.close();

			System.out.println("Sekil Ciziliyor... \n");
			printPattern3(satir);

		}}

	