package tmall.dao.impl;

import java.sql.SQLException;
import java.util.List;

import tmall.bean.User;
import tmall.dao.UserDAO;

public class UserDAOImpl implements UserDAO {

	@Override
	public int save(User t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User get(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String keyword) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> list() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> listByPage(String keyword, int currentPage, int pageSize) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}}
