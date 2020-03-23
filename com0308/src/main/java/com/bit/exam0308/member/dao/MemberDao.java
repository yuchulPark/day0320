package com.bit.exam0308.member.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.bit.exam0308.member.Member;

@Repository
public class MemberDao implements IMemberDao {
	private HashMap<String, Member> map;

	public MemberDao() {
		map = new HashMap<String, Member>();
	}
	@Override // database에 넣는거
	public Map<String, Member> memberInsert(Member member) {
		map.put(member.getId(), member);
		return map;
	}
	@Override
	public Member memberSelect(Member member) {
		Member mem = map.get(member.getId());
		return mem;
	}
	@Override
	public Member memberUpdate(Member member) {
		map.put(member.getId(), member);
		return map.get(member.getId());
	}
	@Override
	public Map<String, Member> memberDelete(Member member) {
		map.remove(member.getId());
		return map;
	}
}
