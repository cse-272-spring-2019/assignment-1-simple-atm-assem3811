import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainMenu extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	
	BankAccount balance;
	
	public MainMenu() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setFont(new Font("Arial", Font.BOLD, 25));
		lblMainMenu.setBounds(142, 13, 155, 29);
		contentPane.add(lblMainMenu);
		
		JLabel lblChooseAnOperation = new JLabel("Choose an Operation:");
		lblChooseAnOperation.setFont(new Font("Arial", Font.PLAIN, 18));
		lblChooseAnOperation.setBounds(12, 55, 216, 29);
		contentPane.add(lblChooseAnOperation);
		
		JButton btnShowHistory = new JButton("Show History");
		btnShowHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MyHistory menu6 = new MyHistory();
				menu6.setVisible(true);
				
			}
		});
		btnShowHistory.setBounds(131, 212, 134, 25);
		contentPane.add(btnShowHistory);
		
		JButton btnNewButton = new JButton("Withdraw");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WithdrawalEntry menu3 = new WithdrawalEntry();
				menu3.setVisible(true);
			}
		});
		btnNewButton.setBounds(131, 98, 134, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Deposit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepositEntry menu4 = new DepositEntry();
				menu4.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(131, 136, 134, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Check Balance\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your Currunt Blanace is "+BankAccount.getBalance());
			}
		});
		btnNewButton_2.setBounds(131, 174, 134, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnLogout.setBounds(323, 212, 97, 25);
		contentPane.add(btnLogout);
	}
}
