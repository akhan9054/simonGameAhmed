package simonAhmed;

import java.awt.Color;

import guiPractice.components.Action;
import guiPractice.components.Clickable;

public interface ButtonInterfaceAhmed extends Clickable {
	void setColor(Color color);
	void setX(int x);
	void setY(int y);
	void setAction(Action action);
	void dim();
	void highlight();
}
