package Client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Connection.SQLHelper;
import Connection.UserModel;
import DataPacket.DataPacket;
import DataPacket.RequestSendMessenger;
import Storage.UserInfor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JPasswordField;

public class ClientLoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblStatusConnection;
	JButton btnLogin = new JButton("\u0110\u0103ng Nh\u1EADp");
	
	SQLHelper sqlHelper = new SQLHelper();
	
//	Socket socket;
//	ObjectInputStream objectInputStream;
//	ObjectOutputStream objectOutputStream;
	//ClientThread clientThread;

	/**
	 * Launch the application.
	 */
	public int doAuth(UserModel userModel) {
		SQLHelper sqlHelper = new SQLHelper();
		if(!sqlHelper.validateUser(userModel)) {
			return -1;
		}
		return 1;
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientLoginFrame frame = new ClientLoginFrame();
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
	public ClientLoginFrame() {
		super("Game Card");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell\\eclipse-workspace\\PlayGame\\images\\logo.png"));
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 817, 383);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(0, 153, 51));
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblLogo = new JLabel("\u0110\u0102NG NH\u1EACP");
		lblLogo.setForeground(new Color(255, 255, 255));
		lblLogo.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblLogo.setBounds(464, 11, 196, 40);
		desktopPane.add(lblLogo);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(0, 153, 51));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\PlayGame\\images\\logo.png"));
		lblNewLabel.setBounds(34, 54, 209, 226);
		desktopPane.add(lblNewLabel);
		
		
		
//		JLabel lblHunhCaoBo = new JLabel("");
//		lblHunhCaoBo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
//		lblHunhCaoBo.setBounds(10, 52, 592, 36);
//		contentPane.add(lblHunhCaoBo);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00E0i Kho\u1EA3n");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(361, 54, 89, 23);
		desktopPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("M\u1EADt Kh\u1EA9u");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(361, 140, 69, 28);
		desktopPane.add(lblNewLabel_2);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(361, 97, 343, 33);
		txtUsername.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent keyEvent) {
				// TODO Auto-generated method stub
				if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER) {
					if (!txtUsername.getText().isEmpty() || !txtPassword.getText().isEmpty()) {
						
						UserModel userModel = new UserModel(txtUsername.getText().trim(), txtPassword.getText().trim());
						if (doAuth(userModel) == -1) {
							JOptionPane.showMessageDialog(ClientLoginFrame.this, "Đăng nhập thấp bại.");
							return;
						}
						
		
						UserInfor.accountName = txtUsername.getText().trim();
						
						ClientGDien clientGameplay = new ClientGDien();
						//clientGameplay.setAccountName(textFieldAccountName.getText().trim());
						clientGameplay.setVisible(true);
						
						//ClientLoginFrame.this.setVisible(false);
						dispose();
					} else {
						JOptionPane.showMessageDialog(ClientLoginFrame.this, "Các trường thông tin chưa hợp lệ.");
					}
				}
			}
		});
		desktopPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(361, 178, 343, 33);
		desktopPane.add(txtPassword);
		
		
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(0, 102, 51));
		btnLogin.setBounds(402, 276, 105, 25);
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty()) {
					JOptionPane.showMessageDialog(ClientLoginFrame.this, "Chưa nhập Tài khoản hoặc mật khẩu");
					return;
				}
				UserModel userModel = new UserModel(txtUsername.getText().trim(), txtPassword.getText().trim());
				if (doAuth(userModel) == -1) {
					JOptionPane.showMessageDialog(ClientLoginFrame.this, "Đăng nhập thất bại");
					return;
				}
				
				UserInfor.accountName = txtUsername.getText().trim();
				
				// start audio thread in clientGamplay too
				
				ClientGDien clientGameplay = new ClientGDien();
				//clientGameplay.setAccountName(textFieldAccountName.getText().trim());
				clientGameplay.setVisible(true);
				
				//ClientLoginFrame.this.setVisible(false);
				dispose();
				
				
			}
			
		});
		//btnLogin.addActionListener((arg) -> arg.toString());
		desktopPane.add(btnLogin);
		
		JButton btnexit = new JButton("Thoát");
		btnexit.setForeground(new Color(255, 255, 255));
		btnexit.setBackground(new Color(0, 102, 51));
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Thoát")){
					System.exit(0);
				}
			}
		});
		btnexit.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnexit.setBounds(555, 276, 105, 25);
		desktopPane.add(btnexit);
		
//		lblStatusConnection = new JLabel("");
//		lblStatusConnection.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
//		lblStatusConnection.setBounds(1001, 355, 55, 15);
//		if (sqlHelper.checkingStatusOnline() == true) {
//			lblStatusConnection.setForeground(Color.green);
//			lblStatusConnection.setText("Online");
//		} else {
//			lblStatusConnection.setForeground(Color.red);
//			lblStatusConnection.setText("Offline");
//		}
//		contentPane.add(lblStatusConnection);
		
		JLabel lblNewLabel_3 = new JLabel("Bạn chưa có tài khoản?");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(359, 222, 148, 33);
		desktopPane.add(lblNewLabel_3);
		
		JLabel lblSign = new JLabel("Đăng ký");
		lblSign.setForeground(Color.WHITE);
		lblSign.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSign.setBounds(553, 222, 105, 33);
		lblSign.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				ClientSignFrame clientSignFrame = new ClientSignFrame();
				clientSignFrame.setVisible(true);
			}
		});
		desktopPane.add(lblSign);
		
//		JLabel lblBackGround = new JLabel();
//		BufferedImage bufferdImageBackground;
//		try {
//			bufferdImageBackground = ImageIO.read(new File("images\\nen.jpg"));
//			Image imageScaled = bufferdImageBackground.getScaledInstance(625, 417, Image.SCALE_SMOOTH);
//			imageScaled.flush();
//			ImageIcon imageIcon = new ImageIcon(imageScaled);
//			lblBackGround.setIcon(imageIcon);
//			lblBackGround.setBounds(0, 0, 625, 417);
//			contentPane.add(lblBackGround);
//			
//			JLabel lblUsername = new JLabel("Username");
//			lblUsername.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
//			lblUsername.setBounds(635, 73, 122, 36);
//			contentPane.add(lblUsername);
//			
//			JLabel lblPassword = new JLabel("Password");
//			lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
//			lblPassword.setBounds(635, 123, 122, 36);
//			contentPane.add(lblPassword);
//			
//			txtPassword = new JPasswordField();
//			txtPassword.setBounds(755, 121, 289, 36);
//			contentPane.add(txtPassword);
//			
//			
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
