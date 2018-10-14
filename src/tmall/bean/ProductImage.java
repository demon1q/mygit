package tmall.bean;

/*ProductImage产品图片
type表示类型，产品图片分单个图片和详情图片两种
*/
public class ProductImage {
	private int id;
	private String type;
	private Product product;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
