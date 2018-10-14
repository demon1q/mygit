package tmall.dao;

import java.sql.SQLException;
import java.util.List;


public interface BasicDAO<T> {
	public abstract int save(T t) throws SQLException;
	public abstract int remove(int id) throws SQLException;
	public abstract int update(T t) throws SQLException;
	public abstract T get(int id) throws SQLException;
	/**
	 * 获取总数
	 * @param keyword
	 * @return
	 * @throws SQLException
	 */
	public abstract int count(String keyword) throws SQLException;
	/**
	 * 查询所有
	 * @return
	 * @throws SQLException
	 */
	public abstract List<T> list() throws SQLException;
	/**
	 * 分页查询
	 * @param keyword 模糊查询 关键字
	 * @param currentPage 当前页码
	 * @param pageSize 每页条数
	 * @return 当前页列表
	 * @throws SQLException
	 */
	public abstract List<T> listByPage(String keyword,int currentPage,int pageSize) throws SQLException;
}
