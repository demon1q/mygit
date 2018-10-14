package tmall.dao;

import java.sql.SQLException;
import java.util.List;

import tmall.bean.Order;

public interface OrderDAO extends BasicDAO<Order>{
	/**
	 * 根据uid和订单状态查询各个用户的订单
	 * @param uid
	 * @param status
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Order> listByStatus(int uid,String status) throws SQLException;
	/**
	 * 根据uid和订单状态分页查询各个用户的订单
	 * @param keyword
	 * @param uid
	 * @param status
	 * @param currentPage
	 * @param pageSize
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Order> listByPage(String keyword,int uid,String status,int currentPage,int pageSize) throws SQLException;
}
