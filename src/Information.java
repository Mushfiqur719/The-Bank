import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Color;

public class Information extends JFrame {
	
	static ProjectBank bframe = new ProjectBank();

	private JPanel contentPane;

	public Information() {
		setTitle("Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblInformationOfThe = new JLabel("Information of the Accounts");
		lblInformationOfThe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInformationOfThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformationOfThe.setBounds(275, 13, 242, 29);
		contentPane.add(lblInformationOfThe);
		
		JList<String> list = new JList<String>();
		list.setBounds(12, 95, 750, 262);
		contentPane.add(list);
		
		JButton btnShow = new JButton("Show");
		btnShow.setForeground(Color.WHITE);
		btnShow.setBackground(new Color(27,188,155));
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(BankAccount bacc: Head.beta.accounts) {
					Head.model.addElement(bacc.toString());
				}
				list.setModel(Head.model);
			}
		});
		btnShow.setBounds(12, 42, 82, 25);
		contentPane.add(btnShow);
		
		JButton btnHome = new JButton("");
		btnHome.setBackground(new Color(27,188,155));
		Image img = new ImageIcon(this.getClass().getResource("/home-icon.png")).getImage();
		btnHome.setIcon(new ImageIcon(img));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bframe.setVisible(true);
				dispose();
			}
		});
		btnHome.setBounds(12, 373, 50, 33);
		contentPane.add(btnHome);
		
		JButton btnBack = new JButton("");
		btnBack.setBackground(new Color(27,188,155));
		Image bimg = new ImageIcon(this.getClass().getResource("/back-icon.png")).getImage();
		btnBack.setIcon(new ImageIcon(bimg));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bframe.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(712, 373, 50, 33);
		contentPane.add(btnBack);
	}
}
