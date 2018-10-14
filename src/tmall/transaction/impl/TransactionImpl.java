package tmall.transaction.impl;

import java.sql.Connection;
import java.sql.SQLException;

import tmall.transaction.Transaction;
import tmall.util.JDBCUtil;

public class TransactionImpl implements Transaction{
	/**
	 * 事务开启
	 */
	public void begin() {
		Connection conn = JDBCUtil.getConnection();
		try {
			conn.setAutoCommit(false);//false为禁止自动提交
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 事务提交
	 */
	public void commit() {
		Connection conn = JDBCUtil.getConnection();
		try {
			conn.commit();//事务提交
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.closeConnection(conn);
		}
	}
	/**
	 * 事务回滚
	 */
	public void rollback() {
		Connection conn = JDBCUtil.getConnection();
		try {
			conn.rollback();//事务回滚
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.closeConnection(conn);
		}
	}

}
