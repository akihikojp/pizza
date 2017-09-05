package jp.co.rakus.ecommerce_b.controller.form;

import java.util.List;

import jp.co.rakus.ecommerce_b.domain.Item;
import jp.co.rakus.ecommerce_b.domain.OrderTopping;

/**
 * OrderItemForm(注文商品のフォーム)
 * 
 * @author yahiro
 *
 */
public class OrderItemForm {

	/** 注文商品のid */
	private String id;
	/** 商品のid */
	private String itemId;
	/** 注文のid */
	private String orderId;
	/** 数量 */
	private String quantity;
	/** サイズ */
	private String size;
	/** 商品 */
	private Item item;
	/** 注文トッピングリスト */
	private List<OrderTopping> orderToppingList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public List<OrderTopping> getOrderToppingList() {
		return orderToppingList;
	}

	public void setOrderToppingList(List<OrderTopping> orderToppingList) {
		this.orderToppingList = orderToppingList;
	}

}
