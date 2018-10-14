package tmall.dao.impl;

import java.sql.SQLException;
import java.util.List;

import tmall.dao.OrderItemDAO;

public class OrderItemDAOImpl implements OrderItemDAO {

	@Override
	public int save(OrderItemDAO t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(OrderItemDAO t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public OrderItemDAO get(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String keyword) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<OrderItemDAO> list() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderItemDAO> listByPage(String keyword, int currentPage, int pageSize) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderItemDAO> listByUser(int uid) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderItemDAO> listByUserByPage(int uid, int currentPage, int pageSize) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderItemDAO> listByOrder(int uid) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderItemDAO> listByOrderByPage(int uid, int currentPage, int pageSize) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}}
