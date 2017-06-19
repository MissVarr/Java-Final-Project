import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Instructions extends JFrame {

	private JPanel contentPane;
	private static Instructions frame = new Instructions();

	/**
	 * Launch the application.
	 */
	public static void displayInstructions() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	public Instructions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//Creates a bunch of JLabels which displays the instructions
		JLabel lblNewLabel = new JLabel("          Wall jump from side to side in an epic attempt to");
		
		JLabel lblNewLabel_1 = new JLabel("          collect a multitude of bananas for survival!");
		
		JLabel lblNewLabel_2 = new JLabel("          Be careful not to crash into any branches or");
		
		JLabel lblNewLabel_3 = new JLabel("          other obstacles on your way up the trees.");
		
		JLabel lblNewLabel_4 = new JLabel("          Survive for as long as you can in the jungle, and");
		
		JLabel lblNewLabel_5 = new JLabel("          improve every time you play! Once you die, the score ");
		
		JLabel lblNewLabel_6 = new JLabel("          will be shown. Use the space bar to jump from side to side!");
		
		JLabel lblNewLabel_7 = new JLabel("Instructions");
		lblNewLabel_7.setForeground(new Color(51, 153, 0));
		lblNewLabel_7.setFont(new Font("Papyrus", Font.PLAIN, 24));
		
		//Creates button which allows you to return to main menu
		JButton btnReturnToMain = new JButton("Return to Main Menu");
		btnReturnToMain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu.display();
				frame.setVisible(false);
			}
		});
		btnReturnToMain.setForeground(new Color(51, 153, 0));
		btnReturnToMain.setFont(new Font("Papyrus", Font.BOLD, 14));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(btnReturnToMain)
					.addContainerGap(314, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_6)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(154)
							.addComponent(lblNewLabel_7)))
					.addContainerGap(85, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnReturnToMain, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(lblNewLabel_7)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_6)
					.addContainerGap(42, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
