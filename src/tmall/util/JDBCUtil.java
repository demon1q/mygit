package tmall.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;


/**
 * 加载数据库连接类
 * @author soft01
 *
 */
public class JDBCUtil {
	private static DataSource dataSource = null;
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();
	
	static {
		Properties properties = new Properties();
		try {
			//properties.load(new FileInputStream("database.properties"));
			properties.load(JDBCUtil.class.getClassLoader().getResourceAsStream("database.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dataSource = BasicDataSourceFactory.createDataSource(properties);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取连接
	 */
	public static Connection getConnection() {
		Connection conn = threadLocal.get();
		if (conn == null) {
			try {
				conn = dataSource.getConnection();
				threadLocal.set(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	/**
	 * 关闭连接
	 */
	public static void closeConnection(Connection conn) {
		if (null != conn) {
			threadLocal.remove();
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

