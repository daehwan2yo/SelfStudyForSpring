package com.study.springFramework.application.service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.study.springFramework.application.domain.Grade;
import com.study.springFramework.application.domain.Member;
import com.study.springFramework.application.domain.Orders;
import com.study.springFramework.application.io.dto.MemberRequest;
import com.study.springFramework.application.repository.MemoryMemberRepository;
import com.study.springFramework.application.repository.MemoryStore;
import com.study.springFramework.library.repository.MemberRepository;
import com.study.springFramework.library.service.OrdersService;

public class OrdersServiceTest {
	private OrdersService ordersService = new OrdersServiceImpl();
	private MemberRepository memberRepository = new MemoryMemberRepository(MemoryStore.getInstance());
	
	@Test
	void createOrder_BASIC() {
		// given
		Member fakeMember = Member.from(MemberRequest.from("FakeMember", Grade.BASIC));
		Long savedId = memberRepository.save(fakeMember);
		String itemName = "item";
		
		// when
		Orders order = ordersService.createOrder(fakeMember, itemName, 3000);
		
		// then
		assertThat(order.calculatePrice()).isEqualTo(2700);
	}
	
	@Test
	void createOrder_VIP() {
		// given
		Member fakeMember = Member.from(MemberRequest.from("FakeMember", Grade.VIP));
		Long savedId = memberRepository.save(fakeMember);
		String itemName = "item";
		
		// when
		Orders order = ordersService.createOrder(fakeMember, itemName, 3000);
		
		// then
		assertThat(order.calculatePrice()).isEqualTo(1500);
	}
}
