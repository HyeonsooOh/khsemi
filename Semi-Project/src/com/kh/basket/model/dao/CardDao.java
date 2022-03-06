package com.kh.basket.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.kh.admin.notice.model.dao.NoticeDao;
import com.kh.common.JDBCTemplate;

public class CardDao {
	
	private Properties prop = new Properties();
	
	public CardDao() {
		
		String fileName = NoticeDao.class.getResource("/sql/order/order-mapper.xml").getPath();
		
		try {
			prop.loadFromXML(new FileInputStream(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public int insertCard(Connection conn, String cardNum, String cardPwd, String cardName, int userNo) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("insertCard");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, cardName);
			pstmt.setString(2, cardPwd);
			pstmt.setString(3, cardNum);
			pstmt.setInt(4, userNo);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
		
	}

}
