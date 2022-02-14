package com.study.springFramework.factory;

import com.study.springFramework.application.domain.Grade;
import com.study.springFramework.application.domain.Member;

public class EntityFactory {
    public static Member createFakeMember() {
        return Member.of(1L, "홍길동", Grade.BASIC);
    }
}
