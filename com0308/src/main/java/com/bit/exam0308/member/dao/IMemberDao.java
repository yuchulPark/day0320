package com.bit.exam0308.member.dao;

import java.util.Map;

import com.bit.exam0308.member.Member;

public interface IMemberDao {
	Map<String, Member> memberInsert(Member member);
	Member memberSelect(Member member);
	Member memberUpdate(Member member);
	Map<String, Member> memberDelete(Member member);
}
