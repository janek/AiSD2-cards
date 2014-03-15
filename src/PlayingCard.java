
public class PlayingCard {
	
	int rank;
	int suit;
	
	String[] rankStrings = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] suitStrings = {"Karo", "Kier", "Pik", "Trefl"};
	
	String description;
	
	public PlayingCard(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
		description = rankStrings[rank]+" "+suitStrings[suit];
	}
	
}
