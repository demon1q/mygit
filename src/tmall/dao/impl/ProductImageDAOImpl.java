package tmall.dao.impl;

import java.sql.SQLException;
import java.util.List;

import tmall.bean.Product;
import tmall.bean.ProductImage;
import tmall.dao.ProductImageDAO;

public class ProductImageDAOImpl implements ProductImageDAO {

	@Override
	public int save(ProductImage t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ProductImage t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ProductImage get(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String keyword) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProductImage> list() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductImage> listByPage(String keyword, int currentPage, int pageSize) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductImage> list(Product p, String type) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductImage> listByPage(Product p, String type, int currentPage, int pageSize) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}}
