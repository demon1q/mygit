package tmall.dao;

import java.sql.SQLException;
import java.util.List;

import tmall.bean.Product;

public interface ProductDAO extends BasicDAO<Product>{
	/**
	 * 根据不同分类查询商品个数
	 * @param keyword
	 * @param cid
	 * @return
	 * @throws SQLException
	 */
	public abstract int count(String keyword,int cid) throws SQLException;
	/**
	 * 根据不同分类查询商品
	 * @param keyword
	 * @param cid
	 * @param currentPage
	 * @param pageSize
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Product> list(String keyword,int cid) throws SQLException;
	/**
	 * 根据不同分类分页查询商品
	 * @param keyword
	 * @param cid
	 * @param currentPage
	 * @param pageSize
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Product> list(String keyword,int cid,int currentPage,int pageSize) throws SQLException;
}
