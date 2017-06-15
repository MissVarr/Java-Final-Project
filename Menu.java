import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu {

	private JFrame frmJ;
	public static void display() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmJ.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJ = new JFrame("MONKEY MAYHEM - Main Menu");
		URL url = null;
		Image img = null;
		try {
			url = new URL("https://ak5.picdn.net/shutterstock/videos/7205341/thumb/1.jpg?i10c=img.resize(height:160)");
			img = ImageIO.read(url.openStream());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		frmJ.setContentPane(new JLabel(new ImageIcon(img)));
		frmJ.setBounds(100, 100, 700, 500);
		frmJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnPlayNow = new JButton("Play Now!");
		btnPlayNow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Draw.changeState();
				frmJ.setVisible(false);
				//ADD STUFF TO DO WHEN BUTTON IS CLICKED HERE
			}
		});
		btnPlayNow.setForeground(new Color(51, 153, 102));
		btnPlayNow.setFont(new Font("Papyrus", Font.PLAIN, 30));
		btnPlayNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnInstructions = new JButton("Instructions");
		btnInstructions.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//ADD STUFF TO DO WHEN BUTTON IS CLICKED HERE
			}
		});
		btnInstructions.setForeground(new Color(51, 153, 51));
		btnInstructions.setFont(new Font("Papyrus", Font.PLAIN, 30));
		GroupLayout groupLayout = new GroupLayout(frmJ.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(235)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnPlayNow, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnInstructions, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(257, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(174, Short.MAX_VALUE)
					.addComponent(btnPlayNow, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(71)
					.addComponent(btnInstructions, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(68))
		);
		frmJ.getContentPane().setLayout(groupLayout);
	}
}
