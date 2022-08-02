import java.util.Scanner;
public class Odev1{
private static void printPattern3(int row) {
	
	for (int i = 1; i <= row; i++) {
		
		// sayilarin arasindaki bosluklarin sayisi
		
		int whiteSpace = row - i;

		//bastaki bosluklari yazdir
		
		printString(" ", whiteSpace);

		//karakter yazdir
		
		printString("* ", i);

		//yeni baslik
		
		System.out.println("");
	}
	for (int i = row; i >= 1; i--) {
		
		int whiteSpace = row - i;

		
		printString(" ", whiteSpace);

	
		printString("* ", i);

		
		System.out.println("");
	}
}

	
		private static void printString(String s, int num) {
			for (int j = 0; j < num; j++) {
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

	
