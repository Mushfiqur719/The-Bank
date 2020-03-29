import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;

public class ProjectBank extends JFrame {

	private JPanel contentPane;

	public ProjectBank() {
		setBackground(new Color(153, 255, 0));
		setAlwaysOnTop(true);
		setTitle("Home Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 423);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JButton btnCreateaccount = new JButton("CreateAccount");
		Image img = new ImageIcon(this.getClass().getResource("/create.png")).getImage();
		btnCreateaccount.setIcon(new ImageIcon(img));
		btnCreateaccount.setForeground(Color.WHITE);
		btnCreateaccount.setBackground(Color.WHITE);
		btnCreateaccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Head.cframe.setVisible(true);
				dispose();
			}
		});
		btnCreateaccount.setBounds(10, 87, 150, 137);
		contentPane.add(btnCreateaccount);
		
		JButton btnWithdraw = new JButton("withdraw");
		Image wimg = new ImageIcon(this.getClass().getResource("/withdraw.png")).getImage();
		btnWithdraw.setIcon(new ImageIcon(wimg));
		btnWithdraw.setForeground(Color.WHITE);
		btnWithdraw.setBackground(Color.WHITE);
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Head.withframe.setVisible(true);
				dispose();
			}
		});
		btnWithdraw.setBounds(385, 87, 150, 137);
		contentPane.add(btnWithdraw);
		
		JButton btnInformation = new JButton("Information");
		Image iimg = new ImageIcon(this.getClass().getResource("/information.png")).getImage();
		btnInformation.setIcon(new ImageIcon(iimg));
		btnInformation.setForeground(Color.WHITE);
		btnInformation.setBackground(Color.WHITE);
		btnInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Head.model.clear();
				Head.iframe.setVisible(true);
				dispose();
			}
		});
		btnInformation.setBounds(563, 87, 158, 137);
		contentPane.add(btnInformation);
		
		JButton btnDeposit = new JButton("Deposit");
		Image dimg = new ImageIcon(this.getClass().getResource("/deposit.png")).getImage();
		btnDeposit.setIcon(new ImageIcon(dimg));
		btnDeposit.setForeground(Color.WHITE);
		btnDeposit.setBackground(Color.WHITE);
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Head.depframe.setVisible(true);
				dispose();
			}
		});
		btnDeposit.setBounds(196, 87, 158, 137);
		contentPane.add(btnDeposit);
		
		JLabel lblCreateAccount = new JLabel("Create Account");
		lblCreateAccount.setForeground(Color.GRAY);
		lblCreateAccount.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCreateAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateAccount.setBounds(10, 252, 150, 14);
		contentPane.add(lblCreateAccount);
		
		JLabel lblWithdraw = new JLabel("Withdraw");
		lblWithdraw.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWithdraw.setForeground(Color.GRAY);
		lblWithdraw.setHorizontalAlignment(SwingConstants.CENTER);
		lblWithdraw.setBounds(385, 252, 150, 14);
		contentPane.add(lblWithdraw);
		
		JLabel lblDeposit = new JLabel("Deposit");
		lblDeposit.setForeground(Color.GRAY);
		lblDeposit.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDeposit.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeposit.setBounds(196, 252, 158, 14);
		contentPane.add(lblDeposit);
		
		JLabel lblInformation = new JLabel("Information");
		lblInformation.setForeground(Color.GRAY);
		lblInformation.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformation.setBounds(563, 252, 158, 14);
		contentPane.add(lblInformation);
		
		JButton btnSignUp = new JButton("Back");
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setBackground(new Color(27,188,155));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Head.welframe.setVisible(true);
				dispose();
			}
		});
		btnSignUp.setBounds(10, 350, 76, 23);
		contentPane.add(btnSignUp);
		
		JLabel lblWindow = new JLabel("Choose a window");
		lblWindow.setForeground(Color.GRAY);
		lblWindow.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWindow.setBounds(10, 33, 212, 31);
		contentPane.add(lblWindow);
	}
}
