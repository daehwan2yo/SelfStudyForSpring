package com.study.springFramework.application.domain;

public class Member {
    private Long id;
    private String name;
    private Grade grade;

    private Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public static Member of(Long id, String name, Grade grade) {
        return new Member(id, name, grade);
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
    
    public boolean isVip() {
        return grade == Grade.VIP;
    }
    
    
}
