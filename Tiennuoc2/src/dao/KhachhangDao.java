package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import database.JDBC;
import model.Khachhang;

public class KhachhangDao implements DAOinterface<Khachhang>{
	
	public static KhachhangDao getInstance() {
		return new KhachhangDao();
	}

	@Override
	public int insert(Khachhang t) {
		// TODO Auto-generated method stub
		int ketQua = 0;
		try {
			Connection con = JDBC.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "INSERT INTO ttkhang (makh, tenkh, sdt, diachi, gioitinh)"+
						" VALUES ('"+t.getMakh()+"' , '"+t.getHovaten()+"' , '" +t.getSdt()+"' , '"+t.getDiachi()+"' , '"+t.getGioitinh()+"')";
			
			ketQua = st.executeUpdate(sql);
			
			System.out.println("Bạn đã thực thi"+ sql);
			System.out.println("Có"+ ketQua+" dòng bị thay đổi");
			
			JDBC.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int update(Khachhang t) {
		// TODO Auto-generated method stub
		int ketQua = 0;
		try {
			Connection con = JDBC.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "UPDATE ttkhang "+
						" SET " + 
						" tenkh='"+ t.getHovaten()+"'"+
						", sdt='"+ t.getSdt()+"'"+
						", diachi='"+ t.getDiachi()+"'"+
						", gioitinh='"+ t.getGioitinh()+"'"+
						" WHERE makh='"+t.getMakh()+"\'";
			
			ketQua = st.executeUpdate(sql);
			
			System.out.println("Bạn đã thực thi"+ sql);
			System.out.println("Có"+ ketQua+" dòng bị thay đổi");
			
			JDBC.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int delete(Khachhang t) {
		// TODO Auto-generated method stub
		int ketQua = 0;
		try {
			Connection con = JDBC.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "DELETE from ttkhang "+
						" WHERE makh='"+t.getMakh()+"'";
			
			ketQua = st.executeUpdate(sql);
			
			System.out.println("Bạn đã thực thi " + sql);
			System.out.println("Có " + ketQua+" dòng bị thay đổi");
			
			JDBC.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public ArrayList<Khachhang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Khachhang selectById(Khachhang t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Khachhang> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
