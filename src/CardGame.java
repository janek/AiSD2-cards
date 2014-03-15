import java.util.ArrayList;



public class CardGame {

	ArrayList<PlayingCard> cards = new ArrayList<PlayingCard>();
	
//	Utworzon� kart� nale�y wstawi� do listy na odpowiednie miejsce, tak aby karty 
//	by�y uporz�dkowane wed�ug warto�ci, a nast�pnie wed�ug kolor�w.
//
//	Wylosowanie warto�ci zero dla pola Wartosc oznacza koniec tworzenia listy.

	
	PlayingCard createCard(){
    	int rank = 0;//(int) (Math.random()*14);  
		int suit = (int) (Math.random()*4);
		if (rank != 0){
			return new PlayingCard(rank-1, suit);
		} else{
			return null;
		}
    }
	
	void insertCard() {
		if (createCard()!=null) {
			System.out.println("a card is to be added");
			insertCard();
		} else
		{
			System.out.print("END");
		}
	}

}
