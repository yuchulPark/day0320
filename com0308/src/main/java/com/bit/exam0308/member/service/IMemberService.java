package com.bit.exam0308.member.service;

import com.bit.exam0308.member.Member;

public interface IMemberService {
	void memberRegister(Member member); // ȸ���� ���
	void memberSearch(Member member); // ȸ���� �˻�
	Member[] memberModify(Member member); // ȸ���� ����
	void memberRemove(Member member); // ȸ���� ����
}
