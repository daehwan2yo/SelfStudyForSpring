package com.study.springFramework.application.service;

import com.study.springFramework.application.domain.Member;
import com.study.springFramework.application.io.dto.MemberRequest;
import com.study.springFramework.application.io.dto.MemberResponse;
import com.study.springFramework.application.repository.MemoryMemberRepository;
import com.study.springFramework.application.repository.MemoryStore;
import com.study.springFramework.library.repository.MemberRepository;
import com.study.springFramework.library.service.MemberService;

public class MemberServiceImpl implements MemberService {
	private final MemberRepository memberRepository;
	
	public MemberServiceImpl(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}
	
	@Override
	public Long join(MemberRequest memberRequest) {
		return memberRepository.save(Member.from(memberRequest));
	}
	
	@Override
	public MemberResponse find(Long memberId) {
		return MemberResponse.from(memberRepository.findById(memberId)
												   .orElseThrow(IllegalAccessError::new));
	}
}
