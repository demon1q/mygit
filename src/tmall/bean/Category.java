package tmall.bean;

import java.util.List;

/*Category分类
name:分类类名
List<Product> products:首页竖状导航的分类名称的集合
List<List<Product>> productsByRow:首页竖状导航的分类名称右边显示产品列表
							一个分类会对应多行产品，而一行产品里又有多个产品记录
*/
public class Category {
	private int id;
	private String name;
	private List<Product> products;
	private List<List<Product>> productsByRow;
	
	public Category() {
		super();
	}

	public Category(int id, String name, List<Product> products, List<List<Product>> productsByRow) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
		this.productsByRow = productsByRow;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<List<Product>> getProductsByRow() {
		return productsByRow;
	}

	public void setProductsByRow(List<List<Product>> productsByRow) {
		this.productsByRow = productsByRow;
	}

	@Override
	public String toString() {
		return "Category [name=" + name + "]";
	}
	
	
}
