package com.study.springFramework.application.service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.study.springFramework.application.domain.Grade;
import com.study.springFramework.application.domain.Member;
import com.study.springFramework.application.io.dto.MemberRequest;
import com.study.springFramework.application.io.dto.MemberResponse;
import com.study.springFramework.application.repository.MemoryMemberRepository;
import com.study.springFramework.application.repository.MemoryStore;
import com.study.springFramework.library.repository.MemberRepository;
import com.study.springFramework.library.service.MemberService;

public class MemberServiceTest {
	private MemberService memberService;
	private MemberRepository memberRepository;
	
	@BeforeEach
	void init() {
		memberRepository = new MemoryMemberRepository(MemoryStore.getInstance());
		memberService = new MemberServiceImpl(memberRepository);
	}
	
	@Test
	void 회원생성() {
		// when
		Long fakeMemberId = memberService.join(MemberRequest.from("FakeMember", Grade.BASIC));
		
		// then
		Member foundMember = memberRepository.findById(fakeMemberId)
											 .get();
		assertThat(foundMember.getId()).isEqualTo(fakeMemberId);
		assertThat(foundMember.getName()).isEqualTo("FakeMember");
	}
	
	@Test
	void 회원조회() {
		// given
		Long fakeMember = memberRepository.save(Member.from(MemberRequest.from("FakeMember", Grade.BASIC)));
		
		// when
		MemberResponse memberResponse = memberService.find(fakeMember);
		
		// then
		assertThat(memberResponse.getId()).isEqualTo(fakeMember);
		assertThat(memberResponse.getName()).isEqualTo("FakeMember");
	}
}
