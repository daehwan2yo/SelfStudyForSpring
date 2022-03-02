package com.study.springFramework.library.service;

import com.study.springFramework.application.io.dto.MemberRequest;
import com.study.springFramework.application.io.dto.MemberResponse;

public interface MemberService {
	Long join(MemberRequest memberRequest);
	
	MemberResponse find(Long memberId);
}
