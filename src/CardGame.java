
public class CardGame {

	PlayingCard createCard(){
    	int rank = 0;// (int) (Math.random()*14);  
		int suit = (int) (Math.random()*4);
		if (rank != 0){
			return new PlayingCard(rank-1, suit);
		} else{
			return null;
		}
    	
    }

}
