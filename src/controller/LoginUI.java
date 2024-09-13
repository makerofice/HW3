package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Member;
import service.impl.MemberServiceImpl;
import util.Cal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.UIManager;

public class LoginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField account;
	private JPasswordField password;
	private static MemberServiceImpl msi = new MemberServiceImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
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
	public LoginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("厚挖錢");
		lblNewLabel.setBounds(123, 22, 126, 51);
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 42));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("網路銀行");
		lblNewLabel_1.setBounds(259, 40, 74, 27);
		lblNewLabel_1.setFont(new Font("標楷體", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("帳號:");
		lblNewLabel_2.setBounds(102, 124, 54, 27);
		lblNewLabel_2.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_2);
		
		account = new JTextField();
		account.setFont(new Font("Calibri", Font.PLAIN, 16));
		account.setBounds(166, 122, 167, 33);
		contentPane.add(account);
		account.setColumns(10);
		
		JLabel note = new JLabel("");
		note.setForeground(new Color(255, 0, 0));
		note.setFont(new Font("標楷體", Font.PLAIN, 16));
		note.setHorizontalAlignment(SwingConstants.CENTER);
		note.setBounds(21, 231, 426, 28);
		contentPane.add(note);
		
		JLabel lblNewLabel_2_1 = new JLabel("密碼:");
		lblNewLabel_2_1.setBounds(102, 190, 54, 27);
		lblNewLabel_2_1.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_2_1);
		
		/*密碼使用JPasswordField*/
		password = new JPasswordField();
		password.setEchoChar('*');
		password.setFont(new Font("Calibri", Font.PLAIN, 16));
		password.setBounds(166, 188, 167, 33);
		contentPane.add(password);
		
		/*JCheckBox選擇是否要顯示密碼*/
		JCheckBox chckbxNewCheckBox = new JCheckBox("顯示密碼");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) 
				{
					password.setEchoChar((char)0); //顯示密碼
				}
				else 
				{
					password.setEchoChar('*'); //隱藏密碼
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("標楷體", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(350, 193, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		/*時間*/
		JLabel lblNewLabel_3 = new JLabel("Time");
			lblNewLabel_3.setBounds(293, 73, 167, 39);
		lblNewLabel_3.setFont(new Font("標楷體", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_3);
		
		//Date d=new Date();
		//String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		//lblNewLabel_3.setText(timeStamp);
		
		Timer timer = new Timer(1000,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
				lblNewLabel_3.setText(timeStamp);
			}
			
		});
		timer.start();
		
		/*下面是按鈕們*/
		JButton btnNewButton = new JButton("登入");
		btnNewButton.setBounds(102, 275, 109, 39);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				1.帳密正確->LoginSuccessUI
				2.密碼錯誤->顯示密碼錯誤 
				3.沒有帳號->顯示請註冊
			    */
				String Account = account.getText();
				String Password = password.getText();
				
				Member lg1 = msi.Login(Account,Password);
				boolean lg2 = msi.findByAccount(Account);
				
				note.setText(""); //重置提示文字
				
				if(lg1!=null) //帳密正確->存檔->LoginSuccessUI
				{
					Cal.SaveFile("Member.txt",lg1);
					
					JOptionPane.showMessageDialog(null,"登入成功~即將進入首頁!!!","輸入正確",JOptionPane.YES_NO_CANCEL_OPTION);
					HomePageUI hp = new HomePageUI();
					hp.setVisible(true);
					dispose();
				}
				else if(lg2) 
				{
					//已有帳號，是密碼輸入錯誤或是沒註冊
					note.setText("帳號已存在，請確認密碼是否輸入正確or註冊新帳號");
				}
				else 
				{
					//帳密都不正確，且沒有帳號
					note.setText("請先註冊帳號~");
				}
			}
		});
		btnNewButton.setFont(new Font("標楷體", Font.PLAIN, 24));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("註冊");
		btnNewButton_1.setBounds(254, 275, 109, 39);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegisterUI register = new RegisterUI();
				register.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("標楷體", Font.PLAIN, 24));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("清除");
		btnNewButton_2.setBounds(113, 335, 87, 27);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				account.setText("");
				password.setText("");
			}
		});
		btnNewButton_2.setFont(new Font("標楷體", Font.PLAIN, 16));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("離開");
		btnNewButton_2_1.setBounds(265, 335, 87, 27);
		btnNewButton_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2_1.setFont(new Font("標楷體", Font.PLAIN, 16));
		contentPane.add(btnNewButton_2_1);
				
	}
}