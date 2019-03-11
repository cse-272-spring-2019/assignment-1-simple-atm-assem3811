import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginAuthentication {

	private JFrame frmJavaBank;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAuthentication window = new LoginAuthentication();
					window.frmJavaBank.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	BankAccount service = new BankAccount();
	public LoginAuthentication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavaBank = new JFrame();
		frmJavaBank.setTitle("Java Bank");
		frmJavaBank.setBounds(100, 100, 486, 321);
		frmJavaBank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavaBank.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUsername.setBounds(100, 90, 120, 25);
		frmJavaBank.getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(217, 94, 178, 22);
		frmJavaBank.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Password:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(98, 127, 99, 31);
		frmJavaBank.getContentPane().add(lblNewLabel);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uname = textField.getText();
				String psd = passwordField.getText();
				
				if (uname.equals("Assem") && psd.equals("5669")) {
					
					JOptionPane.showMessageDialog(frmJavaBank, "Logged in Successfully!");
					MainMenu menu2 = new MainMenu();
					menu2.setVisible(true);
					service.setBalanceToZ();
				}
				else {
					JOptionPane.showMessageDialog(frmJavaBank, "Invalid Username or Password!");
				}
			}
		});
		btnSubmit.setBounds(217, 162, 97, 25);
		frmJavaBank.getContentPane().add(btnSubmit);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		passwordField.setBounds(217, 132, 178, 22);
		frmJavaBank.getContentPane().add(passwordField);
	}
}
