package com.study.springFramework.application.ui.dto;

public class MemberRequest {
    private String name;

    public MemberRequest() {
    }

    private MemberRequest(String name) {
        this.name = name;
    }

    public static MemberRequest from(String name) {
        return new MemberRequest(name);
    }
}
