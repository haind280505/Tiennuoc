package test;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
import com.mysql.cj.xdevapi.Statement;

import dao.KhachhangDao;
import database.JDBC;
import model.Khachhang;
import view.MiniCalcutorView;

public class MiniCalcutorTest {
	public static void main(String[] args) {
		new MiniCalcutorView();
	}

}
