import java.util.Scanner;

public class Main {
	
	public static void main (String[] args){
//		CardGame game = new CardGame();
//		
//		game.insertCard();
//		
		System.out.println("Wybierz opcj« naciskajˆc klawisz cyfry, a nast«pnie potwierd enterem:");
		System.out.println("1 - Utworzenie listy");
		System.out.println("2 - Wyæwietlanie listy");
		System.out.println("3 - Wyæwietlanie liczby element—w listy");
		System.out.println("4 - Wyæwietlanie kart o podanej wartoæci");
		System.out.println("5 - Wyæwietlanie kart o podanym kolorze");
		
		Scanner sc = new Scanner(System.in);

		
		switch (sc.nextInt()) {
		case 1:
			System.out.println("\n Tworzymy list«!");
		//	break;
		case 2:
			System.out.println("\n Wyæw list«!");
			//break;
		case 3:
			System.out.println("/n liczba el!");
			break;
		case 4: 
			System.out.println("/n wart!");
			break;
		case 5:
			System.out.println("/n Wyæw list«!");
			break;
		}
		
		
		
		

	}
		
}
