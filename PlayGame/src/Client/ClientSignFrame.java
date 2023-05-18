package Client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Connection.SQLHelper;
import Connection.UserModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;

public class ClientSignFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtMail;
	private JPasswordField txtPassword;
	private JPasswordField txtConfimPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientSignFrame frame = new ClientSignFrame();
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
	public ClientSignFrame() {
		super("Game Card");
		setBackground(new Color(255, 255, 204));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell\\eclipse-workspace\\PlayGame\\images\\logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 711, 328);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(0, 153, 51));
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("\u0110\u0102NG K\u00DD");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(172, 11, 94, 22);
		desktopPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 102, 51));
		separator.setForeground(new Color(255, 255, 255));
		separator.setBounds(10, 36, 406, 8);
		desktopPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("M\u1EADt Kh\u1EA9u");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(20, 140, 80, 25);
		desktopPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nh\u1EADp L\u1EA1i M\u1EADt Kh\u1EA9u");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(20, 180, 126, 25);
		desktopPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00E0i Kho\u1EA3n");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(20, 60, 80, 25);
		desktopPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Gmail");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(20, 100, 80, 25);
		desktopPane.add(lblNewLabel_4);
		
//		JLabel lblNewLabel = new JLabel("Nh\u1EADp c\u00E1c th\u00F4ng tin sau:");
//		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
//		lblNewLabel.setBounds(169, 48, 229, 43);
//		contentPane.add(lblNewLabel);
//		
//		JLabel lblUsername = new JLabel("Username:");
//		lblUsername.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
//		lblUsername.setBounds(10, 101, 118, 43);
//		contentPane.add(lblUsername);
//		
//		JLabel lblPassword = new JLabel("Password:");
//		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
//		lblPassword.setBounds(10, 164, 118, 43);
//		contentPane.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtUsername.setBounds(160, 60, 240, 25);
		desktopPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtPassword.setBounds(160, 140, 240, 25);
		desktopPane.add(txtPassword);
		
		 txtMail = new JTextField();
		txtMail.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtMail.setBounds(160, 100, 240, 25);
		desktopPane.add(txtMail);
		txtMail.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtPassword.setBounds(160, 140, 240, 25);
		desktopPane.add(txtPassword);
		
		txtConfimPassword = new JPasswordField();
		txtConfimPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtConfimPassword.setBounds(160, 180, 240, 25);
		desktopPane.add(txtConfimPassword);
		
		JButton btnSign = new JButton("\u0110\u0103ng k\u00FD");
		btnSign.setForeground(Color.WHITE);
		btnSign.setBackground(new Color(0, 102, 51));
		btnSign.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSign.setBounds(265, 235, 105, 25);
		btnSign.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (txtUsername.getText().isEmpty() || txtMail.getText().isEmpty() || txtPassword.getText().isEmpty()|| txtConfimPassword.getText().isEmpty()) {
					JOptionPane.showMessageDialog(ClientSignFrame.this, "Các trường thông tin chưa hợp lệ.");
					return;
				}
				
				if (isThisUsernameExist(txtUsername.getText().trim())) {
					JOptionPane.showMessageDialog(ClientSignFrame.this, "Username này đã tồn tại, hãy chọn tên username khác.");
					return;
				}
				
				UserModel userModel = new UserModel(txtUsername.getText().trim(), txtPassword.getText().trim());
				insertNewUser(userModel);
				
				JOptionPane.showMessageDialog(ClientSignFrame.this, "Tạo tài khoản mới thành công.");
				dispose();
			}
		});
		desktopPane.add(btnSign);
		
		JButton btnLogin = new JButton("Đăng Nhập");
		btnLogin.setForeground(Color.WHITE);
		btnLogin.addActionListener(new ActionListener() {
			//nút thoát
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnLogin){
					setVisible(false);
					new ClientLoginFrame();
				}}
			
		});
		btnLogin.setBackground(new Color(0, 102, 51));
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLogin.setBounds(70, 235, 105, 25);
		desktopPane.add(btnLogin);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\PlayGame\\images\\logo.png"));
		lblNewLabel_5.setBounds(459, 32, 220, 228);
		desktopPane.add(lblNewLabel_5);
	}
	
	
	public boolean isThisUsernameExist(String username) {
		SQLHelper sqlHelper = new SQLHelper();
		if (sqlHelper.checkingUserExist(username)) {
			return true;
		}
		return false;
	}
	
	public void insertNewUser(UserModel userModel) {
		SQLHelper sqlHelper = new SQLHelper();
		sqlHelper.insertNewUserToDatabase(userModel);
	}
}
