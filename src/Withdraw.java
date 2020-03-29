import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Withdraw extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public Withdraw() {
		setBackground(Color.WHITE);
		setTitle("Withdrawal Window ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(77, 72, 56, 16);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(145, 69, 220, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount :");
		lblAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount.setBounds(77, 119, 56, 16);
		contentPane.add(lblAmount);
		
		textField_1 = new JTextField();
		textField_1.setBounds(145, 116, 220, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnWithdraw = new JButton("OK");
		btnWithdraw.setForeground(Color.WHITE);
		btnWithdraw.setBackground(new Color(27,188,155));
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StringBuilder warning = new StringBuilder();
				String id="";
				double bal=0;
				
				if(textField.getText().isEmpty()) {
					warning.append( "ID field Can not be empty\n");
				}else {
					id = textField.getText();
				}
				
				if(textField_1.getText().isEmpty()) {
					warning.append( "Amount field can not be empty\n");
				}else {
					try {
						bal = Double.parseDouble(textField_1.getText());
					}catch(NumberFormatException e1) {
						warning.append( "Amount must be in Numbers\n");
					}
				}
				
				double accBal = Head.beta.findAccount(id).accountBalance;
				double minBal = Head.beta.findAccount(id).minimumBalance;
				
				if((accBal-bal) < minBal) {
					warning.append("You can not withdraw more than "+(accBal-minBal)+" TK");
				}
				
				if(warning.length()>0) {
					JOptionPane.showMessageDialog(null, warning.toString(), "Input Error!!", JOptionPane.WARNING_MESSAGE);
				}else {
					Head.beta.withdraw(id,bal);
					Head.deserialize();
					JOptionPane.showMessageDialog(null,"Withdrawal Successful");
				}
				
			}
		});
		btnWithdraw.setBounds(204, 170, 67, 23);
		contentPane.add(btnWithdraw);
		
		JButton btnHome = new JButton("");
		btnHome.setBackground(new Color(27,188,155));
		Image img = new ImageIcon(this.getClass().getResource("/home-icon.png")).getImage();
		btnHome.setIcon(new ImageIcon(img));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Head.bframe.setVisible(true);
				dispose();
			}
		});
		btnHome.setBounds(10, 217, 50, 33);
		contentPane.add(btnHome);
		
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
		btnBack.setBounds(374, 217, 50, 33);
		contentPane.add(btnBack);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setForeground(Color.WHITE);
		btnRefresh.setBackground(new Color(27,188,155));
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnRefresh.setBounds(281, 170, 82, 23);
		contentPane.add(btnRefresh);
		
		JLabel lblWitdraw = new JLabel("Witdrawal Window");
		lblWitdraw.setForeground(Color.GRAY);
		lblWitdraw.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWitdraw.setHorizontalAlignment(SwingConstants.CENTER);
		lblWitdraw.setBounds(145, 25, 172, 16);
		contentPane.add(lblWitdraw);
		
	}

}
