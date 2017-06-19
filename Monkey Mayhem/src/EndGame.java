import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EndGame extends JFrame {

	private JPanel contentPane;
	private static EndGame frame;

	/**
	 * Launch the application.
	 */
	public static void display() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new EndGame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EndGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 267, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblYouDied = new JLabel("You Died!");
		lblYouDied.setForeground(new Color(255, 0, 51));
		lblYouDied.setFont(new Font("Papyrus", Font.BOLD, 45));
		
		JLabel lblYourScoreWas = new JLabel("Your score was: " + Paint.getScore());
		lblYourScoreWas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnReturn = new JButton("Return to Main Menu");
		btnReturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Draw.changeState();
				Paint.resetScore();
				frame.setVisible(false);
			}
		});
		btnReturn.setForeground(new Color(51, 153, 0));
		btnReturn.setFont(new Font("Papyrus", Font.BOLD, 14));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblYouDied)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblYourScoreWas)))
					.addContainerGap(15, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(98, Short.MAX_VALUE)
					.addComponent(btnReturn)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblYouDied)
					.addGap(18)
					.addComponent(lblYourScoreWas)
					.addGap(45)
					.addComponent(btnReturn, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(62, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
