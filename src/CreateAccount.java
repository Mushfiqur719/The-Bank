import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Color;

public class CreateAccount extends JFrame {

	private JPanel contentPane;

	public CreateAccount() {
		setBackground(new Color(27,188,155));
		setTitle("Create Account");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 360);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JButton btnBack = new JButton("");
		btnBack.setBackground(new Color(27,188,155));
		Image bimg = new ImageIcon(this.getClass().getResource("/back-icon.png")).getImage();
		btnBack.setIcon(new ImageIcon(bimg));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Head.bframe.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(524, 277, 50, 33);
		contentPane.add(btnBack);
		
		JButton btnHome = new JButton("");
		btnHome.setForeground(new Color(0,0,0));
		btnHome.setBackground(new Color(27,188,155));
		Image img = new ImageIcon(this.getClass().getResource("/home-icon.png")).getImage();
		btnHome.setIcon(new ImageIcon(img));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Head.bframe.setVisible(true);
				dispose();
			}
		});
		btnHome.setBounds(10, 277, 55, 33);
		contentPane.add(btnHome);
		
		JLabel lblChooseType = new JLabel("Choose Type of Accounts");
		lblChooseType.setForeground(Color.GRAY);
		lblChooseType.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblChooseType.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseType.setBounds(156, 11, 258, 34);
		contentPane.add(lblChooseType);
		
		JButton btnNewButton = new JButton("Savings Account");
		Image wimg = new ImageIcon(this.getClass().getResource("/savings.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(wimg));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Head.savframe.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(82, 67, 157, 143);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Current Account");
		Image cimg = new ImageIcon(this.getClass().getResource("/current.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(cimg));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Head.curframe.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(339, 67, 157, 143);
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("Savings Account");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setForeground(Color.GRAY);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(82, 234, 157, 14);
		contentPane.add(label);
		
		JLabel lblCurrentAccount = new JLabel("Current Account");
		lblCurrentAccount.setForeground(Color.GRAY);
		lblCurrentAccount.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrentAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentAccount.setBounds(339, 234, 157, 14);
		contentPane.add(lblCurrentAccount);
	}
}
