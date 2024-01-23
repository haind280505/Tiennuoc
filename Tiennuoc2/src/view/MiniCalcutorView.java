package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import controler.MiniCalcutorController;
import database.JDBC;
import test.MiniCalcutorTest;



public class MiniCalcutorView extends JFrame {

	public MiniCalcutorView() {
		this.init();
	}

	private void init() {
		// TODO Auto-generated method stub
		setTitle("Bảng tính tiền nước");
		
		setSize(700, 600);

		setLocationRelativeTo(null);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		addControl();

		setVisible(true);
		
		//Set icon.
		URL url_icon = MiniCalcutorTest.class.getResource("Laurent-Baumann-Aqua-Blend-Aqua-Smooth-Folder-Torrents.16.png");
		Image img = Toolkit.getDefaultToolkit().createImage(url_icon);
		this.setIconImage(img);

	}

	public void addControl()

	{

		JPanel pnBorder = new JPanel();

		pnBorder.setLayout(new BorderLayout());

		JPanel pnNorth = new JPanel();
		
		Font font_1 = new Font("Area", Font.BOLD,12);
		
		
		JButton btnShowCard1 = new JButton("Thông tin khách hàng");
		
		btnShowCard1.setFont(font_1);
		
		btnShowCard1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage
				(MiniCalcutorTest.class.getResource("Hopstarter-Sleek-Xp-Basic-User-Group.16.png"))));

		JButton btnShowCard2 = new JButton("Thông tin hóa đơn");
		
		btnShowCard2.setFont(font_1);
		
		btnShowCard2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage
				(MiniCalcutorTest.class.getResource("Fa-Team-Fontawesome-FontAwesome-File-Invoice-Dollar.16.png"))));
		
		
		
	

		pnNorth.add(btnShowCard1);

		pnNorth.add(btnShowCard2);
		
		

		pnBorder.add(pnNorth, BorderLayout.WEST);
		
		
		pnNorth.setLayout(new GridLayout(5,1,80,80));
	

		final JPanel pnCenter = new JPanel();
		

		pnCenter.setLayout(new CardLayout());
		
		Font font = new Font("Area", Font.ITALIC, 40);
		JPanel jpn = new JPanel();
		JLabel jlb = new JLabel("QUẢN LÝ THU, TÍNH TIỀN NƯỚC ");
		
		jlb.setFont(font);
		jpn.setLayout(new BorderLayout());
		
		
		MiniCalcutorController miniCalcutorController = new MiniCalcutorController(this);
		
		JMenuBar menubar=new JMenuBar();
		setJMenuBar(menubar);
		JMenu mnuFile=new JMenu("File");
		menubar.add(mnuFile);
		JMenuItem mnuFileExit=new JMenuItem("Exit");
		mnuFileExit.addActionListener(miniCalcutorController);
		mnuFile.add(mnuFileExit);
		

		
		//1.Thông tin khách hàng.
		final JPanel pnCard1 = new JPanel();
		
		JLabel jlb_makh = new JLabel("Mã khách hàng :");
		JTextField jtf_makh = new JTextField(50);
		
		JLabel jlb_sdt = new JLabel("Số điện thoại :");
		JTextField jtf_sdt = new JTextField(60);
		
		JLabel jlb_hoten = new JLabel("Họ tên khách hàng :");
		JTextField jtf_hoten = new JTextField(50);

		JLabel jlb_diachi = new JLabel("Địa chỉ :");
		JTextField jtf_diachi = new JTextField(50);
		
		JLabel jlb_timkiem = new JLabel("Tìm kiếm");
		JTextField jtp_timkiem = new JTextField(50);
		
		JButton jbt_sua= new JButton("Sửa");
		
		jbt_sua.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage
				(MiniCalcutorTest.class.getResource("Etherbrian-Webuosities-Fix-it.16.png"))));
		
		JButton jbt_luu= new JButton("Lưu");
		
		jbt_luu.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage
				(MiniCalcutorTest.class.getResource("Oxygen-Icons.org-Oxygen-Actions-document-save.16.png"))));
		

		JButton jbt_timkiem= new JButton("Tìm kiếm");
		
		jbt_timkiem.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage
				(MiniCalcutorTest.class.getResource("Oxygen-Icons.org-Oxygen-Actions-page-zoom.16.png"))));
		

	
		
		pnCard1.setLayout(new FlowLayout(ABORT));
		pnCard1.add(jlb_makh);
		pnCard1.add(jtf_makh);
		pnCard1.add(jlb_sdt);
		pnCard1.add(jtf_sdt);
		pnCard1.add(jlb_hoten);
		pnCard1.add(jtf_hoten);
		pnCard1.add(jlb_diachi);
		pnCard1.add(jtf_diachi);
		pnCard1.add(jlb_timkiem);
		pnCard1.add(jtp_timkiem);
		pnCard1.add(jbt_sua);
		pnCard1.add(jbt_luu);
		pnCard1.add(jbt_timkiem);
		
		
		JLabel jlb_gioitinh = new JLabel("Giói tính :");
		pnCard1.add(jlb_gioitinh);
		JRadioButton rad1=new JRadioButton("Nam");
		JRadioButton rad2=new JRadioButton("Nữ");
		ButtonGroup group=new ButtonGroup();
		group.add(rad1);group.add(rad2);
		pnCard1.add(rad1);
		pnCard1.add(rad2);
		add(pnCard1);
		
	
		Border borderr = BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder borderTitlee = BorderFactory.createTitledBorder(borderr, "Thông tin khách hàng");
		pnCard1.setBorder(borderTitlee);
		
		
		JButton jbt_them= new JButton("Thêm");
		
		jbt_them.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage
				(MiniCalcutorTest.class.getResource("Hopstarter-Rounded-Square-Button-Add.16.png"))));
		
		pnCard1.add(jbt_them);
		JButton jbt_xoa= new JButton("Xóa");
		jbt_xoa.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage
				(MiniCalcutorTest.class.getResource("Oxygen-Icons.org-Oxygen-Actions-draw-eraser.16.png"))));
		pnCard1.add(jbt_xoa);
