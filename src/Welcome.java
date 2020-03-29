import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Welcome extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblPassword;
	private JLabel lblEmail;
	private JLabel lblNewLabel;
	private JLabel lblPass;
	private JLabel lblMail;
	private JLabel lblF;
	private JLabel lblG;
	private JLabel lblin;
	private JLabel lblFpass;
	private JLabel lblUseYourMail;
	private JLabel lblTerms;

	public Welcome() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 521);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(27,188,155));
		panel.setBounds(0, 0, 337, 482);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSign = new JLabel("Sign In to Account");
		lblSign.setBackground(Color.WHITE);
		lblSign.setForeground(new Color(27,188,155));
		lblSign.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblSign.setHorizontalAlignment(SwingConstants.CENTER);
		lblSign.setBounds(417, 21, 214, 38);
		contentPane.add(lblSign);
		
		textField = new JTextField();
		textField.setBounds(391, 201, 256, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(391, 289, 256, 38);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String mail = textField.getText();
				String pass = passwordField.getText();
				
				if(mail.equals("admin") && pass.equals("admin")) {
					Head.bframe.setVisible(true);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Incorrect Email or Password");
				}
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(27,188,155));
		btnNewButton.setBounds(447, 373, 139, 31);
		contentPane.add(btnNewButton);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(390, 264, 67, 14);
		contentPane.add(lblPassword);
		
		lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEmail.setBounds(391, 176, 48, 14);
		contentPane.add(lblEmail);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Image bimg = new ImageIcon(this.getClass().getResource("/password.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(bimg));
		lblNewLabel.setBounds(347, 296, 34, 31);
		contentPane.add(lblNewLabel);
		
		lblMail = new JLabel("");
		lblMail.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/email.png")).getImage();
		lblMail.setIcon(new ImageIcon(img));
		lblMail.setBounds(347, 208, 32, 31);
		contentPane.add(lblMail);
		
		lblF = new JLabel("");
		Image fimg = new ImageIcon(this.getClass().getResource("/facebook.png")).getImage();
		lblF.setIcon(new ImageIcon(fimg));
		lblF.setBounds(439, 80, 48, 47);
		contentPane.add(lblF);
		
		lblG = new JLabel("");
		Image gimg = new ImageIcon(this.getClass().getResource("/google.png")).getImage();
		lblG.setIcon(new ImageIcon(gimg));
		lblG.setBounds(500, 80, 48, 47);
		contentPane.add(lblG);
		
		lblin = new JLabel("");
		Image iimg = new ImageIcon(this.getClass().getResource("/linkedin.png")).getImage();
		lblin.setIcon(new ImageIcon(iimg));
		lblin.setBounds(558, 80, 48, 47);
		contentPane.add(lblin);
		
		lblFpass = new JLabel("forgot password ?");
		lblFpass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFpass.setForeground(Color.GRAY);
		lblFpass.setHorizontalAlignment(SwingConstants.CENTER);
		lblFpass.setBounds(447, 338, 139, 14);
		contentPane.add(lblFpass);
		
		lblUseYourMail = new JLabel("or Use your email account");
		lblUseYourMail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUseYourMail.setForeground(Color.GRAY);
		lblUseYourMail.setHorizontalAlignment(SwingConstants.CENTER);
		lblUseYourMail.setBounds(437, 151, 169, 14);
		contentPane.add(lblUseYourMail);
		
		lblTerms = new JLabel("Privacy Policy    .    Terms & Conditions");
		lblTerms.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTerms.setHorizontalAlignment(SwingConstants.CENTER);
		lblTerms.setForeground(Color.GRAY);
		lblTerms.setBounds(417, 457, 214, 14);
		contentPane.add(lblTerms);
		
	}
}
