package card;
import javax.swing.ImageIcon;
public class Chest extends Item {
	public Chest(int size)
	{
		super("Chest");
		hp=size;
		setIcon(new ImageIcon(this.getClass().getResource("/image/Icon.png")));
	}
	@Override
	public void effect(Player input) {
		// TODO Auto-generated method stub

	}

}