//		JButton jbt_hienthi = new JButton("Hien thi");
//		pnCard1.add(jbt_hienthi);
		//Bang.
		
		DefaultTableModel dm=new DefaultTableModel();
		dm.addColumn("Mã khách hàng");
		dm.addColumn("Họ và tên");
		dm.addColumn("Số điện thoại");
		dm.addColumn("Địa chỉ");
		dm.addColumn("Giới tính");
	
//		tbl.setModel(dm);
//		tbl.getColumnModel().getColumn(0).setResizable(false);
//		tbl.getColumnModel().getColumn(0).setPreferredWidth(100);
//		tbl.getColumnModel().getColumn(1).setPreferredWidth(100);
//		tbl.getColumnModel().getColumn(2).setPreferredWidth(100);
//		tbl.getColumnModel().getColumn(3).setPreferredWidth(120);
//		tbl.setBounds(53,75,79,117);
//		this.getContentPane().add(tbl);
		
		
		
		
		
		

//		jbt_hienthi.addActionListener(new ActionListener() {
			
//			@Override
//			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mySQL://localhost:3306/ttkh","root","");
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("SELECT * FROM ttkhang");
					while (rs.next()) {
						String makh = rs.getString("makh");
						String hovaten = rs.getString("hovaten");
						String sdt = rs.getString("sdt");
						String diachi = rs.getString("diachi");
						String gioitinh = rs.getString("gioitinh");
						dm.addRow(new Object [] {makh, hovaten, sdt, diachi, gioitinh});
					}
					
					st.close();
					con.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
				final JTable tbl=new JTable(dm);
				JScrollPane sc = new JScrollPane(tbl);
				pnCard1.add(sc);
				
				
				jbt_them.addActionListener(new ActionListener() {
				
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						//1.1.Thêm.
						String makh = jtf_makh.getText();
						String hovaten = jtf_hoten.getText();
						String sdt = jtf_sdt.getText();
						String diachi = jtf_diachi.getText();
						String gioitinh = "";
						if (rad1.isSelected()) {
							gioitinh = "Nam";
						}else if(rad2.isSelected()) {
							gioitinh = "Nữ";
						}
					
						//Tạo 1 dòng thêm vào bảng.
						Vector vec = new Vector<>();
						vec.add(makh);
						vec.add(hovaten);
						vec.add(sdt);
						vec.add(diachi);
						vec.add(gioitinh);
						
						
						// them vao model cua bang.
						dm.addRow(vec);
						
						// cap nhat lai view.
						dm.fireTableDataChanged();
				
					}
				});
				jbt_xoa.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						int row = tbl.getSelectedRow();
						dm.removeRow(row);
						fillToTable();		
					}
				});
				
				
				
				
