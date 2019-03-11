import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class MyHistory extends JFrame {

	private JPanel contentPane;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyHistory frame = new MyHistory();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	BankAccount service = new BankAccount();
	int index = 0;
	public MyHistory() {
		setTitle("My History\r\n");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		//lblNewLabel.setText("lol");
		lblNewLabel.setBounds(141, 80, 161, 25);
		contentPane.add(lblNewLabel);
		
		index = service.myHistory().size()-1;
		if(index>-1)
			lblNewLabel.setText(service.myHistory().get(index));
		
		
		JButton btnNewButton = new JButton("Previous");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(index>0) {
					lblNewLabel.setText(service.myHistory().get(--index));
				}
			}
		});
		btnNewButton.setBounds(52, 183, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(index<service.myHistory().size()-1) {
					lblNewLabel.setText(service.myHistory().get(++index));
				}
			}
		});
		btnNewButton_1.setBounds(279, 183, 97, 25);
		contentPane.add(btnNewButton_1);
		
		
	}
}
