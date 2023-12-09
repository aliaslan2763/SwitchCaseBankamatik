import java.util.Scanner;

public class SwitcCase {

	public static void main(String[] args) {

		System.out.println("1 bakiye öğrenme");
		System.out.println("-----------------");
		System.out.println("2 para yatırma");
		System.out.println("-----------------");
		System.out.println("3para çekme ");
		System.out.println("-----------------");
		System.out.println("4kart iade");

		Scanner scan = new Scanner(System.in);
		int islem = scan.nextInt();
		int bakiye = 1000;
		switch (islem) {
		case 1:
			System.out.println("bakiyeniz:" + bakiye);
			break;
		case 2:
			System.out.println("ne kadar yatırmak istiyosunuz");
			int parayatirma = scan.nextInt();
			bakiye = bakiye + parayatirma;
			System.out.println("bakiyeniz:" + bakiye);
			break;
		case 3:
			System.out.println("ne kadar çekmek istiyosunuz");
			int paracekme = scan.nextInt();
			bakiye = bakiye - paracekme;
			System.out.println("bakiyeniz:" + bakiye);
			break;
		case 4:
			System.out.println("paranız iade ediliyor");
		default:

		}

	}

}
