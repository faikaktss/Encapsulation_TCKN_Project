import java.util.Random;
import java.util.Scanner;

public class gişe {
	public static void main(String[] args) {
		//Gişe uygulaması yapalım tc doğru ise numara versin yanlış girerse uyarsın
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gişe uygulamasına hoşgeldiniz :)");
		System.out.println("Lütfen 11 rakamlı tckn numaranızı giriniz:");
		
		String tckn = scanner.nextLine();
	
		TCKN tcknNesneTckn = new TCKN();
		tcknNesneTckn.setTckn(tckn);
		
		
		Random random = new Random();
		int giseNo = random.nextInt(100);
		System.out.println("Gişe no: " + giseNo);
	}
}
