package com.study.springFramework.library.service;

import com.study.springFramework.application.domain.Member;
import com.study.springFramework.application.domain.Orders;

public interface OrdersService {
	Orders createOrder(Member member, String itemName, int itemPrice);
}
