package jp.co.rakus.ecommerce_b.domain;

import java.util.List;

/**
 * OrderToppingDomain(注文トッピングのドメイン)
 * 
 * @author yahiro
 *
 */
public class OrderTopping {

	/** 注文トッピングのid */
	private Integer id;
	/** トッピングと対応するid */
	private Integer toppingId;
	/** OrderItem(注文商品)と対応するid */
	private Integer orderItemId;
	/** トッピングのリスト */
	private List<Topping> topping;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getToppingId() {
		return toppingId;
	}

	public void setToppingId(Integer toppingId) {
		this.toppingId = toppingId;
	}

	public Integer getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}

	public List<Topping> getTopping() {
		return topping;
	}

	public void setTopping(List<Topping> topping) {
		this.topping = topping;
	}

}
