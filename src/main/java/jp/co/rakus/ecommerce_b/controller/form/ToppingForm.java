package jp.co.rakus.ecommerce_b.controller.form;

/**
 *  トッピングのフォーム
 *  
 * @author akihiko.yahiro
 * 
 */
public class ToppingForm {
	
	/**トッピングのid*/
	private String id;
	/**トッピング名*/
	private String name;
	/**Mサイズの価格*/
	private String priceM;
	/**Lサイズの価格*/
	private String priceL;
	
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
	
	
}
