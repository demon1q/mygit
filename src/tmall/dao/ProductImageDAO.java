package tmall.dao;

import java.sql.SQLException;
import java.util.List;

import tmall.bean.Product;
import tmall.bean.ProductImage;

public interface ProductImageDAO extends BasicDAO<ProductImage>{
	/**
	 * 根据商品和图片类型
	 * @param p
	 * @param type
	 * @return
	 * @throws SQLException
	 */
	public abstract List<ProductImage> list(Product p, String type) throws SQLException;
	/**
	 * 根据商品和图片类型分页查询
	 * @param p
	 * @param type
	 * @param currentPage
	 * @param pageSize
	 * @return
	 * @throws SQLException
	 */
	public abstract List<ProductImage> listByPage(Product p, String type,int currentPage,int pageSize) throws SQLException;

}
