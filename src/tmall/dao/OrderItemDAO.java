package tmall.dao;

import java.sql.SQLException;
import java.util.List;

public interface OrderItemDAO extends BasicDAO<OrderItemDAO> {
	/**
	 * 根据用户查询订单项
	 * @param uid
	 * @return
	 * @throws SQLException
	 */
	public abstract List<OrderItemDAO> listByUser(int uid) throws SQLException;
	/**
	 * 根据用户分页查询账单项
	 * @param uid
	 * @param currentPage
	 * @param pageSize
	 * @return
	 * @throws SQLException
	 */
	public abstract List<OrderItemDAO> listByUserByPage(int uid,int currentPage,int pageSize) throws SQLException;
	/**
	 * 根据订单查询订单项
	 * @param uid
	 * @return
	 * @throws SQLException
	 */
	public abstract List<OrderItemDAO> listByOrder(int uid) throws SQLException;
	/**
	 * 根据订单分页查询订单项
	 * @param uid
	 * @param currentPage
	 * @param pageSize
	 * @return
	 * @throws SQLException
	 */
	public abstract List<OrderItemDAO> listByOrderByPage(int uid,int currentPage,int pageSize) throws SQLException;
}
