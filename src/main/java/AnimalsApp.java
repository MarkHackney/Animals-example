
public class AnimalsApp {

	public static void main(String[] args) {
		Animals animal = new Animals();
		animal.speak();

		ZooKeeper keeper = new ZooKeeper();

		Animals sloth = new Sloth();
		sloth.speak();
		keeper.handleFeeding(sloth);

		Animals badger = new Badger();
		badger.speak();
		keeper.handleFeeding(badger);

		Animals unicorn = new Unicorn();
		unicorn.speak();
		
		keeper.handleFeeding(unicorn);
		System.out.println();
		

	}

}
