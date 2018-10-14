package tmall.dao.impl;

import java.sql.SQLException;
import java.util.List;

import tmall.bean.Category;
import tmall.dao.CategoryDAO;

public class CategoryDAOImpl implements CategoryDAO{

	@Override
	public int save(Category t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Category t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Category get(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String keyword) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Category> list() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> listByPage(String keyword, int currentPage, int pageSize) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}}