//			}
//		});
//		
		
			
		//2.Thông tin hóa đơn.
		final JPanel pnCard2 = new JPanel();

		JLabel jlb_chisocu = new JLabel("Chỉ số cũ");
		JTextField jtf_chisocu = new JTextField(50);

		JLabel jlb_chisomoi = new JLabel("Chỉ số mới");
		JTextField jtf_chisomoi = new JTextField(50);

		JLabel jlb_tieuthu = new JLabel("Số mét khối tiêu thụ");
		JTextField jtf_tieuthu = new JTextField(50);

		JLabel jlb_trongdm = new JLabel("Số mét khối trong định mức");
		JTextField jtf_trongdm = new JTextField(50);

		JLabel jlb_vuotdm = new JLabel("Số mét khối vượt định mức");
		JTextField jtf_vuotdm = new JTextField(50);

		JLabel jlb_sotientra = new JLabel("Số tiền phải thanh toán");
		JTextField jtf_sotientra = new JTextField(50);
		
	

		JButton jbt_tinh = new JButton("Tính");
		
		jbt_tinh.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage
				(MiniCalcutorTest.class.getResource("Fatcow-Farm-Fresh-Calculate-sheet.16.png"))));
		
		JButton jbt_Thoat = new JButton("Thoát");
		jbt_Thoat.addActionListener(miniCalcutorController);
		
		
		jbt_Thoat.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage
				(MiniCalcutorTest.class.getResource("Bootstrap-Bootstrap-Bootstrap-escape.16.png"))));

		pnCard2.setLayout(new FlowLayout(ABORT));
		pnCard2.add(jlb_chisocu);
		pnCard2.add(jtf_chisocu);
		pnCard2.add(jlb_chisomoi);
		pnCard2.add(jtf_chisomoi);
		pnCard2.add(jlb_tieuthu);
		pnCard2.add(jtf_tieuthu);
		pnCard2.add(jlb_trongdm);
		pnCard2.add(jtf_trongdm);
		pnCard2.add(jlb_vuotdm);
		pnCard2.add(jtf_vuotdm);
		pnCard2.add(jlb_sotientra);
		pnCard2.add(jtf_sotientra);
		pnCard2.add(jbt_tinh);
		pnCard2.add(jbt_Thoat);
		

		Border border = BorderFactory.createLineBorder(Color.RED);
		TitledBorder borderTitle = BorderFactory.createTitledBorder(border, "Thông tin hóa đơn");
		pnCard2.setBorder(borderTitle);

		
		
		//3. Thong ke.
		final JPanel pnCard3 = new JPanel();
		
		
		Border borderrr = BorderFactory.createLineBorder(Color.BLACK);
		TitledBorder borderTitleee = BorderFactory.createTitledBorder(borderrr, "Thống kê");
		pnCard3.setBorder(borderTitleee);
		
		
		this.setLayout(new BorderLayout());
		this.add(jlb, BorderLayout.NORTH);
		
		
		
		
		pnCenter.add(pnCard1, "mycard1");

		pnCenter.add(pnCard2, "mycard2");
		
		pnCenter.add(pnCard3, "mycard3");

		pnBorder.add(pnCenter, BorderLayout.CENTER);
		
		
		
		Container cont = getContentPane();

		cont.add(pnBorder);
		
		
		

		btnShowCard1.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent arg0) {

				CardLayout cl = (CardLayout) pnCenter.getLayout();

				cl.show(pnCenter, "mycard1");

			}

		});

		btnShowCard2.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent arg0) {

				CardLayout cl = (CardLayout) pnCenter.getLayout();

				cl.show(pnCenter, "mycard2");

			}

		});
		
	

	}

	protected void fillToTable() {
		// TODO Auto-generated method stub
		
	}
}
