package com.study.springFramework.application.io.dto;

import com.study.springFramework.application.domain.Grade;

public class MemberRequest {
	private String name;
	private Grade grade;
	
	public MemberRequest() {}
	
	private MemberRequest(String name, Grade grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public static MemberRequest from(String name, Grade grade) {
		return new MemberRequest(name, grade);
	}
	
	public String getName() {
		return name;
	}
	
	public Grade getGrade() {
		return grade;
	}
}
