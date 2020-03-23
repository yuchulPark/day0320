package com.bit.exam0308.member.service;

import com.bit.exam0308.member.Member;

public interface IMemberService {
	void memberRegister(Member member); // 회원을 등록
	void memberSearch(Member member); // 회원을 검색
	Member[] memberModify(Member member); // 회원을 수정
	void memberRemove(Member member); // 회원을 삭제
}
