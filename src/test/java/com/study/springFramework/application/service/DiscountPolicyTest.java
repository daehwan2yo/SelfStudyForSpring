package com.study.springFramework.application.service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.study.springFramework.application.domain.Grade;
import com.study.springFramework.application.domain.Member;
import com.study.springFramework.application.io.dto.MemberRequest;
import com.study.springFramework.library.service.DiscountPolicy;

public class DiscountPolicyTest {
	private DiscountPolicy discountPolicy = new PercentageDiscountPolicy();
	
	@Test
	void BASIC_할인() {
		// given
		Member basicMember = Member.from(MemberRequest.from("FakeMember", Grade.BASIC));
		
		// when/then
		assertThat(discountPolicy.discount(basicMember, 1000)).isEqualTo(900);
	}
	
	@Test
	void VIP_할인() {
		// given
		Member basicMember = Member.from(MemberRequest.from("FakeMember", Grade.VIP));
		
		// when/then
		assertThat(discountPolicy.discount(basicMember, 1000)).isEqualTo(500);
	}
}
