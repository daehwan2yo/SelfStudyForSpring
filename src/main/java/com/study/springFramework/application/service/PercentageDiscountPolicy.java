package com.study.springFramework.application.service;

import com.study.springFramework.application.domain.Member;
import com.study.springFramework.library.service.DiscountPolicy;

public class PercentageDiscountPolicy implements DiscountPolicy {
	@Override
	public int discount(Member member, int price) {
		if (member.isVip()) {
			return (int)(price * 0.5);
		}
		return (int)(price * 0.1);
	}
}
