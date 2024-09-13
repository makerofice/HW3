package controller;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Member;
import service.impl.MemberServiceImpl;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTextArea;

public class HomePageUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private static MemberServiceImpl msi = new MemberServiceImpl();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePageUI frame = new HomePageUI();
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
	public HomePageUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel show = new JLabel("");
		show.setFont(new Font("標楷體", Font.PLAIN, 16));
		show.setBounds(301, 29, 145, 26);
		contentPane.add(show);
		
		JLabel lblNewLabel = new JLabel("帳戶餘額:");
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 32));
		lblNewLabel.setBounds(188, 77, 152, 64);
		contentPane.add(lblNewLabel);
		
		
		
		JButton deposit = new JButton("存款");
		deposit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DepositUI deposit = new DepositUI();
				deposit.setVisible(true);
				dispose();
			}
		});
		deposit.setFont(new Font("標楷體", Font.PLAIN, 20));
		deposit.setBounds(285, 171, 161, 43);
		contentPane.add(deposit);
		
		JButton withdraw = new JButton("提款");
		withdraw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				WithdrawUI withdraw = new WithdrawUI();
				withdraw.setVisible(true);
				dispose();
			}
		});
		withdraw.setFont(new Font("標楷體", Font.PLAIN, 20));
		withdraw.setBounds(476, 244, 161, 43);
		contentPane.add(withdraw);
		
		JButton changepassword = new JButton("修改密碼");
		changepassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePasswordUI changepassword = new ChangePasswordUI();
				changepassword.setVisible(true);
				dispose();
			}
		});
		changepassword.setFont(new Font("標楷體", Font.PLAIN, 20));
		changepassword.setBounds(88, 353, 161, 43);
		contentPane.add(changepassword);
		
		JButton remittance = new JButton("匯款/轉帳");
		remittance.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RemittanceUI remittance = new RemittanceUI();
				remittance.setVisible(true);
				dispose();
			}
		});
		remittance.setFont(new Font("標楷體", Font.PLAIN, 20));
		remittance.setBounds(476, 353, 161, 43);
		contentPane.add(remittance);
		
		JButton payfee = new JButton("繳費");
		payfee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PayfeeUI payfee = new PayfeeUI();
				payfee.setVisible(true);
				dispose();
			}
		});
		payfee.setFont(new Font("標楷體", Font.PLAIN, 20));
		payfee.setBounds(285, 427, 161, 43);
		contentPane.add(payfee);
		
		JButton transaction = new JButton("交易紀錄");
		transaction.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TransactionUI transaction = new TransactionUI();
				transaction.setVisible(true);
				dispose();
			}
		});
		transaction.setFont(new Font("標楷體", Font.PLAIN, 20));
		transaction.setBounds(88, 244, 161, 43);
		contentPane.add(transaction);
		
		JButton btnNewButton_6 = new JButton("登出");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginUI login = new LoginUI();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton_6.setFont(new Font("標楷體", Font.PLAIN, 14));
		btnNewButton_6.setBounds(504, 501, 108, 26);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_6_1 = new JButton("離開");
		btnNewButton_6_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_6_1.setFont(new Font("標楷體", Font.PLAIN, 14));
		btnNewButton_6_1.setBounds(642, 501, 108, 26);
		contentPane.add(btnNewButton_6_1);
		
		JLabel sum = new JLabel("");
		sum.setForeground(new Color(255, 255, 255));
		sum.setBackground(new Color(255, 255, 255));
		sum.setFont(new Font("標楷體", Font.PLAIN, 32));
		sum.setBounds(341, 77, 193, 64);
		contentPane.add(sum);
		
		
	}
}
