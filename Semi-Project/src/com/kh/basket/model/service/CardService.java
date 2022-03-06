package com.kh.basket.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.basket.model.dao.BasketDao;
import com.kh.basket.model.dao.CardDao;
import com.kh.basket.model.vo.Basket;
import com.kh.common.JDBCTemplate;

public class CardService {

	public int insertCard(String cardNum, String cardPwd, String cardName, int userNo) {
		
		Connection conn = JDBCTemplate.getConnection();
		
		int result = new CardDao().insertCard(conn, cardNum, cardPwd, cardName, userNo);
		
		if(result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
		
	}

}
