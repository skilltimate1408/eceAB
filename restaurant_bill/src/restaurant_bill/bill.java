package restaurant_bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 455, 707);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restaurant Bill");
		lblNewLabel.setFont(new Font("Javanese Text", Font.BOLD, 34));
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setBounds(79, 31, 320, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu :");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 28));
		lblNewLabel_1.setBounds(34, 121, 178, 47);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Quantity :");
		lblNewLabel_1_1.setFont(new Font("Sitka Text", Font.BOLD, 28));
		lblNewLabel_1_1.setBounds(21, 196, 178, 47);
		frame.getContentPane().add(lblNewLabel_1_1);
		JComboBox c9 = new JComboBox();
		c9.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		c9.setModel(new DefaultComboBoxModel(new String[] {"select", "Prawns-100", "mutton Biryani-200", "chicken 65-300"}));
		c9.setBounds(201, 124, 206, 37);
		frame.getContentPane().add(c9);
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c9.getSelectedItem();
				String qnty=t1.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
			
				if(item.equals("Prawns-100"))
				{
					bill=q*100;
					JOptionPane.showMessageDialog(btnNewButton, "Hello\n Selected item:"+item+"\n Qnty: "+q+"\n your bill:"+bill);
				}
				else if(item.equals("mutton Biryani-200"))
				{
					bill=q*200;
					JOptionPane.showMessageDialog(btnNewButton, "Hello\n Selected item:"+item+"\n Qnty: "+q+"\n your bill:"+bill);
				}
				else if(item.equals("chicken 65-300"))
				{
					bill=q*300;
					JOptionPane.showMessageDialog(btnNewButton, "Hello\n Selected item:"+item+"\n Qnty: "+q+"\n your bill:"+bill);
				}
					
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(158, 512, 104, 37);
		frame.getContentPane().add(btnNewButton);
		
		
		
		t1 = new JTextField();
		t1.setFont(new Font("Sitka Banner", Font.PLAIN, 16));
		t1.setBounds(222, 204, 187, 33);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int bill=0;
				JOptionPane.showMessageDialog(btnNewButton, "cc  ");
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\aa.PNG"));
		lblNewLabel_2.setBounds(21, 273, 159, 155);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
