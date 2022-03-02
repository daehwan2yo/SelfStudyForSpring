package com.study.springFramework.library.service;

import com.study.springFramework.application.domain.Member;

public interface DiscountPolicy {
	int discount(Member member, int price);
}
