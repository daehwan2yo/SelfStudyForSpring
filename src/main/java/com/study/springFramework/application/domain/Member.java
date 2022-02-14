package com.study.springFramework.application.domain;

public class Member {
    private Long id;
    private String name;
    private Grade grade;

    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public Grade getGrade() {
        return grade;
    }
}
