package com.study.springFramework.application.io.dto;

import com.study.springFramework.application.domain.Grade;
import com.study.springFramework.application.domain.Member;

public class MemberResponse {
	private Long id;
	private String name;
	private Grade grade;
	
	public MemberResponse() {}
	
	private MemberResponse(Long id, String name, Grade grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public static MemberResponse from(Member member) {
		return new MemberResponse(member.getId(), member.getName(), member.getGrade());
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
}
