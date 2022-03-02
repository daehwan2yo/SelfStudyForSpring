package com.study.springFramework.application.domain;

import com.study.springFramework.application.io.dto.MemberRequest;

public class Member {
	private Long id;
	private String name;
	private Grade grade;
	
	public Member(String name, Grade grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public static Member from(MemberRequest memberRequest) {
		return new Member(memberRequest.getName(), memberRequest.getGrade());
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Grade getGrade() {
		return grade;
	}
	
	public boolean isVip() {
		return this.grade == Grade.VIP;
	}
}
