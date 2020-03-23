package com.bit.exam0308.member.service;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit.exam0308.member.MemPhone;
import com.bit.exam0308.member.Member;
import com.bit.exam0308.member.dao.MemberDao;

// @Service³ª @Component¸¦ ½áµµµÊ
@Repository
public class MemberService implements IMemberService {
	@Autowired
	MemberDao dao;
	
	private void printMember(Member mem) {
		System.out.println("id : " + mem.getId() + "\t");
		System.out.println("pw : " + mem.getPw() + "\t");
		System.out.println("mail : " + mem.getMail() + "\t");
		
		List<MemPhone> memPhones = mem.getPhones();
		for(MemPhone mp : memPhones) {
			System.out.println("phones : " + mp.getPhone1() + " - " + mp.getPhone2() + " - " + mp.getPhone3());
		}
		System.out.println("age : " + mem.getAge() + "\t");
		System.out.println("adult : " + mem.isAdult() + "\t");
		System.out.println("gender : " + mem.getGender() + "\t");
		System.out.println("sports : " + Arrays.toString(mem.getSports()) + "\n");
	}
	
	private void printMembers(Map<String, Member> map) {
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
	
		while(iter.hasNext()) {
			String key = iter.next();
			Member mem = map.get(key);
			printMember(mem);
		}
	}
	@Override
	public void memberRegister(Member member) {
		printMembers(dao.memberInsert(member));
	}

	@Override
	public void memberSearch(Member member) {
		printMember(dao.memberSelect(member));
	}

	@Override
	public Member[] memberModify(Member member) {
		Member memBefore = dao.memberSelect(member);
		Member memAfter = dao.memberUpdate(member);
		printMember(memAfter);
		return new Member[] {memBefore, memAfter};
	}
	@Override
	public void memberRemove(Member member) {
		printMembers(dao.memberDelete(member));
	}
}
