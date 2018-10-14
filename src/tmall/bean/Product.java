package tmall.bean;

import java.util.Date;
import java.util.List;

/*Product产品
name: 产品名称
subTitle: 小标题
orignalPrice: 原始价格
promotePrice: 优惠价格
stock: 库存
createDate: 创建日期
本表的外键cid，指向分类表的id字段*/

public class Product {
	private int id;
	private String name;
	private String subTitle;
	private double originalPrice;
	private double promotePrice;
	private int stock;
	private Date createDate;
	private Category category;
	private ProductImage defaultProductImage;// 默认显示的图片
	private List<ProductImage> productImages;
	private List<ProductImage> productSingleImages;// 单张图片
	private List<ProductImage> productDetailImages;// 详细图片
	private List<Review> reviews;// 评价集合
	private int reviewCount;// 累计评价数量
	private int saleCount;// 销售数量

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

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public double getPromotePrice() {
		return promotePrice;
	}

	public void setPromotePrice(double promotePrice) {
		this.promotePrice = promotePrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public ProductImage getDefaultProductImage() {
		return defaultProductImage;
	}

	public void setDefaultProductImage(ProductImage defaultProductImage) {
		this.defaultProductImage = defaultProductImage;
	}

	public List<ProductImage> getProductImages() {
		return productImages;
	}

	public void setProductImages(List<ProductImage> productImages) {
		this.productImages = productImages;
	}

	public List<ProductImage> getProductSingleImages() {
		return productSingleImages;
	}

	public void setProductSingleImages(List<ProductImage> productSingleImages) {
		this.productSingleImages = productSingleImages;
	}

	public List<ProductImage> getProductDetailImages() {
		return productDetailImages;
	}

	public void setProductDetailImages(List<ProductImage> productDetailImages) {
		this.productDetailImages = productDetailImages;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	public int getSaleCount() {
		return saleCount;
	}

	public void setSaleCount(int saleCount) {
		this.saleCount = saleCount;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

}
