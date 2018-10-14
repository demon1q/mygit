package tmall.dao.impl;

import java.sql.SQLException;
import java.util.List;

import tmall.bean.Order;
import tmall.dao.OrderDAO;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public int save(Order t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Order t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order get(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String keyword) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Order> list() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> listByPage(String keyword, int currentPage, int pageSize) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> listByStatus(int uid, String status) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> listByPage(String keyword, int uid, String status, int currentPage, int pageSize)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}}
