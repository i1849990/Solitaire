package a;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Deck d = new Deck();
			
			for (int i = 0; i < 52; i++) {
				System.out.println(d.getCards().get(i));
			}
			
			d.shuffle();
			for (int i = 0; i < 52; i++) {
				System.out.println(d.getCards().get(i));
			}
			
	}

}
