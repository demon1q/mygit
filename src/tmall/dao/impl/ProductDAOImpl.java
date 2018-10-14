package tmall.dao.impl;

import java.sql.SQLException;
import java.util.List;

import tmall.bean.Product;
import tmall.dao.ProductDAO;

public class ProductDAOImpl implements ProductDAO{

	@Override
	public int save(Product t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Product t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product get(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String keyword) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Product> list() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> listByPage(String keyword, int currentPage, int pageSize) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String keyword, int cid) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Product> list(String keyword, int cid) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> list(String keyword, int cid, int currentPage, int pageSize) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}}
