import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class GuiSavings extends JFrame {

	static double maxWithLimit;
	private String id;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public GuiSavings() {
		setTitle("Savings Account Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 340);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		textField = new JTextField();
		textField.setBounds(266, 76, 237, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name                         : ");
		lblName.setForeground(Color.GRAY);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(86, 77, 148, 16);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(266, 130, 237, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(266, 184, 237, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblInitialBalance = new JLabel("Initial Balance             :");
		lblInitialBalance.setForeground(Color.GRAY);
		lblInitialBalance.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInitialBalance.setBounds(86, 132, 148, 16);
		contentPane.add(lblInitialBalance);
		
		JLabel lblMaxWithdrawLimit = new JLabel("Max Withdraw Limit    :");
		lblMaxWithdrawLimit.setForeground(Color.GRAY);
		lblMaxWithdrawLimit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMaxWithdrawLimit.setBounds(86, 185, 155, 16);
		contentPane.add(lblMaxWithdrawLimit);
		
		JButton btnBack = new JButton("");
		btnBack.setBackground(new Color(27,188,155));
		Image bimg = new ImageIcon(this.getClass().getResource("/back-icon.png")).getImage();
		btnBack.setIcon(new ImageIcon(bimg));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Head.cframe.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(507, 260, 50, 33);
		contentPane.add(btnBack);
		
		JButton btnHome = new JButton("");
		btnHome.setBackground(new Color(27,188,155));
		Image img = new ImageIcon(this.getClass().getResource("/home-icon.png")).getImage();
		btnHome.setIcon(new ImageIcon(img));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Head.bframe.setVisible(true);
				dispose();
			}
		});
		btnHome.setBounds(12, 260, 50, 33);
		contentPane.add(btnHome);
		
		JButton btnCreate = new JButton("OK");
		btnCreate.setForeground(Color.WHITE);
		btnCreate.setBackground(new Color(27,188,155));
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StringBuilder warning = new StringBuilder();
				String name="";
				double accBal=0,maxWithLimit=0;
				
				if(textField.getText().isEmpty()) {
					warning.append( "Name Can not be Empty\n");
				}else {
					name = textField.getText();
				}
				
				if(textField_1.getText().isEmpty()) {
					warning.append( "Initial Balance Can not be Empty\n");
				}else {
					try {
						accBal = Double.parseDouble(textField_1.getText());
					}catch(NumberFormatException e) {
						warning.append( "Initial Balance must be in Numbers\n");
					}
				}
				
				if(textField_2.getText().isEmpty()) {
					warning.append("Max Withdraw Limit Can not be Empty\n");
				}else {
					try {
						maxWithLimit = Double.parseDouble(textField_2.getText());
					}catch(NumberFormatException e) {
						warning.append( "Max Withdraw Limit must be in Numbers\n");
					}
				}
				
				if(accBal<2000) {
					JOptionPane.showMessageDialog(null, "You must have more than 2000 TK to create a savings account","Input Error",JOptionPane.WARNING_MESSAGE);
				}
				
				
				if(warning.length()>0) {
					JOptionPane.showMessageDialog(null, warning.toString(), "Input Error!!", JOptionPane.WARNING_MESSAGE);
				}else {
					id = Head.beta.addAccount(name, accBal, maxWithLimit);
					Head.deserialize();
					JOptionPane.showMessageDialog(null, "Account Created Successfully and your ID is :"+id);
				}
				
			}
		});
		btnCreate.setBounds(266, 225, 64, 23);
		contentPane.add(btnCreate);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setForeground(Color.WHITE);
		btnRefresh.setBackground(new Color(27,188,155));
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnRefresh.setBounds(421, 226, 82, 23);
		contentPane.add(btnRefresh);
		
		JLabel lblSave = new JLabel("Savings Account Information");
		lblSave.setForeground(Color.GRAY);
		lblSave.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSave.setBounds(187, 21, 243, 22);
		contentPane.add(lblSave);
	}
}
