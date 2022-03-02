package com.study.springFramework.application.service;

import com.study.springFramework.application.domain.Member;
import com.study.springFramework.application.domain.Orders;
import com.study.springFramework.library.service.DiscountPolicy;
import com.study.springFramework.library.service.OrdersService;

public class OrdersServiceImpl implements OrdersService {
	private DiscountPolicy discountPolicy = new PercentageDiscountPolicy();
	
	@Override
	public Orders createOrder(Member member, String itemName, int itemPrice) {
		return Orders.from(member.getId(), itemName, itemPrice, discountPolicy.discount(member, itemPrice));
	}
}
