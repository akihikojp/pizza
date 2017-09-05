package jp.co.rakus.ecommerce_b.controller.form;

/**
 * 商品のフォーム
 * 
 * @author akihiko.yahiro 
 * 
 */
public class ItemForm {

	/** 商品id */
	private String id;
	/** 商品名 */
	private String name;
	/** 商品説明 */
	private String description;
	/** 商品M価格 */
	private String priceM;
	/** 商品L価格 */
	private String priceL;
	/** 商品の画像 */
	private String imagePath;
	/** 削除フラグ */
	private String deleted;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPriceM() {
		return priceM;
	}
	public void setPriceM(String priceM) {
		this.priceM = priceM;
	}
	public String getPriceL() {
		return priceL;
	}
	public void setPriceL(String priceL) {
		this.priceL = priceL;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getDeleted() {
		return deleted;
	}
	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}
