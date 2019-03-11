import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WithdrawalEntry extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WithdrawalEntry frame = new WithdrawalEntry();
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
	
	BankAccount service = new BankAccount();
	
	public WithdrawalEntry() {
		setTitle("Deposit Window");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Withdrawl amount:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 25, 218, 28);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(109, 104, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double entry = Double.parseDouble(textField.getText());
				if(BankAccount.getBalance() > entry) {
					service.withDrawalOp(entry);
					JOptionPane.showMessageDialog(btnNewButton, "Operation Successfull !");
					if(service.myHistory().size()==5) {
						service.myHistory().remove(0);
					}
					service.myHistory().add("Withdraw: "+entry);
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Withdrawal amount is greater than currunt balance !");
				}
				
			}
		});
		btnNewButton.setBounds(247, 103, 97, 25);
		contentPane.add(btnNewButton);
	}
}
