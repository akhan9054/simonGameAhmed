package simonAhmed;

import guiPractice.GUIApplication;

public class SimonGameAhmed extends GUIApplication {

	public SimonGameAhmed(int width,int height) {
		super(width, height);
	}

	@Override
	protected void initScreen() {
		SimonScreenAhmed s = new SimonScreenAhmed(getWidth(), getHeight());
		setScreen(s);
	}

	public static void main(String[] args) {
		SimonGameAhmed game = new SimonGameAhmed(1000, 1000);
		Thread app = new Thread(game);
		app.start();
	}

}
