package tmall.dao;

import java.sql.SQLException;

import tmall.bean.User;

public interface UserDAO extends BasicDAO<User> {
	/**
	 * 根据姓名查找User对象
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	public abstract User get(String name) throws SQLException;
}
