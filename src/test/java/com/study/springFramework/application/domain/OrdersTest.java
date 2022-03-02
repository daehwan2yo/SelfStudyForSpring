package com.study.springFramework.application.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OrdersTest {
	@Test
	void calculatePrice() {
		// given
		Orders order = Orders.from(1L, "item", 3000, 500);
		
		// when / then
		assertThat(order.calculatePrice()).isEqualTo(2500);
	}
}
