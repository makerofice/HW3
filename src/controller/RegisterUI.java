package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

import java.util.Calendar;
import com.toedter.calendar.JCalendar;
import com.toedter.components.JSpinField;

import dao.impl.MemberDaoImpl;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JYearChooser;
import com.toedter.components.JLocaleChooser;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import model.Member;
import service.impl.MemberServiceImpl;
import javax.swing.JSeparator;
import java.awt.Color;

public class RegisterUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static MemberServiceImpl msi = new MemberServiceImpl();
	private JTextField name;
	private JTextField phone;
	private JTextField identify;
	private JTextField address;
	private JTextField email;
	private JTextField company;
	private JTextField account;
	private JTextField password;
	private JTextField passwordcheck;
	private JTextField purpose;
	private JTextField income;
	private JTextField birth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterUI frame = new RegisterUI();
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
	public RegisterUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 719);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("會員註冊");
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 32));
		lblNewLabel.setBounds(277, 31, 138, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("姓名:");
		lblNewLabel_1.setFont(new Font("標楷體", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(77, 141, 65, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("生日:");
		lblNewLabel_1_1.setFont(new Font("標楷體", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(381, 141, 65, 32);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("身分證:");
		lblNewLabel_1_2.setFont(new Font("標楷體", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(77, 213, 93, 32);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("住址:");
		lblNewLabel_1_1_1.setFont(new Font("標楷體", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(381, 213, 65, 32);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("手機:");
		lblNewLabel_1_3.setFont(new Font("標楷體", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(77, 282, 65, 32);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("信箱:");
		lblNewLabel_1_4.setFont(new Font("標楷體", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(381, 282, 65, 32);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("任職公司:");
		lblNewLabel_1_5.setFont(new Font("標楷體", Font.PLAIN, 20));
		lblNewLabel_1_5.setBounds(77, 353, 111, 32);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("年收入:");
		lblNewLabel_1_6.setFont(new Font("標楷體", Font.PLAIN, 20));
		lblNewLabel_1_6.setBounds(381, 353, 93, 32);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("開戶目的:");
		lblNewLabel_1_7.setFont(new Font("標楷體", Font.PLAIN, 20));
		lblNewLabel_1_7.setBounds(77, 412, 102, 51);
		contentPane.add(lblNewLabel_1_7);
		
		name = new JTextField();
		name.setFont(new Font("標楷體", Font.PLAIN, 16));
		name.setBounds(136, 141, 138, 32);
		contentPane.add(name);
		name.setColumns(10);
		
		phone = new JTextField();
		phone.setFont(new Font("標楷體", Font.PLAIN, 16));
		phone.setColumns(10);
		phone.setBounds(136, 282, 138, 32);
		contentPane.add(phone);
		
		identify = new JTextField();
		identify.setFont(new Font("標楷體", Font.PLAIN, 16));
		identify.setColumns(10);
		identify.setBounds(155, 213, 138, 32);
		contentPane.add(identify);
		
		address = new JTextField();
		address.setFont(new Font("標楷體", Font.PLAIN, 16));
		address.setColumns(10);
		address.setBounds(443, 213, 138, 32);
		contentPane.add(address);
		
		email = new JTextField();
		email.setFont(new Font("標楷體", Font.PLAIN, 16));
		email.setColumns(10);
		email.setBounds(443, 282, 138, 32);
		contentPane.add(email);
		
		company = new JTextField();
		company.setFont(new Font("標楷體", Font.PLAIN, 16));
		company.setColumns(10);
		company.setBounds(179, 353, 138, 32);
		contentPane.add(company);
		
		purpose = new JTextField();
		purpose.setFont(new Font("標楷體", Font.PLAIN, 16));
		purpose.setColumns(10);
		purpose.setBounds(179, 421, 138, 32);
		contentPane.add(purpose);
		
		income = new JTextField();
		income.setFont(new Font("標楷體", Font.PLAIN, 16));
		income.setColumns(10);
		income.setBounds(465, 353, 138, 32);
		contentPane.add(income);
		
		birth = new JTextField();
		birth.setFont(new Font("標楷體", Font.PLAIN, 16));
		birth.setColumns(10);
		birth.setBounds(443, 141, 138, 32);
		contentPane.add(birth);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(30, 463, 649, 10);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2_1 = new JLabel("基本資料");
		lblNewLabel_2_1.setFont(new Font("標楷體", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(30, 75, 86, 43);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("帳戶資料");
		lblNewLabel_2.setFont(new Font("標楷體", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(30, 474, 86, 43);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_8 = new JLabel("帳號:");
		lblNewLabel_1_8.setFont(new Font("標楷體", Font.PLAIN, 20));
		lblNewLabel_1_8.setBounds(77, 517, 65, 32);
		contentPane.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("密碼:");
		lblNewLabel_1_9.setFont(new Font("標楷體", Font.PLAIN, 20));
		lblNewLabel_1_9.setBounds(77, 571, 65, 32);
		contentPane.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel("再次確認密碼:");
		lblNewLabel_1_10.setFont(new Font("標楷體", Font.PLAIN, 14));
		lblNewLabel_1_10.setBounds(77, 627, 93, 32);
		contentPane.add(lblNewLabel_1_10);
		
		account = new JTextField();
		account.setFont(new Font("標楷體", Font.PLAIN, 16));
		account.setColumns(10);
		account.setBounds(136, 517, 138, 32);
		contentPane.add(account);
		
		password = new JTextField();
		password.setFont(new Font("標楷體", Font.PLAIN, 16));
		password.setColumns(10);
		password.setBounds(136, 572, 138, 32);
		contentPane.add(password);
		
		passwordcheck = new JTextField();
		passwordcheck.setFont(new Font("標楷體", Font.PLAIN, 16));
		passwordcheck.setColumns(10);
		passwordcheck.setBounds(179, 627, 138, 32);
		contentPane.add(passwordcheck);
		
		
		
		JLabel note1 = new JLabel("");
		note1.setFont(new Font("標楷體", Font.PLAIN, 14));
		note1.setHorizontalAlignment(SwingConstants.CENTER);
		note1.setForeground(new Color(255, 0, 0));
		note1.setBounds(284, 517, 275, 32);
		contentPane.add(note1);
		
		JLabel note2 = new JLabel("");
		note2.setFont(new Font("標楷體", Font.PLAIN, 14));
		note2.setHorizontalAlignment(SwingConstants.CENTER);
		note2.setForeground(new Color(255, 0, 0));
		note2.setBounds(326, 627, 218, 32);
		contentPane.add(note2);
		
		JButton btnNewButton = new JButton("註冊");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				1.帳號重複->顯示已有帳號，請重設密碼
				2.帳號沒有重複->顯示註冊成功
				*/
				
				//重置提示文字
				note1.setText("");
				note2.setText("");
				
				String Account = account.getText();
				boolean l = new MemberServiceImpl().findByAccount(Account);
				
				if(l) 
				{
					note1.setText("帳號已存在，請重創帳號或重設密碼");
				}
				else 
				{
					String Name = name.getText();
					String Birth = birth.getText();
					String Identify = identify.getText();
					String Address = address.getText();
					String Phone = phone.getText();
					String Email = email.getText();
					String Company = company.getText();
					String Income = income.getText();
					String Purpose = purpose.getText();
					String Password = password.getText();
					String Passwordcheck = passwordcheck.getText();
					
					//兩次密碼相同->註冊成功
					if(Password.equals(Passwordcheck)) 
					{
						Member m = new Member(Name,Birth,Identify,Address,Phone,Email,Company,Income,Purpose,Account,Password);
						new MemberDaoImpl().add(m);
						
						JOptionPane.showMessageDialog(null,"註冊成功，請重新登入!");
						
						LoginUI login = new LoginUI();
						login.setVisible(true);
						dispose();
					}
					else 
					{
						//密碼不一致->顯示提示文字
						note2.setText("密碼不一致，請重新輸入!");
					}
				}
			}
		});
		btnNewButton.setFont(new Font("標楷體", Font.PLAIN, 16));
		btnNewButton.setBounds(558, 516, 121, 37);
		contentPane.add(btnNewButton);		
		
		JButton btnNewButton_1 = new JButton("返回");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginUI login = new LoginUI();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("標楷體", Font.PLAIN, 16));
		btnNewButton_1.setBounds(558, 580, 121, 37);
		contentPane.add(btnNewButton_1);
	}
}
