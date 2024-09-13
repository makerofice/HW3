package service;

import model.Member;

public interface MemberService {
	Member Login(String account,String password); 
	boolean findByAccount(String account);
	void addMember(Member m);

}