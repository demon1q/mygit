package tmall.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tmall.rowmapper.RowMapper;
import tmall.util.JDBCUtil;

/**
 * JDBC管理类
 * @author Administrator
 *
 */
public  final class JDBCTemplate {	
	/**
	 * 增删改方法
	 * @param sql
	 * @param param
	 * @return
	 * @throws SQLException
	 */
	public static int executeUpdate(String sql,Object ...param) throws SQLException {
		int rows = -1;
		Connection conn = JDBCUtil.getConnection();//获取连接
		PreparedStatement ps = conn.prepareStatement(sql);
		if(null != param && param.length>0) {
			for (int i = 0; i < param.length; i++) {
				ps.setObject((i+1), param[i]);// 占位符从1开始   下标从0开始
			}
		}
		rows = ps.executeUpdate();
		close(null,ps);
//		JDBCUtil.closeConnection(conn);  已经在事务中处理了连接
		return rows;
	}
	
	/**
	 * 查询方法
	 * @param sql
	 * @param rowmapper
	 * @param param
	 * @return
	 * @throws SQLException
	 */
	public static   List<Object> executeQuery(String sql,RowMapper rowmapper,Object ...param) throws SQLException {
		List<Object> list = new ArrayList<Object>();
		Connection conn = JDBCUtil.getConnection();//获取连接
		PreparedStatement ps = conn.prepareStatement(sql);
		if(null != param && param.length>0) {
			for (int i = 0; i < param.length; i++) {
				ps.setObject((i+1), param[i]);// 占位符从1开始   下标从0开始
			}
		}
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Object obj = rowmapper.getObjectMapper(rs);
			list.add(obj);
		}
		close(rs,ps);
//		JDBCUtil.closeConnection(conn);
		return list;
	}
	
	private static void close(ResultSet rs,PreparedStatement ps) throws SQLException {
		if(null != rs) {
			rs.close();
		}
		if(null != ps) {
			ps.close();
		}
	}
	
}