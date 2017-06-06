import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImageDisplay extends JFrame {
	private Image picture;

	public ImageDisplay() {
		super("Image Test");
		setSize(1000, 800);

		String pathname = "P:\\My Pictures\\bird.jpg";
		try {
			picture = ImageIO.read(new File(pathname));
		} catch (IOException ex) {
			System.out.println("*** Can't load " + pathname + " ***");
			System.exit(1);
		}
	}

	public void paint(Graphics g) {
		super.paint(g);

		if (picture != null) {
			// center the picture:
			int x = (getWidth() - picture.getWidth(null)) / 2;
			int y = (getHeight() - picture.getHeight(null)) / 2;
			g.drawImage(picture, x, y, null);
		}
	}

	public static void main(String[] args) {
		ImageDisplay window = new ImageDisplay();
		window.setLocation(20, 20);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
