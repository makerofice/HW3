package controller;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TransactionUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TransactionUI frame = new TransactionUI();
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
	public TransactionUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("交易紀錄");
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 20));
		lblNewLabel.setBounds(291, 23, 92, 39);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("確認");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				HomePageUI homepage = new HomePageUI();
				homepage.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("標楷體", Font.PLAIN, 16));
		btnNewButton.setBounds(556, 303, 91, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("離開");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HomePageUI homepage = new HomePageUI();
				homepage.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("標楷體", Font.PLAIN, 16));
		btnNewButton_1.setBounds(556, 359, 91, 29);
		contentPane.add(btnNewButton_1);
	}

}
