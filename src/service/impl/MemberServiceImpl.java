package service.impl;

import java.util.List;

import dao.impl.MemberDaoImpl;
import model.Member;
import service.MemberService;

public class MemberServiceImpl implements MemberService{

	public static void main(String[] args) {
		
	}
	
	private static MemberDaoImpl mdi = new MemberDaoImpl();

	@Override
	public Member Login(String username, String password) { //成員登入
		List<Member> l = mdi.selectMember(username, password);
		Member m = null;
		if(l.size()!=0) 
		{
			m = l.get(0);
		}
		return m;
	}
	
	@Override
	public boolean findByAccount(String account) { //看帳號有沒有重覆
		List<Member> l = mdi.selectByAccount(account);
		boolean x = false;
		if(l.size()!=0) 
		{
			x = true;
		}
		
		return x;
	}

	@Override
	public void addMember(Member m) { //新增會員
		mdi.add(m);
			
	}

}
