package com.study.springFramework.application.domain;

public class Orders {
	private Long memberId;
	private String itemName;
	private int itemPrice;
	private int discountPrice;
	
	public Orders() {}
	
	private Orders(Long memberId, String itemName, int itemPrice, int discountPrice) {
		this.memberId = memberId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.discountPrice = discountPrice;
	}
	
	public static Orders from(Long memberId, String itemName, int itemPrice, int discountPrice) {
		return new Orders(memberId, itemName, itemPrice, discountPrice);
	}
	
	public int calculatePrice() {
		return itemPrice - discountPrice;
	}
	
	public Long getMemberId() {
		return memberId;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public int getItemPrice() {
		return itemPrice;
	}
	
	public int getDiscountPrice() {
		return discountPrice;
	}
	
	@Override
	public String toString() {
		return "Orders{" + "memberId=" + memberId + ", itemName='" + itemName + '\'' + ", itemPrice=" + itemPrice
			+ ", discountPrice=" + discountPrice + '}';
	}
}
