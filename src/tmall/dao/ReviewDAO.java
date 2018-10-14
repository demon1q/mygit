package tmall.dao;

import java.sql.SQLException;
import java.util.List;

import tmall.bean.Review;

public interface ReviewDAO extends BasicDAO<Review> {
	/**
	 * 根据不同商品查询评价数
	 * @param keyword
	 * @param pid
	 * @return
	 * @throws SQLException
	 */
	public abstract int count(String keyword,int pid) throws SQLException;
	/**
	 * 根据不同商品分页查询
	 * @param keyword
	 * @param pid
	 * @param currentPage
	 * @param pageSize
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Review> listByPage(String keyword,int pid,int currentPage,int pageSize) throws SQLException;
}
