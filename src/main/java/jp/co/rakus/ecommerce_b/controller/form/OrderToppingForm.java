package jp.co.rakus.ecommerce_b.controller.form;

import java.util.List;

import jp.co.rakus.ecommerce_b.domain.Topping;

/**
 * OrderToppingForm(注文トッピングのフォーム)
 * 
 * @author yahiro
 *
 */
public class OrderToppingForm {

	/** 注文トッピングのid */
	private String id;
	/** トッピングと対応するid */
	private String toppingId;
	/** OrderItem(注文商品)と対応するid */
	private String orderItemId;
	/** トッピングのリスト */
	private List<Topping> topping;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getToppingId() {
		return toppingId;
	}

	public void setToppingId(String toppingId) {
		this.toppingId = toppingId;
	}

	public String getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	public List<Topping> getTopping() {
		return topping;
	}

	public void setTopping(List<Topping> topping) {
		this.topping = topping;
	}

}
