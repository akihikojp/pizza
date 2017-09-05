package jp.co.rakus.ecommerce_b.domain;

/**
 * 商品のドメイン
 * 
 * @author akihiko.yahiro 
 */
public class Item {

	/** 商品id */
	private Integer id;
	/** 商品名 */
	private String name;
	/** 商品説明 */
	private String description;
	/** 商品M価格 */
	private Integer priceM;
	/** 商品L価格 */
	private Integer priceL;
	/** 商品の画像 */
	private String imagePath;
	/** 削除フラグ */
	private Boolean deleted;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Integer getPriceM() {
		return priceM;
	}

	public void setPriceM(Integer priceM) {
		this.priceM = priceM;
	}

	public Integer getPriceL() {
		return priceL;
	}

	public void setPriceL(Integer priceL) {
		this.priceL = priceL;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

}