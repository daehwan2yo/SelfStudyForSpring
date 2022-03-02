package com.study.springFramework.application.repository;

import java.util.Optional;

import com.study.springFramework.application.domain.Member;
import com.study.springFramework.library.repository.MemberRepository;

public class MemoryMemberRepository implements MemberRepository {
	private final MemoryStore<Member> memberStore;
	
	public MemoryMemberRepository(MemoryStore memberStore) {
		this.memberStore = memberStore;
	}
	
	@Override
	public Long save(Member member) {
		member.setId(memberStore.getCurrentId());
		return memberStore.put(member);
	}
	
	@Override
	public Optional<Member> findById(Long id) {
		return Optional.ofNullable(memberStore.find(id));
	}
}
