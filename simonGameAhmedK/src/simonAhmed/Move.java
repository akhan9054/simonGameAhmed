package simonAhmed;

public class Move implements MoveInterfaceAhmed {

private ButtonInterfaceAhmed b; 
	
	public Move(ButtonInterfaceAhmed b) {
		this.b = b;
	}

	public ButtonInterfaceAhmed getButton() {
		return b;
	}

}