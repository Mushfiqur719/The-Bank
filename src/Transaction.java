import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Transaction extends JFrame {

	private JPanel contentPane;

	public Transaction() {
		setTitle("Transaction Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Head.withframe.setVisible(true);
				dispose();
			}
		});
		btnWithdraw.setBounds(170, 82, 109, 25);
		contentPane.add(btnWithdraw);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Head.depframe.setVisible(true);
				dispose();
			}
		});
		btnDeposit.setBounds(170, 143, 109, 25);
		contentPane.add(btnDeposit);
		
		JButton btnHome = new JButton("");
		Image img = new ImageIcon(this.getClass().getResource("/home-icon.png")).getImage();
		btnHome.setIcon(new ImageIcon(img));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProjectBank bframe = new ProjectBank();
				bframe.setVisible(true);
				dispose();
			}
		});
		btnHome.setBounds(12, 215, 50, 33);
		contentPane.add(btnHome);
		
		JButton btnBack = new JButton("");
		Image bimg = new ImageIcon(this.getClass().getResource("/back-icon.png")).getImage();
		btnBack.setIcon(new ImageIcon(bimg));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Head.bframe.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(374, 215, 50, 33);
		contentPane.add(btnBack);
	}

}
