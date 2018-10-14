package tmall.dao.impl;

import java.sql.SQLException;
import java.util.List;

import tmall.bean.Review;
import tmall.dao.ReviewDAO;

public class ReviewDAOImpl implements ReviewDAO{

	@Override
	public int save(Review t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Review t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Review get(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String keyword) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Review> list() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> listByPage(String keyword, int currentPage, int pageSize) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String keyword, int pid) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Review> listByPage(String keyword, int pid, int currentPage, int pageSize) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}}
