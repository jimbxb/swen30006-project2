package mycontroller.penalty;

import mycontroller.router.Node;
import tiles.LavaTrap;

public class FuelPenalty implements IPenalty {	
	public void applyPenalty(Node node) {
		if (node.tile instanceof LavaTrap) {
			node.cost += 5;
		}
	}
}
