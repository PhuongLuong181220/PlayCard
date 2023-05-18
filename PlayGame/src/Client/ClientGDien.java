package Client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import java.awt.Toolkit;

public class ClientGDien extends JFrame implements ActionListener{
	JButton start = new JButton("B\u1EAFt \u0111\u1EA7u");
	JButton help = new JButton("Tr\u1EE3 gi\u00FAp");
	JButton exit = new JButton("\u0110\u0103ng Xu\u1EA5t");
	private JPopupMenu popup;
	private final JLabel lblNewLabel = new JLabel("New label");
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientGDien frameLogo = new ClientGDien();
					frameLogo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//-------------------------------------------------------------------------
	// Ham khoi tao
	public ClientGDien(){
		super("Game Card");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell\\eclipse-workspace\\PlayGame\\images\\logo.png"));
		setBackground(new Color(255, 255, 255));
		getContentPane().setBackground(new Color(0, 153, 51));
		
		//tao trinh thuc don File
      
    //--------------------------------------------------------------------------
       // xu ly su kien tren thanh menu               
        //Nhan start de bat dau choi 
//        fileMenu.add(new AbstractAction("Start"){
//        	public void actionPerformed(ActionEvent event)
//        	 {
//        	 	 setVisible(false);
////			     new CapDo();
//        	 }
//          });
//         //Nhan Help de biet thong tin luat choi
//         fileMenu.add(new AbstractAction("Help"){
//         	public void actionPerformed(ActionEvent event)
//         	{
////         		 new TroGiup();
//         	}
//         });
//         //nhan exit de ket thuc
//        fileMenu.add(new AbstractAction("Exit"){
//             public void actionPerformed(ActionEvent event)
//             {
//                System.exit(0);
//              }
//           }); 
                
        // add tat ca muc con vao manu bar
//        JMenuBar menuBar = new JMenuBar();
//        setJMenuBar(menuBar);
//        menuBar.add(fileMenu);
//        JPanel panel = new JPanel();
//        panel.setComponentPopupMenu(popup);
//        getContentPane().add(panel);
//        panel.addMouseListener(new MouseAdapter() {});
       //tao cac button
//		getContentPane().setLayout(null);		
		
		getContentPane().setLayout(null);
		start.setForeground(new Color(255, 255, 255));
		start.setFont(new Font("Times New Roman", Font.BOLD, 14));
		start.setBackground(new Color(0, 102, 51));
		start.setBounds(299,387,120,30);
		start.addMouseListener(new MouseListener() {
			
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
				ClientGameplay clientRoom = new ClientGameplay();
				clientRoom.setVisible(true);
				dispose();
			}
		
		});
		getContentPane().add(start);
		
		
		help.setForeground(new Color(255, 255, 255));
		help.setFont(new Font("Times New Roman", Font.BOLD, 14));
		help.setBackground(new Color(0, 102, 51));
		help.setBounds(496,387,120,30);
		
//		help.addActionListener(this);
		getContentPane().add(help);
		
		
		exit.setForeground(new Color(255, 255, 255));
		exit.setFont(new Font("Times New Roman", Font.BOLD, 14));
		exit.setBackground(new Color(0, 102, 51));
		exit.setBounds(105,387,120,30);
		exit.addMouseListener(new MouseListener() {
			
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
				ClientLoginFrame clientLogin = new ClientLoginFrame();
				clientLogin.setVisible(true);
				JOptionPane.showMessageDialog(null, "Bạn đã đăng xuất");
				dispose();
			}
		
		});
//		exit.addActionListener(this);
		getContentPane().add(exit);
		setSize(727,504);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		lblNewLabel.setBounds(10, 10, 701, 439);
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\PlayGame\\images\\logo1.png").getImage().getScaledInstance(691, 439, Image.SCALE_DEFAULT)));
		getContentPane().add(lblNewLabel);
		show();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}